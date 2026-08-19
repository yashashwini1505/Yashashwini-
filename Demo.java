package day3;
class MyThread implements Runnable{
	public void run() {
		
for(int i=1;i<=5;i++)	{

	System.out.println("Thread:"+ i);
}
}
}

public class Demo {
	public static void main(String[] args) {
		MyThread obj=new MyThread();
		Thread t= new Thread(obj);
		t.start();
		
		
		
		
	}
	
}
