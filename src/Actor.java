import java.util.Objects;

public class Actor extends Person{
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public java.lang.String toString() {
        return super.toString() + ", рост " + height + " см";
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Actor actor = (Actor) obj;
        return Double.compare(actor.height, height) == 0 && name.equals(actor.name) && surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
