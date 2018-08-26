
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a power: ");
        int power = Integer.parseInt(reader.nextLine());

        int sum = (int)Math.pow(2,power+ 1 ) - 1;
        System.out.println("The sum is: " + sum);

    }
}
