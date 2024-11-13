import {apiKey} from "./environment";


const gameWindow = document.getElementById('game-window');
gameWindow.src = setGoogleMapsUrl();
function setGoogleMapsUrl() {
    return `https://www.google.com/maps/embed/v1/place?key=${apiKey}&q=Space+Needle,Seattle+WA`;
}