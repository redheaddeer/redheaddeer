document.getElementById('btn-day-card').addEventListener('click', async () => {
    document.getElementById('output').innerHTML = "";
    let index = 0;
    const typingElement = document.getElementById('output');
    try {
        const response = await fetch('/day-prophecy', {method: 'GET'});
        const result = await response.text();
        document.getElementById('tarot-image').src = '/img/cards/Tarot.png';
        text = result;
        typeWriter();
    } catch (error) {
        console.error('Ошибка:', error.message);
        document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
    }

    // Функция для добавления следующего символа
    function typeWriter() {
      if (index < text.length) {
        typingElement.textContent += text.charAt(index);
        index++;
        setTimeout(typeWriter, 50); // задержка между появлением символов (можно регулировать)
      }
    }
});

document.getElementById('btn-day-rune').addEventListener('click', async () => {
    try {
        const response = await fetch('/rune-prophecy', {method: 'GET'});
        const result = await response.text();
        document.getElementById('output').innerHTML = result;
        document.getElementById('tarot-image').src = '/img/cards/Tarot.jpg';
    } catch (error) {
        console.error('Ошибка:', error.message);
        document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
    }
});