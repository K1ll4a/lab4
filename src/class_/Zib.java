package class_;

import abstract_.Object;
import interface_.Mertvuyu;

import java.security.cert.TrustAnchor;

public class Zib  extends Object implements Mertvuyu {
    Characteristics charac;
    boolean alive = true;

    public  Zib(){

    }


    public String mertvuyu(){
        this.alive = false;
        return "мертвую";
    }


    public String description() {
        String charax = charac.ZOLOTIM.getCharacteristic()  + " и "   + charac.ZELENIM.getCharacteristic();
        return charax;
        }
    }
