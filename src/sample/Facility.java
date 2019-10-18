package sample;

public class Facility {

    private String name;
    private String type;
    private String facilityNumber;
    private String authorityRequired;


    public Facility(String name, String type, String facilityNumber, String authorityRequired) {
        this.name = name;
        this.type = type;
        this.facilityNumber = facilityNumber;
        this.authorityRequired = authorityRequired;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFacilityNumber() {
        return facilityNumber;
    }

    public String getAuthorityRequired() {
        return authorityRequired;
    }

    @Override
    public String toString() {
        return "Facility Name: " + name + "\n Authority Required: " + authorityRequired + "\n";
    }
}
