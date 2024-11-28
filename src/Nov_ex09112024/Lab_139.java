package Nov_ex09112024;

public class Lab_139 {
        public static void main(String[] args) {
            // Creating a Student object using the parameterized constructor
            Student student1 = new Student(101, "John Doe", 85.5);
            System.out.println("Student Details:");
            System.out.println("ID: " + student1.getId());
            System.out.println("Name: " + student1.getName());
            System.out.println("Grade: " + student1.getGrade());

            // Modifying student details using setters
            student1.setName("John Smith");
            student1.setGrade(90.0);

            System.out.println("\nUpdated Student Details:");
            System.out.println("ID: " + student1.getId());
            System.out.println("Name: " + student1.getName());
            System.out.println("Grade: " + student1.getGrade());

            // Creating another student using the default constructor
            Student student2 = new Student();
            student2.setId(102);
            student2.setName("Jane Doe");
            student2.setGrade(88.0);

            System.out.println("\nNew Student Details:");
            System.out.println("ID: " + student2.getId());
            System.out.println("Name: " + student2.getName());
            System.out.println("Grade: " + student2.getGrade());
        }
}

class Student {
    // Private fields to enforce encapsulation
    private int id;
    private String name;
    private double grade;

    // Parameterized constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Default constructor
    public Student() {
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Grade
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

