import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าองศาฟาเรนไฮต์จากผู้ใช้
        System.out.print("กรุณาใส่อุณหภูมิ (องศาฟาเรนไฮต์): ");
        double fahrenheit = input.nextDouble();

        // แปลงเป็นองศาเซลเซียส
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // แสดงผลลัพธ์
        System.out.printf("อุณหภูมิในหน่วยเซลเซียสคือ: %.2f °C\n", celsius);

        input.close();
    }
}
