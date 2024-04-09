package class_;

import abstract_.Object;
import interface_.Standing;

public class Heat extends Object  implements Standing {
    Characteristics charac;
    public Heat(){

    }
    public String description(){
        String scary = Characteristics.SCARY.getCharacteristic();
        return scary;
    }
    public String standing(){
        return "стояла ";
    }
}
