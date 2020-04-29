package luh.ENUMS;

public enum XModel {

    T65B("Starfighter","Incom","Rebel Alliance",150000,"YR-1"),
    T70("Starfighter","Incom-FreiTek","Rebel Alliance",200000,"YR-5"),
    T85("Starfighter","Incom-FreiTek","Rebel Alliance",220000,"YR-25");

    private String role;
    private String manufacturer;
    private String nationality;

    public int getModelCost() {
        return modelCost;
    }

    private int modelCost;
    private String yearInService;


    XModel(String role, String manufacturer, String nationality, int modelCost, String yearInService) {
        this.role = role;
        this.manufacturer = manufacturer;
        this.nationality = nationality;
        this.modelCost = modelCost;
        this.yearInService = yearInService;
    }
}
