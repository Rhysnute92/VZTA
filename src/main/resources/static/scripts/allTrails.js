function updateOutputTrail(id) {
    /* Updates the trail being shown on screen to the one requested by ID */
    $.get("/allTrails/" + id).done(function (fragment) {
        $("#trailInfoBox").html(fragment)
    });
    updateSelectedTrail(id);
}
function updateSelectedTrail(id) {
    /* Updates the trail bar, so that it highlights the selected trail */
    let list = document.getElementsByClassName('trailsImages')
    for (let i = 0; i < list.length; i++) {
        if (list[i].classList.contains('selected')) {
            list[i].classList.remove('selected')
            break
        }
    }
    document.getElementById("img" + id).classList.add("selected")
}