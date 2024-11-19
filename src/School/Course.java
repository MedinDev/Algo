package School;

class Testing  {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        String[] students = course1.getStudents();
        System.out.println("The default capacity for students in course1: " + students.length);

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Susan Kennedy");
        course1.addStudent("John Kennedy");
        course1.addStudent("Kim Johnson");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

        course1.dropStudent("Susan Kennedy");
        course1.dropStudent("Kim Johnson");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }

        course1.clear();
        System.out.println("\nNumber of students in course1: " + course1.getNumberOfStudents());
    }
}

class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor: Initializes the course with the given name and an initial capacity of 4 students
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[4];
        this.numberOfStudents = 0;
    }

    // Returns the name of the course
    public String getCourseName() {
        return courseName;
    }

    // Adds a student to the course, dynamically increasing the array size if needed
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            // Expand the array size by doubling its capacity
            String[] newStudents = new String[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
        students[numberOfStudents++] = student;
    }

    // Drops a student from the course if they are in the list
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Shift all elements after the dropped student to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null; // Remove the duplicate entry
                numberOfStudents--;
                return;
            }
        }
    }

    // Returns the array of students in the course
    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, currentStudents, 0, numberOfStudents);
        return currentStudents;
    }

    // Returns the number of students in the course
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Removes all students from the course
    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}
