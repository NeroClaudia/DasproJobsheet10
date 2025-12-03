import java.util.Scanner;

public class CinemaWithScanner07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, next;
        int row, column;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter a name: ");
            name = scanner.nextLine();
            System.out.print("Enter row number: ");
            row = scanner.nextInt();
            System.out.print("Enter column number: ");
            column = scanner.nextInt();
            scanner.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are they any other audiences to be added? (y/n): ");
            next = scanner.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        scanner.close();
    }
}
