package day01.practice;

public class Cat {
    // Attributes
    private String age;
    private String color;
  
//Age: 4
//    Color: White
//    Speaks: Meow!
//    Cat 2:
//    Age: 3
//    Color: Black
//    Speaks: Meow!
    // Constructor
    public Cat(String age, String color) {
        this.age = age;
        this.color = color;
    }

    // Getters and setters
    public String age() {
        return age;
    }

    public void setage(String age ) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

		public String speak() {
        return "Meow!";
    }
 
    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat("4", "white");
        Cat cat2 = new Cat("3", "black");

        // Print the attributes of each Dog
        System.out.println("Dog 1:");
        System.out.println("age: " + cat1.age());
        System.out.println("Color: " + cat1.getColor());
	    System.out.println("Speaks: " + cat1.speak());
         System.out.println();
        System.out.println("Dog 2:");
        System.out.println("age: " + cat2.age());
        System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.speak());
    }
    
}