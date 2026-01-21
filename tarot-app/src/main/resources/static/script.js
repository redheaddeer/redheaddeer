document.getElementById('dataForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Отменяем стандартную отправку формы

    const inputValue = document.getElementById('inputData').value.trim();

    if (!inputValue) return alert('Необходимо ввести значение!');

    fetch('/day-prophecy', { // Предполагаемый путь вашей REST endpoint
        method: 'GET'
    }).then(response => response.text())
      .then(data => {
          console.log('Response:', data);
          document.getElementById('output').innerHTML = `${JSON.stringify(data)}`;
      })
      .catch(error => {
          console.error('Ошибка:', error.message);
          document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
      });
});