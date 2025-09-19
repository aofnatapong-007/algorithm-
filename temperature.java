import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in celsius ");
        double temperature =scanner.nextDouble();

        if (temperature >35) {
            System.out.println("hot");
        }else if (temperature >=20) {
            System.out.println("normal");
        }else {
            System.out.println("cold");
        }

    }
}


