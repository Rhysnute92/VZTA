//qr-script file - R Nute
import {Html5QrcodeScanner} from "html5-qrcode";
import {Html5Qrcode} from "html5-qrcode";
function domReady(fn){
    if (
        document.readyState === "complete" ||
        document.readyState === "interactive"
    ){
        setTimeout(fn, 1000);
    } else {
        document.addEventListener("DOMContentLoaded", fn);
    }
}
domReady(function (){
    //if QR code found
    function onQRSuccess(decodeText, decodeResult){
        alert("You have collected: " + decodeText, decodeResult);
    }
let htmlscanner = new Html5QrcodeScanner(
    "qr-code-reader",
    { fps: 10, qrbos: 250}
)
    htmlscanner.render(onQRSuccess);
});

