package luh.MAIN;

import luh.BUILDSTORE.XWingFactory;
import luh.BUILDSTORE.XWingStorage;
import luh.CLASSES.XWingFighter;
import luh.CLASSES.XWingT65;
import luh.CLASSES.XWingT70;
import luh.CLASSES.XWingT85;
import luh.ENUMS.XModel;
import luh.SUPPORT.Location;

import java.io.IOException;

public class LuhExam2 {

    public static void main(String[] args) throws IOException {
        XWingFactory xwFactory = new XWingFactory("Alpha Factory", new Location(10, 10), 25);
        XWingStorage xwStorage = new XWingStorage("Alpha Storage", new Location(30, 30));
        xwFactory.buildFighters(2,2,2);
        xwStorage.storeFighters(xwFactory.getXWingWarehouse(),xwStorage.DIR+"Fighters");
        xwStorage.retrieveFighters(xwStorage.DIR + "Fighters");
        System.out.println();
        for(XWingFighter x : xwStorage.getHoldingPlatform()){
            if(x.getFighterModel() == XModel.T65B){
                XWingT65 xt65 = (XWingT65) x;
                xt65.displayFighterSpecs();
                xt65.displayT65Location();
            }
            if(x.getFighterModel() == XModel.T70){
                XWingT70 xt70 = (XWingT70) x;
                xt70.displayFighterSpecs();
                xt70.displayT70Location();
            }
            if(x.getFighterModel() == XModel.T85){
                XWingT85 xt85 = (XWingT85) x;
                xt85.displayFighterSpecs();
                xt85.displayT85Location();
            }
        }
    }

}
