package week3;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type text:");
        String userInput = reader.nextLine() ;
        for(int i=userInput.length()-1;i>=0;i--)
        {
            System.out.print(userInput.charAt(i));
        }
    }

}
