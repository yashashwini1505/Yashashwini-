package day8;
import java.util.*;
class demo3 {
	String name;
	String department;
	int salary;
	demo3(String name, String department, int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
		
	}
	public String toString() {
		return name+"-"+department+"-"+salary;
	}
}
public class employee{
	public static void main(String[] args) {
		List<demo3> employees = Arrays.asList(
			new demo3("Ravi", "IT", 600000),
			new demo3("Anil", "HR", 500000),
			new demo3("Priya", "IT", 500000),
			new demo3("Bhoomi", "HR", 600000),
			new demo3("Akash", "AT", 500000)
		);
		employees.sort(
				Comparator.comparing((demo3 e) ->e.department)
					.thenComparing((demo3 e)->e.salary,Comparator.reverseOrder())
					.thenComparing(e -> e.name)
		);
		for (demo3 e:employees) {
			System.out.println(e);
		}
	}
}