package day3;

public class demo1 extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("method"+i);
			
		}
	}
	public static void main(String[] args) {
		demo1 bb= new demo1();
		bb.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method"+i);
			
		}
	}

}
