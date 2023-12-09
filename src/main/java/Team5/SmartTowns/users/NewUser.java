package Team5.SmartTowns.users;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewUser {


    @NotEmpty(message = "You must type in a username.")
    String name;

    @NotEmpty(message = "You must type in a password.")
    String password;

    @NotEmpty(message = "You must type in an email.")
    String email;
}
