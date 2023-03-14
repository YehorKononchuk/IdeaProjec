import java.util.HashMap;


public class hashMap {
    public static void main(String[] args) {

                System.out.println("Список группы 23-2");

                HashMap<String, Integer> group23 = new HashMap<>();

                group23.put( "Vadim", 25);
                group23.put( "Leonid", 25);
                group23.put( "Lilian", 40);
                group23.put( "Viacheslav", 25);
                group23.put( "Dina", 36);
                group23.put( "Katerina", 44);
                group23.put( "Katya", 33);
                group23.put( "valentin", 40);
                group23.put( "Oleg", 38);
                group23.put( "Jeka", 19);
                group23.put( "Yehor", 32);
                group23.put( "Maryna", 33);



        for (String i : group23.keySet()) {
                    System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));
                }
            }
        }
















