package Team5.SmartTowns.users;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewUser {


    @NotEmpty(message = "You must type in a username.")
    @NotNull
    String name;

    @NotEmpty(message = "You must type in a password.")
    @NotNull
    String password;

    @NotEmpty(message = "You must type in an email.")
    @NotNull
    String email;
}
