package Praktikum;

public class Menu implements Comparable <Menu>{
    String dish;
    int price;
    double weight;
    public Menu(String dish, int price, double weight) {
        this.dish = dish;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "dish='" + dish + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}'+'\n';
    }

    @Override
    public int compareTo(Menu anotherMenu) {
        if (this.weight == anotherMenu.weight){
            return 0;
        } else if (this.weight< anotherMenu.weight) {
            return -1;
        }else {
            return 1;
        }
    }
}
