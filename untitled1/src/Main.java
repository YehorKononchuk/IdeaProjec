import java.util.Random;

public class Main {
    static int[][] battleField = new int[10][10];
    static int count = 0;


    public static void main(String[] args) {
        initField();
        while (count < 4) {
            int x = new Random().nextInt(10);
            int y = new Random().nextInt(10);
            if (isValid(x, y)) {
                battleField[x][y] = 1;
                count++;
            }
        }
        printField();
    }

    public static void initField() {
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                battleField[i][j] = -1;
            }
        }
    }

    public static boolean isValid(int x, int y) {
        if (x > 0 && battleField[x - 1][y] == 1) {
            return false;
        }
        if (x < 9 && battleField[x + 1][y] == 1) {
            return false;
        }
        if (y > 0 && battleField[x][y - 1] == 1) {
            return false;
        }
        if (y < 9 && battleField[x][y + 1] == 1) {
            return false;
        }
        return true;
    }

    public static void printField() {
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                System.out.print(battleField[i][j] + " ");
            }
            System.out.println();
        }
    }
}