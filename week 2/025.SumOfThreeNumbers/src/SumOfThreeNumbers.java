
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        // Write your program here
        // Use only variables sum and read
        int i=0;
        while (i < 3) {
            read = Integer.parseInt(reader.nextLine());
            sum +=  read;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
