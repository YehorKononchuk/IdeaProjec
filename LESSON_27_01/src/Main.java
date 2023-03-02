import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String  str1 = "hello";
        int length = str1.length();
        System.out.println("First character: "+ str1.charAt(0));

        System.out.println("Last character: "+ str1.charAt(length-1));

        // metod Printf


        System.out.printf("Hello %s?%n", "World");

        System.out.printf("hello%nworld","%n");

        System.out.printf("%n '%S' %n", "Hello World"); // ZAVISIMO OT REGISTRA MEN'YAETSA RASMER

// FORMATIROVANIE S ISPOLZOVANIEM "WIDTH"

        System.out.printf("'%12S' %n", "Hello");

        System.out.printf("%-15.3s", "Hello", "%n");

       // System.out.printf("integer : %d%n", 10000);
       // System.out.printf(Locale.US, "%,d %n", 100000);
      //  System.out.printf(Locale.GERMANY, "%,d %n", 100000);

        // float and double formatting

     /*   System.out.printf("%f%n",5.9876);
        // with precision (okruglennoe)

        System.out.printf("'%5.2f'%n",5.9876);

        System.out.printf("'%5.2e'%n",5.9876);

        String name = "Egor";
      //  String name2 = "Glib";
        String name3 = new String("Marina");

        boolean equals = name.equals(name);
        System.out.println(" comparison with equals: "+equals);
        System.out.println(" comparison with ==: "+(name==name3));


        String string = "Hello";
        String string1 = "hello";

        System.out.println(string.equals(string1));            // tochnaya proverka s ychetom registra
        System.out.println(string.equalsIgnoreCase(string1));  // uslovnaya proverka bez ycheta registra

        String string2 = new String("this is a new string");
        System.out.println("we convert all letters in the string to upper case "+string2.toUpperCase());

        String string3 = new String("this is a New striNg");
        System.out.println("we convert all letters in the string to upper case "+string3.toUpperCase());

        String string4 = new String("this is a New striNg");
        System.out.println(" to lower case "+string4.toLowerCase());
        */
// perevod vsex dannix v stroke v verhnii ili nichnii registr


        // metod " startsWith()"

      //  String string5 = "hello";
      //  boolean startsWith = string5.startsWith("he");
        //System.out.println(startsWith);


     // startsWith = string5.startsWith("ke");
      //  System.out.println(startsWith);



    }
}