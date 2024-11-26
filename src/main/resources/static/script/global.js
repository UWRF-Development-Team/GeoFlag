
console.log('global.js loaded');
const gameWindow = document.getElementById('game-window');
// gameWindow.src = setGoogleMapsUrl();
// console.log(apiKey);
// function setGoogleMapsUrl() {
//     return `https://www.google.com/maps/embed/v1/place?key=${apiKey}&q=Space+Needle,Seattle+WA`;
// }
const darkModeButton = document.getElementById('dark-mode-button');
const body = document.getElementsByName('body')

darkModeButton.onclick = function() {
    if (body.classList.contains('dark-mode')) {
        body.classList.remove('dark-mode')
    }
    else {
        body.classList.add('dark-mode')
    }
}

