package day4;

import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            num = num+ i;
        }

        System.out.println("sum of num" + num);

        sc.close();
    }
}


