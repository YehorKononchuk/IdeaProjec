import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Заполнение методом asList
        ArrayList<String> nameslist = new ArrayList<String>(
                Arrays.asList("Peter","Vladimir","Stepan","Sascha"));
        System.out.println(nameslist);

        System.out.println();

        // Вывод на печать через "for each"
        for (String nam : nameslist){
            System.out.println(nam);
        }

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("practice");
        myList.add("code");
        myList.add("quiz");
        myList.add("lesson");
        System.out.println("Original list : "+myList);

        Collections.reverse(myList);

        System.out.println("Reverrse list : "+myList);




    }
}