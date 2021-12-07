public class Action {
    String action_stirng = "";

    public Action add(Object action){
        action_stirng += " " + action.toString();
        return this;
    }

    public String toString(){
        return action_stirng;
    }

}
