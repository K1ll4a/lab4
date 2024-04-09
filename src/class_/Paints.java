package class_;

import abstract_.Object;
import interface_.Fade;

public class Paints extends Object implements Fade {
    boolean shine = false;
    public Paints(){

    }
    public String fade()
    {
        this.shine = true;
        return " блекнут";
    }

}
