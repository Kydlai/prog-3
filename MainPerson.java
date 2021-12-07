public class MainPerson extends Person implements Movable{
    boolean Moving;
    String name;
    public MainPerson(){
        Moving = false;
        name = "Главный герой";
    }

    public String getName() {
        return name;
    }

    public boolean IsMove() {
        return Moving;
    }
}
