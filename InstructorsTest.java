package application;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;	

class InstructorsTest {

    @Test
    public void testInstructorId() {
        // Create a new Instructors object with the instructor ID "123456789".
        Instructors instructors = new Instructors("1", "Borst", "Cheryl");

        // Check that the instructor ID is correct.
        Assertions.assertEquals("1", instructors.getInstructorId());
    }

    @Test
    public void testLastName() {
        // Create a new Instructors object with the last name "Smith".
        Instructors instructors = new Instructors("2",  "Smith", "Jane");

        // Check that the last name is correct.
        Assertions.assertEquals("Smith", instructors.getLastName());
    }

    @Test
    public void testFirstName() {
        // Create a new Instructors object with the first name "John".
        Instructors instructors = new Instructors("3",  "John", "Doe");

        // Check that the first name is correct.
        Assertions.assertEquals("John", instructors.getFirstName());
    }
}
