/*AUTHOR: Gabriel Copat*/
package team5.smartTowns.rewards;

import lombok.Getter;


@Getter
public class Badge extends Reward {
    /* Badges can be earned by completing certain goals.
     * They are displayed in the user profile page
     *
     * For example, one might earn a badge after visiting 20 locations */
    static final String DEFAULT_IMAGE = "0.png";

    int difficulty; //1-5

    public Badge(int id, String name, String description, int difficulty) {
        super(id, name, description);
        this.difficulty = difficulty;
    }

    @Override
    public String getImgFolder() {
        return "badges";
    }
}
