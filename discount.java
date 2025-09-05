import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of one dress:");
        double dress = input.nextDouble();
        System.out.print("Enter number dresses to buy ");
        double number = input.nextDouble();
        System.out.print("Enter discount rate ");
        double rate = input.nextDouble();
        System.out.println("----------------------------------------");

        double total = dress * number;
        double dis = number * rate;
        double pay = total - dis;
        System.out.println(" total cost = " + total + "Baht");
        System.out.println(" discountAmount = " + dis + "Baht");
        System.out.println(" Net pay =" + pay + "Baht");
        input.close();
    }
}