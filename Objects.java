public enum Objects {
    STICK("трость"),
    PILLOW("подушка"),
    HEAD("голова"),
    NEWSTICK("новая трость"),
    THIS("это"),
    MONEY("деньги");

    private final String name;

    Objects(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
