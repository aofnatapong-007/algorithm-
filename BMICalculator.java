import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับน้ำหนัก (กิโลกรัม)
        System.out.print("กรุณาใส่น้ำหนัก (กิโลกรัม): ");
        double weight = scanner.nextDouble();

        // รับความสูง (เมตร)
        System.out.print("กรุณาใส่ความสูง (เมตร): ");
        double height = scanner.nextDouble();

        // คำนวณ BMI
        double bmi = (weight) / (height * height);

        // แสดงผลลัพธ์
        System.out.printf("ค่า BMR ของคุณคือ: %.2f\n", bmr);

        scanner.close();
    }
}
