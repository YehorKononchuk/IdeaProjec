package predefined_funktional_interfeice;

import java.util.function.*;

public class Main {
    // Standard functional interface
// *********++1**********
    // Function <T,R>  reference T>R
    // public interface Function <T,R>{
     // R apply(T ob)
    // }
// ***********2***********
    // Predicate<T> - check up.
    // public interface Predicate <T>{
    // boolean test(T ob)
    // }
// *********3******
    // Consumer<T> - not return
    // public interface Consumer <T>{
    // void accept (T ob);
    // }
//***********4*********
    // Supplier<T> - return objects
    // public interface Supplier <T>{
    // T get ()
    // }
// ********5*************
    // BinaryOperator<T> *accept object type T und return type T*
    // public interface BinaryOperator<T>{
    // T appply (T ob1, T ob2);
    // }
// *********6**********+
    // UnaryOperator <T> *==  Function accept one object*
    // public interface UnaryOperator <T>{
    // T apply(T ob)
    // }




    public static void main(String[] args) {
        Function<Integer,String> intToString =num -> String.valueOf(num);
        intToString.apply(2);
        Predicate<Integer> isPositive = num -> num>0;
        isPositive.test(3);


        Consumer<String> consumer = s-> System.out.println(s);
        consumer.accept("Hello");

        Supplier<String> supplier = ()->"Hello World";

        BinaryOperator<Integer> sum = (num1,num2)->num1 + num2;
        sum.apply(1,2);

        UnaryOperator<Integer> isSquare = num -> num*num;
        isSquare.apply(2);



    }




}
