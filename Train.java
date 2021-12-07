public class Train extends DefaultObject implements Movable{
    boolean Moving;
    String name;

    public Train(){
        Moving = true;
        name = "Поезд";
    }

    public String getName() {
        return name;
    }

    public boolean IsMove() {
        return Moving;
    }

    void GetCondition(){
        String local_string = this.IsMove() ? "в движении" : "стоит";
        System.out.println(name + " " + local_string);
    }
}
