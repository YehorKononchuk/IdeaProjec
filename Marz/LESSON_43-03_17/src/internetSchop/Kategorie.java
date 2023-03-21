package internetSchop;

import java.util.ArrayList;

public class Kategorie {

    String name;

    ArrayList kategorie;

    public Kategorie(String name, ArrayList kategorie) {
        this.name = name;
        this.kategorie = kategorie;
    }

    @Override
    public String toString() {
        return "Kategorie{" +
                "name='" + name + '\'' +
                ", kategorie=" + kategorie +
                '}';
    }
}
