// import Geo from "google.maps.GeocodingLibrary";
 //{apiKey} from "./environment.js";

//The API request may contain the following fields:
/*{
 address: string,
 location: LatLng,
 placeId: string,
 bounds: LatLngBounds,
 componentRestrictions: GeocoderComponentRestrictions,
 region: string
}*/

// let geoCoderRequest = {
//     "address": "1500 Pennsylvania Ave NW, Washington, DC 20229",
//     "region": "us"
// }
// google.maps.Geocoder(
//     geoCoderRequest;
//
//     addr=address{320 E Cascade Ave}
//     fetch(`https://maps.googleapis.com/maps/api/geocode/json?address=${encodeURIComponent(address)}&key=${apiKey}`
// )

const { Client } = require("@googlemaps/google-maps-services-js");
const {apiKey} = require("./environment.js");
const client = new Client({});
client.geocode( {
    params: {
        address: "1500 Pennsylvania Ave NW, Washington, DC 20229",
        key: apiKey
    },
    timeout: 1000
}).catch((error) => {
    console.log("Uhh ohh, an error occured: ", error)
}).then(res => {
    console.log("response: ", res);
});

// function printResponse(response) {
//     console.log(response);
// }
//
// const geocodeRequest = google.maps.Geocoder();
// geocodeRequest.geocode({
//     address: "1500 Pennsylvania Ave NW, Washington, DC 20229"
// },
//     printResponse);