
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 0;

        while (i < (num + 1)) {
            sum += i;
            i ++;
        }
        System.out.println(sum);

    }
}
