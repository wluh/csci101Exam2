package luh.ENUMS;

public enum XWeapon {

    KX9("KX9 Laser Cannon",4,"Taim&Bak",18,900),
    KX12("KX12 Laser Cannon",4,"Taim&Bak",21,990),
    KX14("KX14 Laser Cannon",4,"Taim&Bak",23,1250),
    MG7("MG7 Proton Torpedo Launcher",1,"Krupx",7,1100),
    MG7A("MG7A Proton Torpedo Launcher",1,"Krupx",10,1400),
    AX190("AX190 Heavy Laser Cannon",1,"Blas Tech",15,2700);

    public String getWeaponType() {
        return weaponType;
    }

    private String weaponType;
    private int numberOfWeapons;
    private String manufacturer;
    private int maximumRange;

    public int getWeaponCost() {
        return weaponCost;
    }

    private int weaponCost;

    XWeapon(String weaponType, int numberOfWeapons, String manufacturer, int maximumRange, int weaponCost) {
        this.weaponType = weaponType;
        this.numberOfWeapons = numberOfWeapons;
        this.manufacturer = manufacturer;
        this.maximumRange = maximumRange;
        this.weaponCost = weaponCost;
    }
}
