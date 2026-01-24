    document.addEventListener('DOMContentLoaded', () => {
      const container = document.createElement('div');
      container.className = 'header-images';
      
      ['../img/header/runes3.png', '../img/header/runes2.png', '../img/header/runes3.png'].forEach((src, idx) => {
        const img = new Image();
        img.src = src;
        img.id = `img${idx+1}`;
        container.appendChild(img);
      });

      document.getElementById('header').appendChild(container);

      const imgs = Array.from(document.querySelectorAll('.header-images img'));
      let currentIndex = 0;

      for(let i = 0; i < imgs.length; i++) {
        if(i !== currentIndex) imgs[i].style.opacity = 0;
      }

      setInterval(() => {
        imgs[currentIndex].style.opacity = 0;
        currentIndex = (currentIndex + 1) % imgs.length;
        imgs[currentIndex].style.opacity = 1;
      }, 3000);
    });