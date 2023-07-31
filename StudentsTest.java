package application;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class StudentsTest {

    @Test
    public void testStudentId() {
        // Create a new Students object with the student ID "123456789".
        Students students = new Students("1", "Doe", "John");

        // Check that the student ID is correct.
        Assertions.assertEquals("123456789", students.getStudentId());
    }

    @Test
    public void testLastName() {
        // Create a new Students object with the last name "Doe".
        Students students = new Students("2", "Doe", "Jane");

        // Check that the last name is correct.
        Assertions.assertEquals("Doe", students.getLastName());
    }

    @Test
    public void testFirstName() {
        // Create a new Students object with the first name "Cheryl".
        Students students = new Students("3", "Borst", "Cheryl");

        // Check that the first name is correct.
        Assertions.assertEquals("Cheryl", students.getFirstName());
    }
}
