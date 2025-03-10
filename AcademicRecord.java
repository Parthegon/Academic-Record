//Import the necessary packages
import java.util.ArrayList;
import java.util.Collections;

public class AcademicRecord {
    //Instance Variables
    private ArrayList<Course> courses;

    //Constructor
    public AcademicRecord() {
        courses = new ArrayList<Course>();
    }

    //Method to add a course to the list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }

    //Remove a course from the list of courses
    public boolean removeCourse(String courseCode) {
        for (Course course: courses) {
            if (course.getCourseCode().equals(courseCode)) {
                courses.remove(course);
                return true;
            }
        }
        return false;
    }

    //Calculate Average Grade
    public double calculateAverageGrade() {
        if (courses.isEmpty()) return 0.0;

        double totalGrade = 0;
        for (Course course: courses) {
            totalGrade += course.getCourseGrade();
        }
        return totalGrade / courses.size();
    }

    //Find course with highest grade
    public Course getHighestGradeCourse() {
        if (courses.isEmpty()) return null;
        
        Course highest = courses.get(0);
        for (Course course: courses) {
            if (course.getCourseGrade() > highest.getCourseGrade()) {
                highest = course;
            }
        }
        return highest;
    }

    //Find course with lowest grade
    public Course getLowestGradeCourse() {
        if (courses.isEmpty()) return null;
        
        Course lowest = courses.get(0);
        for (Course course: courses) {
            if (course.getCourseGrade() < lowest.getCourseGrade()) {
                lowest = course;
            }
        }
        return lowest;
    }

    //Sort courses by course code
    public void sortCourses() {
        Collections.sort(courses);
    }

    //Display all courses
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses in the academic record.");
        } else {
            for (Course course: courses) {
                System.out.println(course);
            }
        }
    }
}
