package Konsult;

public class Main2 {
    public static void main(String[] args) {

        Person tom = new Person("Tom",23);
        System.out.println(tom.hashCode());

        Person tom1 = new Person("Tom");
        System.out.println(tom1.hashCode());
    }
}
