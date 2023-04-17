package funktionalInterf;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // 1.
        StringConcate stringConcate = (a, b)->Integer.toString(a)+b;
        System.out.println(stringConcate.concat(10,24));
        // 2.
        Checkable checkable = s -> s.length() ==3;
        System.out.println("check if length 3 ");
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));
        // 3.
        Printable printable = s -> System.out.println("!"+s+"!");
        System.out.println("printing !s!");
        printable.print("abc");
        // 4.
        Transformable transformable = s -> s.length() == 4 ? s = "****" : s;
        System.out.println("funktionalInterf.Transformable ");
        System.out.println(transformable.modify("ab"));
        System.out.println(transformable.modify("abcd"));
        // 5.
        Producable producable = () -> "Hello World";
        System.out.println("funktionalInterf.Producable");
        System.out.println(producable.produce());


    }
}