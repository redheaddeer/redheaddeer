document.getElementById('dataForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Отменяем стандартную отправку формы

    const inputValue = document.getElementById('inputData').value.trim();

    if (!inputValue) return alert('Необходимо ввести значение!');

    fetch('/api/data', { // Предполагаемый путь вашей REST endpoint
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ data: inputValue })
    }).then(response => response.json())
      .then(data => {
          console.log('Response:', data);
          document.getElementById('output').innerHTML = `<strong>Полученный ответ:</strong> ${JSON.stringify(data)}`;
      })
      .catch(error => {
          console.error('Ошибка:', error.message);
          document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
      });
});