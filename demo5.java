package day2;
class Parents
	{
	   void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class demo5 extends Parents {
		void marry()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			demo5 test = new demo5();// object
			test.marry();
			test.property();
		
		}
	}
	

