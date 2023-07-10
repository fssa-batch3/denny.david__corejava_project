package day03.practice;

class Employee {
	 
    public int id;
    public String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
   
}

public class TestEmployee {
	 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        System.out.println(e1.id+e1.name);
        Employee e2 = new Employee(2, "suresh");
        System.out.println(e2.id+e2.name);
    }
}