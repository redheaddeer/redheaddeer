document.addEventListener('DOMContentLoaded', function() {
    const images = document.querySelectorAll('.header-images img');

    for (let i = 0; i < images.length; i++) {
        images[0].classList.remove('active');
        images[1].classList.remove('active');
        images[2].classList.remove('active');
        images[i].classList.add('active');
    }
});
