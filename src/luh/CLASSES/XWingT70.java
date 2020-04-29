package luh.CLASSES;

import luh.ENUMS.XEngine;
import luh.ENUMS.XModel;
import luh.ENUMS.XSensor;
import luh.ENUMS.XWeapon;
import luh.SUPPORT.Location;

public class XWingT70 extends XWingFighter{

    static final long serialVersionUID = 1L;

    public Location getPos() {
        return pos;
    }

    public void setPos(Location pos) {
        this.pos = pos;
    }

    private Location pos;
    XWeapon tertiaryWeapon;

    public XWeapon getTertiaryWeapon() {
        return tertiaryWeapon;
    }

    public XWingT70(String fighterID, XWeapon tertiaryWeapon) {
        super(fighterID, XModel.T70, 12.49, 11.6, 1.92, 10.8,
                3800, XSensor.ANq5v8, XEngine.FTE5L5, XWeapon.KX12, XWeapon.MG7A);
        this.tertiaryWeapon = XWeapon.AX190;
    }

    public void displayT70Location() {
        System.out.printf(
                "^^^^^T70^^^^^%n" +
                "[X:%d, Y:%d]%n", pos.getX(), pos.getY());
    }

    @Override
    public void displayFighterSpecs() {
        System.out.printf(
                "^^^^^T70^^^^^%n" +
                "MODEL: T70%n" +
                "Fighter ID: %s%n" +
                "Length: %.1f%n" +
                "Width: %.1f%n" +
                "Height: %.1f%n" +
                "Mass: %.1f%n" +
                "Engine: %s%n" +
                "Sensors: %s%n" +
                "Laser Cannons: %s%n" +
                "Heavy Laser Cannons: %s%n" +
                "Torpedo Launcher: %s%n" +
                "^^^^^^^^^^^^^%n",
                this.getFighterID(),
                this.getFLength(),
                this.getFWidth(),
                this.getFHeight(),
                this.getFMass(),
                this.getFEngines().getEngineType(),
                this.getFSensors().getSensorType(),
                this.getFPrimaryWpns().getWeaponType(),
                this.getFSecondaryWpns().getWeaponType(),
                this.getTertiaryWeapon().getWeaponType());
    }

    @Override
    public double costToBuild() {
        return (this.getFighterModel().getModelCost() * 1.5) + this.getFEngines().getEngineCost() +
                this.getFSensors().getSensorCost() + this.getFPrimaryWpns().getWeaponCost() +
                this.getFSecondaryWpns().getWeaponCost() + this.getTertiaryWeapon().getWeaponCost();
    }

}
