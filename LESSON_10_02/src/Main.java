public class Main {
    public static void main(String[] args) {

        int[][] field = new int[10][10];          // dli sapoolneniy nado 2 cikla odi // po strokam drygoi po kolonkam
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = i+1;
                System.out.print(field[i][j]+"\t");
            }
            System.out.println();
        }



    }
}