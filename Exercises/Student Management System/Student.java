import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    // Private Fields
    private String id;
    private String gradeLevel;
    private String major;
    private List<Course> courses;
    private List<Grade> grades;

    // Constructor
    public Student() {
        super();
        id = "";
        gradeLevel = "";
        major = "";
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public Student(String name, int age, String address, String email, String id, String gradeLevel, String major) {
        super(name, age, address, email);
        this.id = id;
        this.gradeLevel = gradeLevel;
        this.major = major;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public Student(String name, int age, String address, String id, String gradeLevel, String major) {
        super(name, age, address);
        this.id = id;
        this.gradeLevel = gradeLevel;
        this.major = major;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getMajor() {
        return major;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public void study() {
        System.out.println(getName() + "is studying");
    }

    public void rateTeacher(int rating, Teacher teacher) {
        teacher.setRating(rating);
    }

    public void takeExam() {
        System.out.println(getName() + "is taking an exam");
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", gradeLevel=" + gradeLevel + ", major=" + major + ", courses=" + courses
                + ", grades=" + grades + ", getName()=" + getName() + "]";
    }
}
