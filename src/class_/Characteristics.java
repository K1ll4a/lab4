package class_;

public enum Characteristics {
    ZOLOTIM("золотым"),
    MEDLENNO(" медленно "),
    ZELENIM("зеленым"),
    ZOLOTISTIM("золотистым"),
    SILENTLY("тихо "),
    SMOOTHLY("гладко"),
    SCARY("страшная "),
    DUSTY(" запыленные ");

    private String characteristic;
    Characteristics(String characteristic){

        this.characteristic = characteristic;
    }
    public String getCharacteristic(){
        return characteristic;
    }

}
