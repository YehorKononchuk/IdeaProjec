public class Main {
    public static void main(String[] args) {
        /*
        ZADACHA 1

        int [] numArray = new int[10];  // Opredelit massiv dly xraneniy

        for (int i=0; i< numArray.length; i++ ){
            numArray[i] = 10 + i * 10;
            System.out.println("Element at index : "+i+ "| " + numArray[i]);
        }

        int sum = 0;
        for (int i=0; i< numArray.length; i++){
            sum = sum + numArray[i]; //
        }
        System.out.println("Sum of elements of Array is: "+sum );

         */

        // ZADACHA 2

        int myArray1[] = new int[]{5, 3, 3, 4, 5, 4, 4, 5,2};
        int myArray2[] = new int[]{3, 4, 5, 5, 2, 5, 4,5,5,};
        // obchay summa kachdogo ychenika
        double sum1 = 0;
        double sum2 = 0;
        // srednee
        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < myArray1.length; i++) {
            sum1 += myArray1[i];

        }
        for (int i = 0; i < myArray2.length; i++) {
            sum2 += myArray2[i];

        }

        average1 = sum1 / myArray1.length;
        average2 = sum2 / myArray2.length;


        System.out.println(" summ aver 1  " +average1);
        System.out.println(" summ aver 2  " + average2);


        if (average1>average2){
            System.out.println(" fist student gut ");
        }
        else {
            System.out.println("second student gut ");
        }


    }
}