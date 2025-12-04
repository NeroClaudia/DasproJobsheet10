import java.util.Scanner;

public class CinemaWithScanner07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, next;
        int row, column, menu;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("===== AUDIENCE =====");
            System.out.println("Option:");
            System.out.println("Menu 1: Input Audience Data");
            System.out.println("Menu 2: Show Audience List");
            System.out.println("Menu 3: Exit");

            System.out.print("Choose the menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {

                case 1:
                    while (true) {

                        System.out.print("Enter a name: ");
                        name = scanner.nextLine();

                        System.out.print("Enter row number: ");
                        row = scanner.nextInt();

                        System.out.print("Enter column number: ");
                        column = scanner.nextInt();
                        scanner.nextLine();

                        
                        if (row < 1 || row > audience.length ||
                            column < 1 || column > audience[0].length) {

                            System.out.println("Invalid seat! Row/column does not exist.\n");
                            continue; 
                        }

                        
                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("Seat already occupied! Choose another seat.\n");
                            continue;
                        }

                        
                        audience[row - 1][column - 1] = name;

                        
                        System.out.print("Are there any other audiences to be added? (y/n): ");
                        next = scanner.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break; 
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            System.out.print((audience[i][j] == null ? "***" : audience[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Thank You");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

            System.out.println();
        }
    }
}
