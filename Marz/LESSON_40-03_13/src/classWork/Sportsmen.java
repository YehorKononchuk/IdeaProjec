package classWork;

import classWork.Human;

public class Sportsmen extends Human {


    public Sportsmen(String firstName, String lastName) {
        super(firstName,lastName);
    }

    @Override
    public void work() {
        System.out.println("Надо идти на тренировку ");
        playFootball();
    }

    public void playFootball(){
        System.out.println(" Бегать с мячом");
    }
}
