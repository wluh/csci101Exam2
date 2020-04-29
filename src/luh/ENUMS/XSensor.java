package luh.ENUMS;

public enum XSensor {

    ANs5D("Fabritech","Tracking",30,1200),
    ANq5v8("Fabritech","Tracking",42,1850),
    ANr1v3("Fabritech","Tracking",51,1975);

    private String manufacturer;

    public String getSensorType() {
        return sensorType;
    }

    private String sensorType;
    private int sensorRange;

    public int getSensorCost() {
        return sensorCost;
    }

    private int sensorCost;


    XSensor(String manufacturer, String sensorType, int sensorRange, int sensorCost) {
        this.manufacturer = manufacturer;
        this.sensorType = sensorType;
        this.sensorRange = sensorRange;
        this.sensorCost = sensorCost;
    }
}
