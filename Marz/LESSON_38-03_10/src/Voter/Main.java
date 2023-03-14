package Voter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Контроль возраста избирателя ");
        System.out.println();

        Constructor voter = new Constructor ("Konochuk","12345",21);
        System.out.println(voter);
        System.out.println();

        Constructor voter2 = new Constructor("","12345",23);
        System.out.println(voter2);




    }
}

