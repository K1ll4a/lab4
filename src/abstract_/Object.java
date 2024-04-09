package abstract_;

public abstract class Object {
    protected String name;
    public Object(){

    }


    public void setName(String name){
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public String toString(){
        return this.getName();
    }
}
