package class_;

import abstract_.Object;
import exceptions.ClParus;

public class Lodka extends Object {
    public Lodka() {

    }

    Lodka lodka;
    int speed = 0;

    public int CheckSpeed() {
        return speed;
    }
    public String floating(){
        this.speed = 43;
        return "лодка начала плыть";
    }
    public static class Parus extends Object {

        String status = "open";
        public Parus(){

        }

        public String OpenParus(){
            this.status = "open";
            if("open".equals(status)){
                return " статус " + status;
            }else throw new ClParus("Лодка не может начать движение,так как парус закрыт");
        }
    }




}
