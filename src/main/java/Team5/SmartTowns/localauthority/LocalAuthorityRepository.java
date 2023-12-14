package Team5.SmartTowns.localauthority;

import java.util.List;

public interface LocalAuthorityRepository {
    List<LocalAuthority> getAllLocalAuthority();

    void addLocalAuthority(LocalAuthority loc);
}
