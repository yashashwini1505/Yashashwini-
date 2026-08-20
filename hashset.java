package day4;
import java.util.HashSet;

public class hashset{ 
 
    public static void main(String[] args) { 
 
        int[] numbers = {10, 20, 30, 40, 50}; 
        int target = 40; 
 
        boolean found = false; 

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }

        if (set.contains(target)) {
            found = true;
        }
 
        if (found) { 
            System.out.println("Number found"); 
        } else { 
            System.out.println("Number not found"); 
        } 
    } 
}
