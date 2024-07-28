import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    // Private Fields
    private String id;
    private String name;
    private ArrayList<Double> grades;

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Methods

    // Add a grade
    public void addGrade(double grade) {
        grades.add(grade);
        System.out.println("Grade added successfully");
    }

    // Calculate average grade
    public double calculateAverage() {
        int sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Return Student Info
    public void getInfo() {
        System.out.println("Student Name: " + name + "\nID: " + id + "\nAverage Grade: " + calculateAverage());
    }

}
