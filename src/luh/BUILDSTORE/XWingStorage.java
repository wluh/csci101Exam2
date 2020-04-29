package luh.BUILDSTORE;

import luh.CLASSES.XWingFighter;
import luh.CLASSES.*;
import luh.ENUMS.XModel;
import luh.SUPPORT.Location;

import java.io.*;
import java.util.ArrayDeque;

public class XWingStorage {

    String name;
    Location storageLoc;
    ArrayDeque<XWingFighter> holdingPlatform = new ArrayDeque<>();
    public static final String DIR = "C:\\Users\\wluh1\\IdeaProjects\\csci101Exam2\\src\\luh" +
            "\\BUILDSTORE\\";

    public ArrayDeque<XWingFighter> getHoldingPlatform() {
        return holdingPlatform;
    }

    public XWingStorage(String name, Location storageLoc){
        this.name = name;
        this.storageLoc = storageLoc;
    }

    public boolean storeFighters(ArrayDeque<XWingFighter> wh, String fn) throws IOException {
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream(fn));
            ObjectOutputStream outputObject = new ObjectOutputStream(output);
            wh.forEach((fighter -> {
                try {
                    outputObject.writeObject(fighter);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
            outputObject.close();
            output.close();
            wh.clear();
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean retrieveFighters(String fn) throws IOException {
        try{
            DataInputStream input = new DataInputStream(new FileInputStream(fn));
            ObjectInputStream inputObject = new ObjectInputStream(input);
            for (int i = 0; i < 6; i += 1) {
                XWingFighter unknownFighter = (XWingFighter) inputObject.readObject();
                holdingPlatform.add(unknownFighter);
            }
            input.close();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

}
