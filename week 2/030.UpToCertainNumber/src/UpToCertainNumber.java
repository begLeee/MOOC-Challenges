
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int read = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i < (read +1)) {
            System.out.println(i);
            i ++;

        }
        
    }
}
