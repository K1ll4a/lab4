package class_;
import abstract_.Character;
import interface_.Podsel;
import interface_.Slez;

public class MumiTroll extends Character implements Slez, Podsel {

    String position = "сидит на носу";

    public MumiTroll(){
    }

    public String slez(){
        this.position = "слез с носа";
        return  "слез с носа и ";
    }
    public String podsel(){
        this.position = "подсел";
        return "подсел к ней.";
    }
    public  String checkPosition(){
        return position;
    }
}
