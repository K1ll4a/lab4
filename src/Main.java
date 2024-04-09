import class_.*;
import exceptions.ShoPassengers;
public class Main{
    public static void main(String [] args) throws ShoPassengers {
        MumiTroll mumiTroll = new MumiTroll();
        mumiTroll.setName("Муми-тролль");
        Sun sun = new Sun();
        sun.setName("Солнце");
        Zib zib = new Zib();
        zib.setName("зыбь");
        All all = new All();
        all.setName("Все");
        Lodka.Parus parus = new Lodka.Parus();
        parus.setName("парус");
        Lodka lodka = new Lodka();
        lodka.setName(" лодка");
        Passengers passengers = new Passengers();
        passengers.setName(" пассажиры");
        Island island = new Island();
        island.setName("Остров хатифнаттов");
        Snorka snorka = new Snorka();
        snorka.setName("Снорка");
        Snusmumrik snusmumrik = new Snusmumrik();
        snusmumrik.setName("Снусмумрик");
        MumiMom mumiMom = new MumiMom();
        mumiMom.setName("Муми-Мама");
        Paints paints = new Paints();
        paints.setName("Краски");
        Adventure adventure = new Adventure();
        adventure.setName("'Приключение'");
        Heat heat = new Heat();
        heat.setName("жара");
        Flies flies = new Flies();
        flies.setName("мухи");
        Trees trees = new Trees();
        trees.setName(" деревья");
        Trees.River river = new Trees.River();
        river.setName(" речка");
        Valley valley = new Valley();
        valley.setName("долину");
        Little little = new Little();
        little.setName("мелюзга");
        Birds birds = new Birds();
        birds.setName("птицы");
        story(mumiTroll, sun, zib, all, parus, lodka, passengers, island, snorka, snusmumrik, mumiMom, paints, adventure,heat,flies,trees,river,valley,little,birds);

    }
    private static void story(MumiTroll mumiTroll, Sun sun, Zib zib, All all, Lodka.Parus parus, Lodka lodka, Passengers passengers, Island island, Snorka snorka, Snusmumrik snusmumrik,
                              MumiMom mumiMom, Paints paints, Adventure adventure, Heat heat,Flies flies,Trees trees, Trees.River river, Valley valley,Little little,Birds birds)  throws ShoPassengers {
        System.out.println(mumiTroll + mumiTroll.slez() + mumiTroll.podsel() + "\n" +
        sun + sun.description() + sun.tend() + sun.coloring() + zib.description() + "\n" +
        all + all.become() + all.description() + " " + parus + parus.OpenParus()  +  lodka + passengers+ " " + passengers.getPassengersValue() +  "\n" +
        island + island.flaming() + "\n" +
        snorka + snorka.take() + snusmumrik + snusmumrik.asked() + "\n" +
        mumiMom + mumiMom.said() + mumiMom.impose() + "\n" +
        all + all.sit() + all.silently() + all.watch() + sun + sun.sinking() + paints + paints.fade() + "\n" +
        adventure + adventure.go() + adventure.description() + adventure.swaying() + "\n" +
        heat.standing() + heat.description() + heat + "\n" +
        flies + " " + flies.cant() + flies.buzzing() + flies.CheckStatus() + "\n" +
        trees.exhausted()  + trees.description() + trees + ", " + river.shallowed() + river + "\n" +
        sun + " " +  sun.watered() + " " + valley + "\n" +
        little + " "  + little.hiden() + ", "  + birds  + birds.silent());

        System.out.println("\n"+adventure.CheckPosition());
        System.out.println(mumiTroll.checkPosition());
        System.out.println(lodka.floating() + " " + lodka.CheckSpeed() );
        System.out.println("мелюзга - " + little.checkstatus() + ", птицы  " + birds.checkstatus());






    }
}
