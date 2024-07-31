import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String teacherId;
    private int rating;
    private String department;
    private List<Course> courses;

    public Teacher() {
        super();
        teacherId = "";
        rating = 0;
        department = "";
        courses = new ArrayList<>();
    }

    public Teacher(String name, int age, String address, String email, String teacherId, int rating,
            String department) {
        super(name, age, address, email);
        this.teacherId = teacherId;
        this.rating = rating;
        this.department = department;
        courses = new ArrayList<>();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void teach() {
        System.out.println(getName() + "is teaching");
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + ", rating=" + rating + ", department=" + department + ", courses="
                + courses + ", getName()=" + getName() + "]";
    }
}
