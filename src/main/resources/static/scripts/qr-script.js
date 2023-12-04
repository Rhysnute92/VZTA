//qr-script file - R Nute
//Modified from (https://www.geeksforgeeks.org/create-a-qr-code-scanner-or-reader-in-html-css-javascript/)
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
        // Open the result, what methods are available through the HTML5 Qr scanner node package?
        // Record the result, see above.
        // Get user and tie to user account, intergrate with database, retrieving and storing under user info.
    }
    let htmlscanner = new Html5QrcodeScanner(
    "qr-code-reader",
    { fps: 20, qrbos: 250}
    );
    htmlscanner.render(onScanSuccess);
});

