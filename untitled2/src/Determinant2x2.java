public class Determinant2x2 {
    public static void main(String[] args) {
        int[][] matrix = {{-5, 10}, {17, 3}};
        int determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        System.out.println("Determinant of the matrix is: " + determinant);
    }
}