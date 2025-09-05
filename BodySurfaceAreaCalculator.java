import java.util.Scanner;

public class BodySurfaceAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าความกว้าง
        System.out.print("กรุณาใส่ค่าความกว้าง (เซนติเมตร): ");
        double width = input.nextDouble();

        // รับค่าความยาว
        System.out.print("กรุณาใส่ค่าความยาว (เซนติเมตร): ");
        double length = input.nextDouble();

        // คำนวณ Body Surface Area
        double bsa = (width * length) / 360;

        // แสดงผลลัพธ์
        System.out.printf("ค่า Body Surface Area คือ: %.2f ตารางเมตร\n", bsa);

        input.close();
    }
}
