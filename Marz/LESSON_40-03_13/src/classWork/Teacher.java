package classWork;

import classWork.Human;

public class Teacher extends Human {


    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println(" Научить нельзя можно научится");
        study();

    }

    public void study(){
        System.out.println(" Усчи английский ");
    }
}
