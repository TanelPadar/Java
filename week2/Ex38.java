package week2;

import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {
        prinText(3);
        printSquare(2);
        printRectangle(2,3);
    }

    public static void prinText(int howMany) {
        System.out.println("*");
        int count = 0;
        while (count < howMany) {
            System.out.println("Dsadasdas");
            count++;

        }
    }

    public static void printSquare(int sideSize) {
        int row = 1;
        while (row < sideSize) {
            int field = 1;
            while(field <= sideSize){
                System.out.printf("*");
                field++;
            }
            System.out.println();
            row++;
        }


    }

    public static void printRectangle(int width, int height) {
        int row = 1;
        while (row < height) {
            int field = 1;
            while(field <= width){
                System.out.printf("*");
                field++;
            }
            System.out.println();
            row++;
        }


    }
}
