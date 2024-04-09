package class_;

import abstract_.Object;
interface Exhausted{
    String exhausted(); //изнемогали
}
interface Shallowed{
    String shallowed();  //обмелела
}

public class Trees extends Object implements Exhausted {

    public Trees(){

    }
    public String exhausted(){
        return "изнемогали";
    }

    public String description(){
        String dus = Characteristics.DUSTY.getCharacteristic();
        return dus;
    }
    public static class River extends Object implements Shallowed{
        public River(){

        }
        public String shallowed(){
            return "обмелела";
        }
    }




}
