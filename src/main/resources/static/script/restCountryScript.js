require('dotenv').config();
const key = process.env.COUNTRY_LAYER_KEY;

fetch(`https://api.countrylayer.com/v2/all?access_key=${key}`, {
    method: 'GET',
    headers: {
        'Content-Type': 'application/json'
    }
}).then(response => {
    console.log(response);
})

