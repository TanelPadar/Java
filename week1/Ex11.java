package week1;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = Integer.parseInt(reader.nextLine());;
        System.out.print("Input the second number: ");
        int b = Integer.parseInt(reader.nextLine());;
        System.out.println("Result: "+result(a, b));
    }
    public static int result(int x, int y)
    {
        if(x == y)
            return 0;
        if(x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;
    }
}


