public class Nobody extends Person {
    public String getName() {
        return "";
    }

    public Action DoSomething(ActionType action, Object object){
        return new Action().add(action).add(object.toString());
    }

}
