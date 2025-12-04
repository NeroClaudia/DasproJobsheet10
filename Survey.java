import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] surveyResult = new int[10][6];

        System.out.println("======== CUSTOMER SATISFACTION SURVEY ========");
        System.out.println("Enter a value for each question (1-5)");

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                int nilai;

                do {
                    System.out.print("Question " + (j + 1) + ": ");
                    nilai = scanner.nextInt();
                    if (nilai < 1|| nilai > 5) {
                        System.out.println("Value must be between 1-5. Please try again.");
                    }
                }while(nilai < 1|| nilai > 5);
                surveyResult[i][j] = nilai;
            }
            System.out.println();
        }
        System.out.println("===== AVERAGE FOR EACH RESPONDEN =====");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += surveyResult[i][j];
            }
            double avgRespond = total / 6;
            System.out.printf("Responden %d: %.2f\n", (i + 1), avgRespond);
        }
        System.out.println("===== AVERAGE FOR EACH QUESTION =====");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += surveyResult[i][j];
            }
            double avgQuestion = total / 10;
            System.out.printf("Question %d: %.2f\n", (j + 1), avgQuestion);
        }
        System.out.println("===== TOTAL ALL AVERAGES =====");
        double totalAverage = 0;
        int totalData = 10 * 6;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalAverage += surveyResult[i][j];
            }
        }
        double allAverage = totalAverage / totalData;
        System.out.printf("Average Customer Satisfaction: %.2f\n", allAverage);

        System.out.println("===== INTERPRETATION =====");
        if (allAverage >= 4.0) {
            System.out.println("Status: Very Satisfied");
        }else if (allAverage >= 3.0) {
            System.out.println("Status: Satisfied");
        }else if (allAverage >= 2.0) {
            System.out.println("Status: Good Enough");
        }else {
            System.out.println("Status: Needs Improvement");
        }
        scanner.close();
    }

}