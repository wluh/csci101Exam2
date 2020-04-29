package luh.BUILDSTORE;

import luh.CLASSES.XWingFighter;
import luh.CLASSES.*;
import luh.ENUMS.XWeapon;
import luh.SUPPORT.Location;

import java.util.ArrayDeque;

public class XWingFactory {

    public XWingFactory(String name, Location factoryLoc, int buildCapacity) {
        this.name = name;
        this.factoryLoc = factoryLoc;
        this.XWingWarehouse = XWingWarehouse;
        this.buildCapacity = buildCapacity;
    }

    String name;
    Location factoryLoc;

    ArrayDeque<XWingFighter> XWingWarehouse = new ArrayDeque<>();

    int buildCapacity;
    int modelNum65 = 0;
    int modelNum70 = 0;
    int modelNum85 = 0;
    public void buildFighters(int XWingT65, int XWingT70, int XWingT85){
        try {
            double t65cost = 0;
            double t70cost = 0;
            double t85cost = 0;
            for (int i = 0; i < XWingT65; i += 1){
                XWingT65 newPlane = generateT65();
                newPlane.setPos(this.factoryLoc);
                XWingWarehouse.add(newPlane);
                t65cost += newPlane.costToBuild();
            }
            for (int i = 0; i < XWingT70; i += 1){
                XWingT70 newPlane = generateT70();
                newPlane.setPos(this.factoryLoc);
                XWingWarehouse.add(newPlane);
                t70cost += newPlane.costToBuild();
            }
            for(int i = 0; i < XWingT85; i += 1){
                XWingT85 newPlane = generateT85();
                newPlane.setPos(this.factoryLoc);
                XWingWarehouse.add(newPlane);
                t85cost += newPlane.costToBuild();
            }

            System.out.printf(
                    "_______XWing Fighter Build Report____________%n" +
                    "Type Built      Number Built    Build Cost%n" +
                    "T65                     %d      %.0f Credits%n" +
                    "T70                     %d      %.0f Credits%n" +
                    "T85                     %d      %.0f Credits%n" +
                    "Total Build Cost:              %.0f Credits%n" +
                    "__Report Created by %s____________%n",
                    XWingT65, t65cost,
                    XWingT70, t70cost,
                    XWingT85, t85cost,
                    t65cost + t70cost + t85cost,
                    this.name);

        } catch(Exception e){
            System.out.println("Fighter Build Failed");
            e.printStackTrace();
        }
    }

    public ArrayDeque<XWingFighter> getXWingWarehouse() {
        return XWingWarehouse;
    }

    private XWingT65 generateT65(){
        modelNum65 += 1;
        return new XWingT65("T65-" + (modelNum65 * 10));
    }

    private XWingT70 generateT70(){
        modelNum70 += 1;
        return new XWingT70("T70-" + (modelNum70 * 8), XWeapon.AX190);
    }

    private XWingT85 generateT85(){
        modelNum85 += 1;
        return new XWingT85("T85-" + (modelNum85 * 6));
    }

}
