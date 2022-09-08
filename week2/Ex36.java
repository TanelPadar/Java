package week2;
import java.util.Scanner;
public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type number:");
        int number;
        int sum = 0;
        int count = 0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            count++;


        }
        System.out.println(number);
        System.out.println("The sum is " + sum);
        System.out.println("How many number: " + count);
        System.out.println("Average is: " + (double)sum / count);

    }

}
