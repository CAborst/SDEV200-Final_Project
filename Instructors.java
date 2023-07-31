package application;

public class Instructors {
	 
	private String instructorId;
	    private String name;

	    public Instructors(String instructorId, String name) {
	        this.instructorId = instructorId;
	        this.name = name;
	    }

	    public String getInstructorId() {
	        return instructorId;
	    }
	    public String getName() {
	        return name;
	    }
	}
