package Team5.SmartTowns.Data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class user {
    private int userId;
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
}