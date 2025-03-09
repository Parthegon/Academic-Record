public class Student extends AcademicRecord {
    //Instance Variables
    private String studentName;
    private String studentID;

    /**
     * Constructor to initialize a Student object with a name and ID
     * @param studentName
     * @param studentID
     */
    public Student(String studentName, String studentID) {
        super();
        this.studentName = studentName;
        this.studentID = studentID;
    }

    /**
     * Gets the student's name
     * @return The student's name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Gets the student's ID
     * @return The student's ID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Sets the student's name
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Sets the student's ID
     * @param studentID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Display the Student's name and ID
     */
    @Override
    public String toString() {
        return "Student Name: " + studentName + "\nStudent ID: " + studentID;
    }

    /**
     * Compare two Student objects based on their ID
     * @param obj The object to compare to
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.studentID.equals(other.studentID);
    }

    /**
     * Display the student's name and ID along with the academic record
     */
    public void printStudentSummary() {
        System.out.println(this);
        System.out.println("Academic Record:");
        displayCourses();
    }
    
}
