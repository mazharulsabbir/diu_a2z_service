package edu.daffodilvarsity.a2zservice.helper;

public class ServiceHelper {
    String image, providerName,location;

    public ServiceHelper(String image, String providerName, String location) {
        this.image = image;
        this.providerName = providerName;
        this.location = location;
    }

    public ServiceHelper() {
    }

    public String getImage() {
        return image;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getLocation() {
        return location;
    }
}
