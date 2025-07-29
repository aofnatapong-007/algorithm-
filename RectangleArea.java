import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าความยาวและความกว้างจากผู้ใช้
        System.out.print("กรอกความยาว: ");
        double length = input.nextDouble();

        System.out.print("กรอกความกว้าง: ");
        double width = input.nextDouble();

        // คำนวณพื้นที่
        double area = length * width;

        // แสดงผลลัพธ์
        System.out.println("พื้นที่สี่เหลี่ยมผืนผ้า = " + area);

        input.close();
    }
}

