
//script for basic long/lat validation

function acceptanceValidation(){
    var pass=true;
    var lat = document.forms["adminCheckpointApproval"]["locationCoordsLat"].value
    var long = document.forms["adminCheckpointApproval"]["locationCoordsLong"].value
    if (lat=="") {
        alert('Invalid location inputted. \nPlease input a valid latitude.');
        pass = false;
    }
    if (long==""){
            alert('Invalid location inputted. \nPlease input a valid longitude.');
            pass = false;
        } return pass;
}