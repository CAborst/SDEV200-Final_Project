package application;
import static org.junit.Assert.*;				
import org.junit.Test;	

class CoursesTest {

    @Test
    public void testCourses() {
        // Create a new Courses object.
        Courses courses = new Courses("Pottery1", "This course provides clay pottery.", 100.00, "123456789");

        // Check the values of the properties.
        assertEquals("Pottery1", courses.getCourseName());
        assertEquals("This course provides clay pottery.", courses.getCourseDescription());
        assertEquals(100.00, courses.getBaseFee(), 0.01);
        assertEquals("123456789", courses.getInstructorId());
    }

    @Test
    public void testCourseName() {
        // Create a new Courses object with a different course name.
        Courses courses = new Courses("Live Drawings", "Live model studio.", 150.00, "987654321");

        // Check the value of the course name property.
        assertEquals("Live Drawings", courses.getCourseName());
    }

    @Test
    public void testCourseDescription() {
        // Create a new Courses object with a different course description.
        Courses courses = new Courses("Paper art", "This course covers construction of things that look like airplanes.", 200.00, "765432109");

        // Check the value of the course description property.
        assertEquals("This course covers construction of things that look like airplanes.", courses.getCourseDescription());
    }

    @Test
    public void testBaseFee() {
        // Create a new Courses object with a different base fee.
        Courses courses = new Courses("Chemistry", "This course covers the fundamentals of chemistry.", 250.00, "098765432");

        // Check the value of the base fee property.
        assertEquals(250.00, courses.getBaseFee(), 0.01);
    }

    @Test
    public void testInstructorId() {
        // Create a new Courses object with a different instructor ID.
        Courses courses = new Courses("Calculus", "This course covers the fundamentals of calculus.", 300.00, "321098765");

        // Check the value of the instructor ID property.
        assertEquals("321098765", courses.getInstructorId());
    }
}
