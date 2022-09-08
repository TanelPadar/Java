package week1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("sinu nimi: ");
        String name = reader.nextLine();

        System.out.print("kui vana sa oled: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("sinu nimi on: " + name + ", ja sa oled " + age + " aastat vana.");
    }
}