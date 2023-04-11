package algorithms;

public class Main {

    public int max (int[]ints,int n){
        int max = ints[0];// 2

        // еще до запуска происхрдит его ининциалзация i = 1, i < n + 2 операции

        for (int i = 1; i < n ; i++) { // после запуска for на каждрй итерации выпооснятеся еще 2 инструцкии  i ++; i<n;
            if (ints[i]>max){
                max = ints[i];
            }

        }
        return max;
    }

    // колтичество инструкций для цикла for с пустым телом f(n)=4+2n












    // линейный поиск

    public boolean linSearch (int[] arr,int elementToFind){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind )
                return true;
        }
        return false;
    }


    public int sum (int a, int b ){
        int res = a+b;

        return res;
}
    public static void drawTriangle (int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
   // f(n)=n^2

    public static void main(String[] args) {
        drawTriangle(6);
        int n = 100;
     //   for (int i = 0; i <n; i++) {
      //      drawTriangle(6);
        }
    }


