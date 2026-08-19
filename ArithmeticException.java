package day3;

public class ArithmeticException {
		public static void main(String[] args) {
			System.out.println("Hello");

			try {
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println(" exception handle" );
			}
			System.out.println("Hello sir");
		}

	}


