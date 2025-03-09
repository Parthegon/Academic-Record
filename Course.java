public class Course implements Comparable<Course>{
    // Instance Variables
    private String courseName;
    private String courseCode;
    private int courseCredit;
    private double courseGrade;

    /**
     * Constructor to initialize a Course object with a name, code, credit, and grade
     * @param courseName The name of the course
     * @param courseCode The code representing the course
     * @param courseCredit The number of credits the course is worth
     * @param courseGrade The grade the student received in the course
     */
    public Course(String courseName, String courseCode, int courseCredit, double courseGrade) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
        this.courseGrade = courseGrade;
    }

    /**
     * Gets the name of the course
     * @return The course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Gets the code representing the course
     * @return The course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Gets the number of credits the course is worth
     * @return The course credit
     */
    public int getCourseCredit() {
        return courseCredit;
    }

    /**
     * Gets the grade the student received in the course
     * @return The course grade
     */
    public double getCourseGrade() {
        return courseGrade;
    }

    /**
     * Sets the name of the course
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Sets the code representing the course
     * @param courseCode
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    /**
     * Sets the number of credits the course is worth
     * @param courseCredit
     */
    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    /**
     * Sets the grade the student received in the course
     * @param courseGrade
     */
    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }

    /**
     * Returns a string representation of the course
     * @return The course name, code, credit, and grade
     */
    @Override
    public String toString() {
        return "Course Name: " + courseName + "\nCourse Code: " + courseCode + "\nCourse Credit: " + courseCredit + "\nCourse Grade: " + courseGrade;
    }

    /**
     * Compares two Course objects based on their course code
     * @param obj The object to compare to
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Course)) return false;
        Course other = (Course) obj;
        return this.courseCode.equals(other.courseCode);
    }

    /**
     * Compares two Course objects based on their course name
     * @param other The Course object to compare to
     */
    @Override
    public int compareTo(Course other) {
        return this.courseName.compareTo(other.courseName); // Sort alphabetically by courseName
    }
}
