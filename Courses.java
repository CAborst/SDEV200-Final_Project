package application;

public class Courses {

    private String courseName;
    private String courseDescription;
    private double baseFee;
    private String instructorId;

    public Courses(String courseName, String courseDescription, double baseFee, String instructorId) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.baseFee = baseFee;
        this.instructorId = instructorId;
    }

    public String getCourseName() {
        return courseName;
    } 
    public String getCourseDescription() {
        return courseDescription;
    }
    public double getBaseFee() {
        return baseFee;
    }
    public String getInstructorId() {
        return instructorId;
    }

    public static void main(String[] args) {
    }
}

