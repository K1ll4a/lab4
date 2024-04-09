package class_;

import abstract_.Character;
import exceptions.ShoPassengers;
public class Passengers extends Character {
    int passengersValue = 90;
    public Passengers(){

    }
    public int getPassengersValue() throws ShoPassengers  {

        this.passengersValue = passengersValue;
        if(passengersValue >=100) {
            return passengersValue;
        }else throw new ShoPassengers("нехватка пассажиров");

    }
}
