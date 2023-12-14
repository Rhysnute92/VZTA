var getQR = function (){
    // document.getElementById("qrCodeScanner").style.cursor = "pointer";
    window.location.href = "/QRScan";
}

function toggleDropDown(){
    var dropdownList = document.getElementById("dropdownList");
    dropdownList.style.display = (dropdownList.style.display === "block") ? "none" : "block";
}

function routeToAllLandmarks(){
    window.location.href="/allDTLandmarks";
}