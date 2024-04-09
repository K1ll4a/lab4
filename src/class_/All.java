package class_;

import abstract_.Object;
import interface_.Become;
import interface_.Sit;
import interface_.Watch;

public class All extends Object implements Become, Sit, Watch {
    Characteristics charac;
    String position = "стояли";
    public All(){

    }
    public String become(){
        return " стало ";
    }
    public  String sit()
    {

        return " сидели ";
    }
    public String watch()
    {

        return " смотрели ";
    }
    public String description(){
        String zol = charac.ZOLOTIM.getCharacteristic();
        return zol;
    }

    public  String silently(){
        String sil = charac.SILENTLY.getCharacteristic();
        return sil;
    }
}
