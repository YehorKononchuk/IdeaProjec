package HomeWork;

public class zadacha2 {
    public static void main(String[] args) {

        int[] arrayIntRandom = new int[10];
        System.out.print(" Задуманный массив    :  ");
        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
            System.out.print(" " + arrayIntRandom[i]);
        }
        System.out.println();
        removeDuplicates(arrayIntRandom);
    }

    public static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        System.out.print(" Ипсправленный массив :  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }

    }

}
