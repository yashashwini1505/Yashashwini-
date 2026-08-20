package day4;

import java.util.Scanner;

public class week {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("1.day1");
	        System.out.println("2.day2");
	        System.out.println("day3");
	        System.out.println("day4");
	        System.out.println("day5");
	        System.out.println("day6");
	        System.out.println("day7");

	        System.out.print("Enter your option: ");
	        int option = sc.nextInt();
	        switch (option) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesaday");
                break;

            case 3:
                System.out.println("wedensday");
                break;

            case 4:
                System.out.println(" thursday ");
                break;
                   
            case 5:
                 System.out.println("friday ");
                 break;

            case 6:
                  System.out.println("saturday ");
                  break;

            case 7:
                  System.out.println(" sunday ");
                  break;

            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}

