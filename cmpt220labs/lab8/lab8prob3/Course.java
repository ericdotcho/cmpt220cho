import java.util.ArrayList;

public class Course {
	// Data fields
	private String courseName;
	private ArrayList<String> students;

	// constructor
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	// methods
	//adds a student to the list 
	public void addStudent(String student) {
		students.add(student);
	}

	//returns
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}

	// drop a student
	public void dropStudent(String student) {
		students.remove(student);
	}
}