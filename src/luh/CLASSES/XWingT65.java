package luh.CLASSES;

import luh.ENUMS.XEngine;
import luh.ENUMS.XModel;
import luh.ENUMS.XSensor;
import luh.ENUMS.XWeapon;
import luh.SUPPORT.Location;

public class XWingT65 extends XWingFighter{

    static final long serialVersionUID = 1L;

    public Location getPos() {
        return pos;
    }

    public void setPos(Location pos) {
        this.pos = pos;
    }

    private Location pos;

    public XWingT65(String fighterID) {
        super(fighterID, XModel.T65B, 13.4, 11.6, 2.4, 13.4,
                3700, XSensor.ANq5v8, XEngine.CPG04Z, XWeapon.KX9, XWeapon.MG7);
    }

    public void displayT65Location() {
        System.out.printf(
                "+++++T65+++++%n" +
                "[X:%d, Y:%d]%n", pos.getX(), pos.getY());
    }

    @Override
    public void displayFighterSpecs() {
        System.out.printf(
                "+++++T65+++++%n" +
                "MODEL: T65%n" +
                "Fighter ID: %s%n" +
                "Length: %.1f%n" +
                "Width: %.1f%n" +
                "Height: %.1f%n" +
                "Mass: %.1f%n" +
                "Engine: %s%n" +
                "Sensors: %s%n" +
                "Laser Cannons: %s%n" +
                "Torpedo Launcher: %s%n" +
                "+++++++++++++%n",
                this.getFighterID(),
                this.getFLength(),
                this.getFWidth(),
                this.getFHeight(),
                this.getFMass(),
                this.getFEngines().getEngineType(),
                this.getFSensors().getSensorType(),
                this.getFPrimaryWpns().getWeaponType(),
                this.getFSecondaryWpns().getWeaponType());
    }

    @Override
    public double costToBuild() {
        return (this.getFighterModel().getModelCost() * 0.85) + this.getFEngines().getEngineCost() +
                this.getFSensors().getSensorCost() + this.getFPrimaryWpns().getWeaponCost() +
                this.getFSecondaryWpns().getWeaponCost();
    }
}
