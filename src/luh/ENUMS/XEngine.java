package luh.ENUMS;

public enum XEngine {

    CPG04Z("Novaldex","Cryogenic Power Generator",3700,8000),
    FTE5L5("Incom-FreiTek","Fusial Thrust Engine",3800,8750),
    FTE5L9("Incom-FreiTek","Fusial Thrust Engine",3925,9050);

    private String manufacturer;

    public String getEngineType() {
        return engineType;
    }

    private String engineType;
    private int powerOutput;

    public int getEngineCost() {
        return engineCost;
    }

    private int engineCost;

    XEngine(String manufacturer, String engineType, int powerOutput, int engineCost) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.powerOutput = powerOutput;
        this.engineCost = engineCost;
    }

}
