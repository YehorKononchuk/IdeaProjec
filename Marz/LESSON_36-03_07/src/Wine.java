public class Wine {
    String name;

    String sort;

    int year;

    @Override
    public String toString() {
        return "wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';

    }
    public String onStock(int n){
       return (" na sklade bytilok ");
    }

    public int getYear() {
        return year;
    }
}
