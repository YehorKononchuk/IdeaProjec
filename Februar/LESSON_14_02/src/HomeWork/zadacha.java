package HomeWork;

public class zadacha {
    public static void main(String[] args) {
        System.out.println("Привет Cohort 23-2");

        int[] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
            System.out.println(" Задуманный массив : " + arrayIntRandom[i]);
        }
        System.out.println();
        int min = min(arrayIntRandom);
        System.out.print("minimal elements massive: " + min);

        System.out.println();
        int max = max(arrayIntRandom);
        System.out.print("maximal elements massive: " + max);
    }

    public static int min(int array[]) {
        int minimum = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int max(int array[]) {
        int maximum = 10;
        for (int i = 0; i > array.length; i++) {
            if (array[i] < maximum) {
                maximum = array[i];
            }
        }
        return maximum;

    }
}
