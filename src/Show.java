import java.sql.SQLOutput;
import java.util.ArrayList;

public class Show {
    public String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor + "уже учавствует");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor (String oldSurname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.surname.equalsIgnoreCase(oldSurname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актер " + oldSurname + " не найден");
    }

    public void printActors() {
        System.out.println("Актеры спектакля " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }
}
