import java.util.Scanner;
public class MedicineDoseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter age");
        double age = scanner.nextDouble();

        if (age > 10) {
            System.out.println("Take 2 teaspoons");
        } else if (age > 3) {
            System.out.println("Take 1 teaspoons");
        } else if (age > 1) {
            System.out.println("Take 1/2 teaspoons");
        } else if (age > 0) {
            System.out.println("Do not take medicine");

        } else {
            System.out.println("wrong age");
        }
        scanner.close();
    }
}