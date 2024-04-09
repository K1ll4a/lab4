package class_;


import abstract_.Character;
import interface_.Impose;
import interface_.Said;

public class MumiMom extends Character implements Said, Impose {
    public MumiMom(){

    }
    public String said(){
        return " сказала ";
    }
    public String impose(){
        return "обложить цветочные клумбы";
    }
}
