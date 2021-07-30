package enums;

public enum City {

    ISTANBUL("Istambul"),
    HONGKONG("Hong Kong"),
    DUBAI("Dubai");

    private final String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
