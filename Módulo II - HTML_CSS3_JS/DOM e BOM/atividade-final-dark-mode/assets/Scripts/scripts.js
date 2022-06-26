const bodyPage = document.getElementsByTagName('body')[0]
const titlelH1 = document.getElementById('page-title')
const button = document.getElementById('mode-selector')
const footer = document.getElementById('footer-site')
const darkModeClass = 'dark-mode'

function changeClasses() {
    bodyPage.classList.toggle(darkModeClass)
    footer.classList.toggle(darkModeClass)
    button.classList.toggle(darkModeClass)
    titlelH1.classList.toggle(darkModeClass)
}

function changeButtunContent() {
    (button.className === darkModeClass) ? button.innerHTML = 'Light Mode' : button.innerHTML = 'Dark Mode';
}

function changeTitleContent() {
    (titlelH1.classList.contains(darkModeClass)) ? titlelH1.innerHTML = 'Dark Mode ON' : titlelH1.innerHTML = 'Light Mode ON';
}

function changePageMode() {
    changeClasses();
    changeButtunContent();
    changeTitleContent();
}

button.addEventListener('click', changePageMode) 


