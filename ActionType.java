public enum ActionType {
    STOP("остановить"),
    UNDERSTAND("понял, что"),
    REMEMBER("вспомнить"),
    SLEEP("заснуть"),
    LOST("потерял"),
    HAVE("держал"),
    REQUIRE("потребовать"),
    KICK("ударить"),
    WANT("хотел"),
    WHERE("где"),
    SPEND("тратить"),
    MORETHAN("дороже"),
    PUTDOWN("положил"),
    NEED("нужно");

    private final String name;

    ActionType(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
