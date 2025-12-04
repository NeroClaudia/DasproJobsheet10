import java.util.Scanner;

public class Absentee07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount, courseCount;

        System.out.print("Enter number of students: ");
        studentCount = scanner.nextInt();

        System.out.print("Enter number of courses: ");
        courseCount = scanner.nextInt();

        int[][] score = new int[studentCount][courseCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            double sumForEachStudent = 0;

            for (int j = 0; j < courseCount; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                score[i][j] = scanner.nextInt();
                sumForEachStudent += score[i][j];
            }
            System.out.println("Average score: " + sumForEachStudent / courseCount);
        }
        for (int j = 0; j < courseCount; j++) {
            double sumForEachCourse = 0;

            for (int i = 0; i < studentCount; i++) {
                sumForEachCourse += score[i][j];
            }
            System.out.println("Course " + (j + 1) + ": " + (sumForEachCourse / studentCount));
        }
        scanner.close();
    }
}
