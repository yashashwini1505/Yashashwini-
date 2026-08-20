package day4;
import java.util.ArrayList;
public class salary {
	public static void main(String[] args) {
		        ArrayList<Integer> list = new ArrayList<>();

		        list.add(10000);
		        list.add(15000);
		        list.add(12000);
		        list.add(18000);
		        list.add(20000);


		        int sum = 0;

		        for (int num : list) {
		            sum += num;
		        }

		        System.out.println("Sum = " + sum);
		    }
			}


