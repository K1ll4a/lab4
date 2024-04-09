package class_;

import abstract_.Object;
import interface_.Coloring;
import interface_.Sinking;
import interface_.Tend;
interface Watered{
    String watered();
}
public class Sun extends Object implements Tend, Coloring, Sinking,Watered {
    int AngleOfInclination = 90;
    public Sun(){
    }
    public String tend(){
        this.AngleOfInclination = 77;
        return "клонилось к закату";
    }
    public String coloring(){
        return " расцвечивая ";
    }
    public String sinking(){
        this.AngleOfInclination = 36;
        return " погружается в море,";}
    public String description(){
        String slow = Characteristics.MEDLENNO.getCharacteristic();
        return slow;

    }
    public String watered() {return "поливало зноем ";}

}
