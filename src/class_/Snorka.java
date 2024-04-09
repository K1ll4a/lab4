package class_;

import abstract_.Character;
import interface_.Take;

public class Snorka extends Character implements Take {
    int goldBalance = 0;
    public Snorka(){
    }
    public String take(){
        this.goldBalance = goldBalance + 1000;
        return " предпринимает с золотом. ";
    }
    public int getGoldBalance(){
        return goldBalance;
    }

}
