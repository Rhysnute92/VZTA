package Team5.SmartTowns.business;

import java.util.List;

public interface businessRepository {
    List<business> getAllBusinesses();
    void addBusiness(business bus);
}
