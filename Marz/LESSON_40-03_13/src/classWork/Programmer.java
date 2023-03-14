package classWork;

import classWork.Human;

public class Programmer extends Human {


    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println(" Програмист любит писать код");
        doCode();
    }

    public void doCode(){
        System.out.println(" Сидит и пишет код с чайком и бутером");
    }
}
