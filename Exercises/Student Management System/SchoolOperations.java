public interface SchoolOperations {
    public void addStudent(Student students);

    public void addTeacher(Teacher teachers);

    public void addCourse(Course courses);

    public void enrollStudentInCourse(Student student, Course course);

    public void assignTeacherToCourse(Teacher teacher, Course course);

    public void assignGrade(Student student, Course course, int grade);
}
