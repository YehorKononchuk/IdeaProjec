package classWork;

import java.util.ArrayList;
import java.util.Collections;

public class ListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();

        // Zapolnit' list sluchainimi chislami

        for (int i = 0; i < 10; i++) {
            myNumbers.add((int) ((Math.random()*(10)+1)));
        }
        System.out.println(myNumbers);
        System.out.println("Suze list: "+myNumbers.size());

        System.out.println();

        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        for (int i :  myNumbers){
            System.out.print( i + " | " );
        }



}
}
