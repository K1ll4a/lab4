package class_;

import abstract_.Object;
import interface_.Go;
import interface_.Swaying;

public class Adventure extends Object implements Go, Swaying {
    Characteristics charac;
    String position = "стояло";
    public Adventure (){

    }
    public String go(){
        this.position = "начало двигаться";
        return " шло";
    }
    public String swaying(){
        return " покачиваясь.";
    }
    public String description(){
        this.charac = charac.SMOOTHLY;
        return " плавно";
    }
    public String CheckPosition(){
        return position;
    }

}
