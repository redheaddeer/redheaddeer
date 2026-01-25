document.getElementById('btn-day-card').addEventListener('click', async () => {
    try {
        const response = await fetch('/day-prophecy', {method: 'GET'});
        const result = await response.text();
        document.getElementById('tarot-image').src = '/img/cards/Tarot.png';
        document.getElementById('output').innerHTML = result;
    } catch (error) {
        console.error('Ошибка:', error.message);
        document.getElementById('output').innerHTML = '<span style="color: red;">Ошибка отправки данных!</span>';
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