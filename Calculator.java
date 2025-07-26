import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าตัวเลข 2 จำนวนจากผู้ใช้
        System.out.print("ป้อนตัวเลขตัวที่ 1: ");
        double num1 = input.nextDouble();

        System.out.print("ป้อนตัวเลขตัวที่ 2: ");
        double num2 = input.nextDouble();

        // คำนวณและแสดงผล
        System.out.println("ผลบวก: " + (num1 + num2));
        System.out.println("ผลลบ: " + (num1 - num2));
        System.out.println("ผลคูณ: " + (num1 * num2));

        // ตรวจสอบหารด้วยศูนย์
        if (num2 != 0) {
            System.out.printf("ผลหาร: %.2f\n", (num1 / num2));
        } else {
            System.out.println("ผลหาร: ไม่สามารถหารด้วยศูนย์ได้");
        }

        input.close();
    }
}
