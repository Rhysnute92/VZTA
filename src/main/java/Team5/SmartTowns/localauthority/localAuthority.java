package Team5.SmartTowns.localauthority;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class localAuthority {
    private String localAuthorityName;
    private String address1;
    private String address2;
    private String city;
    private String county;
    private String postcode;

    @Override
    public String toString() {
        return "localAuthority{" +
                localAuthorityName + '\'' +
                address1 + '\'' +
                address2 + '\'' +
                city + '\'' +
                county + '\'' +
                postcode + '\'' +
                website +
                '}';
    }

    public String getLocalAuthorityName() {
        return localAuthorityName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getWebsite() {
        return website;
    }

    private String website;
}
