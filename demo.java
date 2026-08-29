package day8;
	class Student {

	    
	    private int id;
	    private String name;

	  
	    public void setId(int id) {
	        this.id = id;
	    }

	    
	    public int getId() {
	        return id;
	    }

	    
	    public void setName(String name) {
	        this.name = name;
	    }

	  	    public String getName() {
	        return name;
	    }
	}

	public class demo {
	    public static void main(String[] args) {

	        Student s = new Student();

	        
	        s.setId(101);
	        s.setName("Anand");

	        
	        System.out.println("Student ID: " + s.getId());
	        System.out.println("Student Name: " + s.getName());
	    }
	}
