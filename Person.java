public abstract class Person implements HasName {

    public void Action(Action type){
        System.out.println(this.getName() + " " + type.toString());
    }

    public void PluralAction(PluralActionType plural_type, Action type1, Action type2){
        System.out.print(this.getName() + " " + type1.toString());
        System.out.println(", " + plural_type.toString() + " "  + type2.toString());
    }

    public String toString() {
        return getName();
    }

    public boolean equals(Object object) {
        return object == this && object.toString() == this.toString();
    }

    public int hashCode() {
        return 57;
    }
}
