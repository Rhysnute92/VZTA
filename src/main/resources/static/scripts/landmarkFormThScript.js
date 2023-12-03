

    // verification function of the above form
    function landmarkFormValidation(){
    var pass=true;
    var trail = document.forms["landmarkSubmission"]["trailID"].value
    var location = document.forms["landmarkSubmission"]["landmarkLocation"].value
    var description = document.forms["landmarkSubmission"]["landmarkDescription"].value;
    var descriptionWrdCount=description.split(" ").length
    if (descriptionWrdCount>200){
    alert('Please keep your description to a maximum of 200 words.');
    pass = false;
}

    if (trail==0){ // values of 0 and "" used to ensure default drop down option isn't submittable
    alert('Invalid trail selected. \nPlease select the trail you wish to join.');
    pass = false;
}

    if (location==""){
    alert('Invalid location selected. \nPlease select the location you wish to join.');

    pass = false; // ensure correct trail is selected in accordance to the town it takes place in

} if ( (location=="Caerphilly" & (parseInt(trail/100)!==1)) ||
    (location=="Risca" & (parseInt(trail/100)!==2)) ||
    (location=="Penarth" & (parseInt(trail/100)!==3)) ){
    alert('Trail unavailable in your current location. \nPlease choose an available trail');
    pass = false;
}

    return pass;
}


