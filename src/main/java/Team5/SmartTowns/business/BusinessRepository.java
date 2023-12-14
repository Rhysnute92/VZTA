package Team5.SmartTowns.business;

import java.util.List;

public interface BusinessRepository {
    List<Business> getAllBusinesses();
    void addBusiness(Business bus);
}
