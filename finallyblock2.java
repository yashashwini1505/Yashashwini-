package day3;

public class finallyblock2 {
	public static void main(String[] args) {
		System.out.println("anand");
		System.out.println("anand3");
		int a = 10 / 0;
		try {
			System.out.println("kishore");
		}
	
		finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}


