package class_;

import abstract_.Character;
import interface_.Buzzing;
interface Cant{
    String cant();
}

public class Flies  extends Character implements Buzzing,Cant{
    String status = "силы есть";
    public Flies(){

    }
    public String buzzing(){
        this.status = "сил нет";
        return " жужжать ";

    }
    public String CheckStatus(){
        return status;
    }
    public String cant(){
        return "не могли";
    }


}
