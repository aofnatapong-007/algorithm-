import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าจำนวนเต็มจากผู้ใช้
        System.out.print("ป้อนตัวเลข: ");
        int number = input.nextInt();

        // ตรวจสอบว่าเป็นเลขคู่หรือเลขคี่
        if (number % 2 == 0) {
            System.out.println(number + " เป็นเลขคู่");
        } else {
            System.out.println(number + " เป็นเลขคี่");
        }

        input.close();
    }
}

