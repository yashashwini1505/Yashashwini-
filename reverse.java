package day2;
public class reverse {
	public static void main(String[]args) {
		String original="Hello";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println("Orginal :" + original);
		System.out.println("Reversed :" + reversed);
	}
}

