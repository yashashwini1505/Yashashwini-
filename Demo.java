package day4;

public class Demo {
	public static void main(String[] args) {
		int n=100000;
		int[] student =new int[n];
		
		for(int i=0 ;i< n ;i++) {
			student[i]=i+1;
			
			
		}
		int target = 1000;
		boolean found= false;
		for(int i=0; i<n;i++) {
			for(int j=0; j<0; j++) {
				if (student[j]==target) {
					found=true;
					
				}
			}
			if(found) {
				break;
				
			}
			System.out.println("student found:"+found);
		}
	}

}
