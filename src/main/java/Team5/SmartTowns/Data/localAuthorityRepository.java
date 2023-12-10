package Team5.SmartTowns.Data;

import java.util.List;

public interface localAuthorityRepository {
    List<localAuthority> getAllLocalAuthority();

    void addLocalAuthority(localAuthority loc);
}
