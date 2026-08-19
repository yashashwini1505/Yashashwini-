package day2;
interface Atm {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}

public class demo3 implements Atm, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		demo3 v = new demo3();
		v.min();
		v.depo();
	}
} 


