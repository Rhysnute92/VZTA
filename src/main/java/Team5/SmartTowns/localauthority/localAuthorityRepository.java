package Team5.SmartTowns.localauthority;

import java.util.List;

public interface localAuthorityRepository {
    List<localAuthority> getAllLocalAuthority();

    void addLocalAuthority(localAuthority loc);
}
