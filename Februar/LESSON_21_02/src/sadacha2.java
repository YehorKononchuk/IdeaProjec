import java.util.HashMap;


public class sadacha2 {
    public static void main(String[] args) {

        System.out.println("Список группы 23-2 c описанием пола");

        HashMap<String, String> group23 = new HashMap<>();

        int man = 0;
        int woman = 0;

        group23.put( "Vadim", "M");
        group23.put( "Leonid", "M");
        group23.put( "Lilian", "M");
        group23.put( "Viacheslav", "M");
        group23.put( "Dina", "F");
        group23.put( "Katerina", "F");
        group23.put( "Katya", "F");
        group23.put( "valentin", "M");
        group23.put( "Oleg", "M");
        group23.put( "Jeka", "M");
        group23.put( "Yehor", "M");
        group23.put( "Maryna", "F");


        for (String i : group23.keySet()) {
          //  System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));
            if (group23.get(i).equals("M")){
                man++;
            }
        }
        for (String i : group23.keySet()) {
            //  System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));
            if (group23.get(i).equals("F")){
                woman++;
            }
        }
        System.out.println(" m "+ man);
     //   int woman = group23.size()-man;
        System.out.println(" w "+woman);

    }
}
















