const bodyPage = document.getElementsByTagName('body')[0]
const titlelH1 = document.getElementById('page-title')
const button = document.getElementById('mode-selector')
const footer = document.getElementById('footer-site')

function changePageMode() {
    bodyPage.classList.toggle('dark-mode')
    footer.classList.toggle('dark-mode')
    button.classList.toggle('dark-mode')
    titlelH1.classList.toggle('dark-mode')

    changeButtunContent();
    changeTitleContent();
}

function changeButtunContent() {
    (button.className === 'dark-mode') ? button.innerHTML = 'Light Mode' : button.innerHTML = 'Dark Mode';
}

function changeTitleContent() {
    (titlelH1.className === 'dark-mode') ? titlelH1.innerHTML = 'Dark Mode ON' : titlelH1.innerHTML = 'Light Mode ON';
}

button.addEventListener('click', changePageMode) 


