function updatePack(url) {
    /* Updates the trail being shown on screen */
    $.get(url).done(function (fragment) {
        let packRewardsWrapper = $("#packRewardsWrapper");

        packRewardsWrapper.fadeTo("slow", 0, function () {
            packRewardsWrapper.html(fragment)
            packRewardsWrapper.fadeTo("slow", 1);
        })
    });
}