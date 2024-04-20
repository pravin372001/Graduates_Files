public class FlightDTO {
    private String flightName;
    private String flightBrand;
    private String flightType;
    private int capcity;
    private int price;
    private static int flightCount = 0;

    public FlightDTO(String flightName, String flightBrand, String flightType, int capcity, int price) {
        this.flightName = flightName;
        this.flightBrand = flightBrand;
        this.flightType = flightType;
        this.capcity = capcity;
        this.price = price;
        flightCount++;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightBrand() {
        return flightBrand;
    }

    public void setFlightBrand(String flightBrand) {
        this.flightBrand = flightBrand;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public int getCapcity() {
        return capcity;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getFlightCount() {
        return flightCount;
    }

    public static void setFlightCount(int flightCount) {
        FlightDTO.flightCount = flightCount;
    }

}
