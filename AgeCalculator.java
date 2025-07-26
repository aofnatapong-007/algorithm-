import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับปีเกิดจากผู้ใช้
        System.out.print("e: ");
        int birthYear = scanner.nextInt();

        // กำหนดปีปัจจุบัน (2025)
        int currentYear = 2025;

        // คำนวณอายุ
        int age = currentYear - birthYear;

        // แสดงผลลัพธ์
        System.out.println("e " + age + " y");
    }
}
