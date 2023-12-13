function updatePack(userid, packid) {
    /* Updates the trail being shown on screen to the one requested by ID */
    $.get("/packInfo/" + userid + "/" + packid).done(function (fragment) {
        let packRewardsWrapper = $("#packRewardsWrapper");

        packRewardsWrapper.fadeTo("slow", 0, function () {
            packRewardsWrapper.html(fragment)
            packRewardsWrapper.fadeTo("slow", 1);
        })
    });
}