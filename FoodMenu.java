package day4;
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Pizza     - ₹200");
        System.out.println("2. Burger    - ₹100");
        System.out.println("3. Biryani   - ₹150");
        System.out.println("4. Sandwich  - ₹80");
        System.out.println("5. Exit");

        System.out.print("Enter your option: ");
        int option = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int price = 0;
        String food = "";

        switch (option) {
            case 1:
                food = "Pizza";
                price = 200;
                break;

            case 2:
                food = "Burger";
                price = 100;
                break;

            case 3:
                food = "Biryani";
                price = 150;
                break;

            case 4:
                food = "Sandwich";
                price = 80;
                break;

            case 5:
                System.out.println("Thank you!");
                return;

            default:
                System.out.println("Invalid option");
                return;
        }

        int total = price * quantity;

        System.out.println("\nFood: " + food);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: ₹" + total);

        sc.close();
    }
}


