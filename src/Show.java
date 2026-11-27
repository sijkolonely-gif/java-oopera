import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public Director getDirector() { return director; }
    public List<Actor> getListOfActors() {
        return List.copyOf(listOfActors);
    }

    // добавить актёра с проверкой на дубликат
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " уже участвует в спектакле.");
            return;
        }
        listOfActors.add(actor);
    }

    // заменить актёра по фамилии
    public void replaceActor(Actor newActor, String surname) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Актёр с фамилией " + surname + " не найден в спектакле.");
            return;
        }

        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname()
                    + " уже участвует в спектакле.");
            return;
        }

        listOfActors.set(index, newActor);
    }

    // распечатать список актёров
    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Режиссёр: " + director;
    }
}