package day8;
import java.util.*;
public class sliding_window {
	public static void main(String[] args) {
		int[] arr = {1, 2, 6, 5, 3, 7, 8, 9};
		int k = 3;
		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < arr.length; i++) {
			while (!queue.isEmpty() && queue.peekFirst() <= i - k) {
				queue.removeFirst();
		            }
			while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[i]) {
		                queue.removeLast();
		            }

		           
		            queue.addLast(i);

		            if (i >= k - 1) {
		                System.out.print(arr[queue.peekFirst()] + " ");
		            }
		        }
		    }
		}
