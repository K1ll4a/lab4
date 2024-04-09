package class_;

import abstract_.Character;
interface Silent{
    String silent();

}

public class Birds extends Character implements  Silent {
    String status = "чирикали";

    public Birds(){

    }
    public String silent(){
        this.status = "замолчали";
        return " смолкли";
    }
    public String checkstatus(){

        return status;
    }

}
