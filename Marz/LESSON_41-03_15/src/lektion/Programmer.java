package lektion;

import lektion.Human;

public class Programmer extends Human {

   public int experience;

    public Programmer(int age, boolean is_worker, int experience) {
        super(age, is_worker);
        this.experience = experience;
    }

}
