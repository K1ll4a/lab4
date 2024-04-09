package class_;

import abstract_.Character;

interface  Hidden {
    String hiden();
}
public class Little extends Character implements Hidden {          //мелюзга
    String status  = "гуляют";
    public Little(){

    }
    public String hiden(){
        this.status = "все спрятались";
        return "попряталась в норы";
    }
    public String checkstatus(){
        return status;
    }
}
