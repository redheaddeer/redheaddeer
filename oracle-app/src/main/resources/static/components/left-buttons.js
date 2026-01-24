document.getElementById('day-card').addEventListener('submit', function(event) {
    event.preventDefault(); // Отменяем стандартную отправку формы

   fetch('/day-prophecy', { // Предполагаемый путь вашей REST endpoint
        method: 'GET'
    }).then(response => response.text())
      .then(data => {
          console.log('Response:', data);
          document.getElementById('output').innerHTML = data;
      })
      .catch(error => {
          console.error('Ошибка:', error.message);
          document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
      });
});

document.getElementById('day-rune').addEventListener('submit', function(event) {
    event.preventDefault(); // Отменяем стандартную отправку формы

   fetch('/day-rune', { // Предполагаемый путь вашей REST endpoint
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