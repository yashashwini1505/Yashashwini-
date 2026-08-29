package day8;
import java.util.*;

public class CustomComparatorDemo1 {

    class Emp {
        String name;
        String department;
        int salary;

        Emp(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String toString() {
            return name + "-" + department + "-" + salary;
        }
    }

    public static void main(String[] args) {

        List<Emp> employees = Arrays.asList(
            new CustomComparatorDemo1().new Emp("ravi", "IT", 600000),
            new CustomComparatorDemo1().new Emp("Alice", "HR", 700000),
            new CustomComparatorDemo1().new Emp("Anil", "IT", 800000),
            new CustomComparatorDemo1().new Emp("aditya", "HR", 900000),
            new CustomComparatorDemo1().new Emp("rahul", "IT", 400000)
        );

        
        employees.sort(
            Comparator.comparing((Emp e) -> e.salary)
        );

        for (Emp e : employees) {
            System.out.println(e);
        }
    }
}