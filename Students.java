package application;

public class Students {

	    private String studentId;
	    private String lastName;
	    private String firstName;
	  
	    public Students(String studentId, String lastName, String firstName) {
	        this.studentId = studentId;
	        this.lastName = lastName;
	        this.firstName = firstName;
	    }

	    public String getStudentId() {
	        return studentId;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public String getFirstName() {
	        return firstName;
	    }

	}

