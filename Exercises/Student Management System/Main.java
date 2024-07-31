public class Main {
    public static void main(String[] args) {
        // School
        School school = new School("Fort Hamilton HS");

        // Create teachers
        Teacher teacher1 = new Teacher("Mr. Smith", 35, "1234 5th av", "mrsmith@gmail.com", "1234", 5, "Science");
        Teacher teacher2 = new Teacher("Mr. Johnson", 40, "1234 6th av", "mrsmith@gmail.com", "1126", 5, "Science");

        // Create courses
        Course course1 = new Course("CHEM 1010", teacher1);
        Course course2 = new Course("MATH 1010", teacher2);

        // Create students
        Student student1 = new Student("John Doe", 16, "1234 7th av", "johndoe@gmail.com", "1234", "Sophomore",
                "Science");
        Student student2 = new Student("Jane Doe", 17, "1234 8th av", "janedoe@gmail.com", "1235", "Junior", "Math");

        // Add courses to the school
        school.addCourse(course1);
        school.addCourse(course2);

        // Add teachers to the school
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        school.enrollStudentInCourse(student1, course1);
        school.enrollStudentInCourse(student2, course2);

        // Assign teachers to courses
        school.assignTeacherToCourse(teacher1, course1);
        school.assignTeacherToCourse(teacher2, course2);

        // Assign grades
        school.assignGrade(student1, course1, 96);
        school.assignGrade(student2, course2, 98);

        // Output some information
        System.out.println("School: " + school.getName());
        System.out.println("Students:");
        for (Student student : school.getStudents()) {
            System.out.println("  " + student.getName() + " (ID: " + student.getId() + ")");
        }
        System.out.println("Teachers:");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println("  " + teacher.getName() + " (ID: " + teacher.getTeacherId() + ")");
        }
        System.out.println("Courses:");
        for (Course course : school.getCourses()) {
            System.out.println("  " + course.getCourseName() + " (Teacher: " + course.getTeacher().getName() + ")");
            System.out.println("  Students:");
            for (Student student : course.getStudents()) {
                System.out.println("    " + student.getName());
            }
        }
        System.out.println("Grades:");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName() + "'s grades:");
            for (Grade grade : student.getGrades()) {
                System.out.println("  " + grade.getCourse().getCourseName() + ": " + grade.getGrade());
            }
        }
    }
}