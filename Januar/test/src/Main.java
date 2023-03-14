import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;
        while (continueCalculating) {
            System.out.print("Enter the length of the first side: ");
            double a = readPositiveDouble(sc);
            System.out.print("Enter the length of the second side: ");
            double b = readPositiveDouble(sc);

            double perimeter = 2 * (a + b);
            System.out.println("The perimeter of the room is: " + perimeter);

            System.out.print("Do you want to continue calculating? (yes/no): ");
            continueCalculating = readYesNo(sc);
        }
        sc.close();
    }

    private static double readPositiveDouble(Scanner sc) {
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine().trim());
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("The number must be positive. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again with a number.");
            }
        }
    }

    private static boolean readYesNo(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter either 'yes' or 'no'.");
            }
        }
    }
}