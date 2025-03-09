public class ProjectOneTester {
    public static void main(String[] args) {
    // Create a Student object
    Student student = new Student("Michael Guo", "501295175");

    // Add courses to the academic record with grades
    student.addCourse(new Course("Calculus", "MTH 207", 3, 87.5));
    student.addCourse(new Course("Computer Organization", "CPS 310", 4, 92.0));
    student.addCourse(new Course("Computer Science II", "CPS 209", 2, 78.3));

    // Display the student's summary
    System.out.println("Student Summary:");
    student.printStudentSummary();

    // Calculate and display the average grade
    double averageGrade = student.calculateAverageGrade();
    System.out.printf("Average Grade: %.2f%n", averageGrade);

    // Display the course with the highest grade
    Course highestGradeCourse = student.getHighestGradeCourse();
    if (highestGradeCourse != null) {
        System.out.println("Course with the Highest Grade:");
        System.out.println(highestGradeCourse);
    }

    // Display the course with the lowest grade
    Course lowestGradeCourse = student.getLowestGradeCourse();
    if (lowestGradeCourse != null) {
        System.out.println("Course with the Lowest Grade:");
        System.out.println(lowestGradeCourse);
    }

    // Sort and display courses
    System.out.println("\nCourses (Sorted by Name):");
    student.sortCourses();
    student.displayCourses();

    // Remove a course and display the updated list
    System.out.println("\nRemoving course: CPS 310");
    boolean removed = student.removeCourse("CPS 310");
    if (removed) {
        System.out.println("Course removed successfully.");
    } else {
        System.out.println("Course not found.");
    }

    System.out.println("\nUpdated Courses:");
    student.displayCourses();
    }
}
