public class Main {
    public static void main(String[] args) throws IncorrectNumberException {

        System.out.println("Математические методы");

        // Проверка что число просто
        MathMethods method1 = new MathMethods();
        System.out.println(method1.isPrimeNumber(17));
        System.out.println(method1.isPrimeNumber(121));
        System.out.println(method1.isPrimeNumber(19));
        System.out.println(method1.isPrimeNumber(167));
        System.out.println();
        try {

            System.out.println(method1.isPrimeNumber(0));
            System.out.println(method1.isPrimeNumber(1));
            System.out.println(method1.isPrimeNumber(-1));
        }catch (IncorrectNumberException ex){
            System.out.println(ex);
        }

        // Проверка что число четное
        // Действия n! = 1*2*3...*n, 5! = 1*2*3*4*5 = 120;





    }
}