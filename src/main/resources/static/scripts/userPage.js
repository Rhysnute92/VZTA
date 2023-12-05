function updatePack(userid, packid) {
    /* Updates the trail being shown on screen to the one requested by ID */
    $.get("/packInfo/" + userid + "/" + packid).done(function (fragment) {
        let stickerBox = $("#stickersBox");

        stickerBox.fadeTo("slow", 0, function () {
            stickerBox.html(fragment)
            stickerBox.fadeTo("slow", 1);
        })
    });
}