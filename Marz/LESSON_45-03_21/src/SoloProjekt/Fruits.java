package SoloProjekt;

public class Fruits implements Comparable<Fruits>{

    String fruits;

    String country;

    int weight;

    public Fruits(String fruits, String country, int weight) {
        this.fruits = fruits;
        this.country = country;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "fruits='" + fruits + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                '}'+'\n';
    }

    @Override
    public int compareTo(Fruits other) {
        return CharSequence.compare(this.country, other.country);
    }
}
