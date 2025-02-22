package OOP;

public class ClassExample {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Akash", -1);
        System.out.println(s1.roll_no + " " + s1.name);

        // Uncomment these lines to test default constructor
        // Student Akash = new Student();
        // Akash.marks = -1;
        // Akash.roll_no = 9;
        // Akash.name = "mental";
        // System.out.println("Name: " + Akash.name);
        // System.out.println("Roll No: " + Akash.roll_no);
        // System.out.println("Marks: " + Akash.marks);
    }
}

//   (loc)                     can be created in another file in an same/different package but i'm too lazy and files become too complicated
class Student {
    int roll_no;
    String name;
    int marks;

    // Default constructor
    Student() {
        System.out.println("Constructor is a method that is automatically called");
        this.roll_no = 1;
        this.name = "Default name";
        this.marks = -99;
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    // Parameterized constructor
    Student(int r, String n, int m) {
        this.roll_no = r;
        this.name = n;  // Use the provided name instead of hardcoded one
        this.marks = m;
    }

    // Calling a constructor from another constructor
    Student(int dummy) {
        this(1, "Singam", 69); // Calls the parameterized constructor
    }
}

