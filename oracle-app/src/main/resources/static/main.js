document.addEventListener('DOMContentLoaded', function() {
    fetch('components/header.html')
        .then(response => response.text())
        .then(data => document.getElementById('header').innerHTML = data)
        .catch(error => console.error('Ошибка:', error));
});

document.getElementById('dataForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Отменяем стандартную отправку формы

    const inputValue = document.getElementById('inputData').value.trim();

    if (!inputValue) {
        document.getElementById('output').innerHTML = '<span style="color: red;">Задайте вопрос, чтобы получить ответ...</span>';
    }
    else {    fetch('/day-prophecy', { // Предполагаемый путь вашей REST endpoint
        method: 'GET'
    }).then(response => response.text())
      .then(data => {
          console.log('Response:', data);
          document.getElementById('output').innerHTML = `${JSON.stringify(data)}`;
      })
      .catch(error => {
          console.error('Ошибка:', error.message);
          document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
      });}
});