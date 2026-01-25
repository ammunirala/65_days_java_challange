package Loops;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 8;
        do {
            System.out.println(i);
            i++;

        }while(i<=5);
        System.out.println("out of the loop");

    }
}
