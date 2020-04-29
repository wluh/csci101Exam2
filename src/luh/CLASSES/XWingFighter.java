package luh.CLASSES;

import luh.ENUMS.*;

import java.io.Serializable;

public abstract class XWingFighter implements Serializable {

    static final long serialVersionUID = 1L;

    public String getFighterID() {
        return FighterID;
    }

    public XModel getFighterModel() {
        return FighterModel;
    }

    public double getFLength() {
        return FLength;
    }

    public double getFWidth() {
        return FWidth;
    }

    public double getFHeight() {
        return FHeight;
    }

    public double getFMass() {
        return FMass;
    }

    public double getFMaxSpeed() {
        return FMaxSpeed;
    }

    public XSensor getFSensors() {
        return FSensors;
    }

    public XEngine getFEngines() {
        return FEngines;
    }

    public XWeapon getFPrimaryWpns() {
        return FPrimaryWpns;
    }

    public XWeapon getFSecondaryWpns() {
        return FSecondaryWpns;
    }

    private String FighterID;
    private XModel FighterModel;
    private double FLength;
    private double FWidth;
    private double FHeight;
    private double FMass;
    private double FMaxSpeed;
    private XSensor FSensors;
    private XEngine FEngines;
    private XWeapon FPrimaryWpns;
    private XWeapon FSecondaryWpns;

    protected XWingFighter(String fighterID, XModel fighterModel, double fLength, double fWidth, double fHeight,
                           double fMass, double fMaxSpeed, XSensor fSensors, XEngine fEngines, XWeapon fPrimaryWpns,
                           XWeapon fSecondaryWpns) {
        FighterID = fighterID;
        FighterModel = fighterModel;
        FLength = fLength;
        FWidth = fWidth;
        FHeight = fHeight;
        FMass = fMass;
        FMaxSpeed = fMaxSpeed;
        FSensors = fSensors;
        FEngines = fEngines;
        FPrimaryWpns = fPrimaryWpns;
        FSecondaryWpns = fSecondaryWpns;
    }

    abstract void displayFighterSpecs();
    public abstract double costToBuild();
}