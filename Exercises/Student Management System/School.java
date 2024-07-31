import java.util.ArrayList;
import java.util.List;

public class School implements SchoolOperations {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    @Override
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        student.addCourse(course);
        course.addStudent(student);
    }

    @Override
    public void assignTeacherToCourse(Teacher teacher, Course course) {
        teacher.addCourse(course);
        course.setTeacher(teacher);
    }

    @Override
    public void assignGrade(Student student, Course course, int grade) {
        Grade assignedGrade = new Grade(grade, student, course);
        student.addGrade(assignedGrade);
    }

    @Override
    public String toString() {
        return "School [name=" + name + ", students=" + students + ", teachers=" + teachers + ", courses=" + courses
                + "]";
    }
}
