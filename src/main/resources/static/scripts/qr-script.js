//qr-script file - R Nute

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
domReady(function (message){
    //if QR code found
    function onScanSuccess(decodeText, decodeResult){
        alert("You have collected: " + decodeText, decodeResult);
    }
    let htmlscanner = new Html5QrcodeScanner(
    "qr-code-reader",
    { fps: 20, qrbos: 250}
    );
    htmlscanner.render(onScanSuccess);
});

