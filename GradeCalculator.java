import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับชื่อและคะแนนจากผู้ใช้
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();

        // คำนวณเกรดตามคะแนน
        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // แสดงผล
        System.out.println("\n--- Result ---");
        System.out.println("Name : " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}