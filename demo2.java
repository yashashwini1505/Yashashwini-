package day2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}


public class demo2 extends Abc{

	public	void with()
	{
		System.out.println("With");
	}

	
public static void main(String[] args) {
	demo2   v = new demo2();
	v.depo();
	v.with();
}
}
