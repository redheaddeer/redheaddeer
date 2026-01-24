document.addEventListener('DOMContentLoaded', function() {
    fetch('components/header.html')
        .then(response => response.text())
        .then(data => document.getElementById('header').innerHTML = data)
        .catch(error => console.error('Ошибка:', error));

    fetch('components/left-buttons.html')
        .then(response => response.text())
        .then(data => document.getElementById('buttons-container').innerHTML = data)
        .catch(error => console.error('Ошибка:', error));

    fetch('components/popup.html')
        .then(response => response.text())
        .then(data => document.getElementById('header').innerHTML = data)
        .catch(error => console.error('Ошибка:', error));
});
