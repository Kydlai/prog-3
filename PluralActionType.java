public enum PluralActionType {

    BUT("но"),
    WHEN("когда"),
    TO("на");

    private final String name;

    PluralActionType(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
