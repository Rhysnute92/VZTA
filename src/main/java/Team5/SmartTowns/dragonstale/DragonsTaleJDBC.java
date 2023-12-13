package Team5.SmartTowns.dragonstale;

import Team5.SmartTowns.users.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DragonsTaleJDBC implements DragonsTaleRepository{
    private JdbcTemplate jdbc;

    private RowMapper<User> userMapper;

    @Override
    public Map<Long, Boolean> getDTCompletion(int landmarkID){
        //Be conscious of sql injections here.
        String sql = "SELECT userid, trailID, completedOrNot FROM dtprogress WHERE landmarkID = ?";
        int dtQuery = jdbc.query(sql, landmarkID);
        //Query it twice to extract the given parameters, then use these parameters in a loop to query the completion.
        List<Map<String, Integer>> query = jdbc.query(sql, id);

        Map<Long, Boolean> dtProgress = new HashMap<>();
        for (Map<String, Object> result : dtQuery) {
            dtProgress.put((Long)result.get("stickerID"), (boolean)result.get("hasSticker"));
        }
        return dtProgress;
    }
}
