
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class College {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("CSE", "Bharu", 90));
		students.add(new Student("EEE", "SaiKumar", 80));
		students.add(new Student("Mech", "Venkat", 85));
		students.add(new Student("CSE", "Shaheen", 89));
		students.add(new Student("EEE", "Santhosh", 74));
		students.add(new Student("Mech", "Sitha Ram", 74));
		students.add(new Student("CSE", "Sirisha", 93));
		students.add(new Student("Civil", "Mohan", 70));
		students.add(new Student("Mech", "Halini", 95));

		Map<String, List<Student>> studentByBranch = new HashMap<>();

		for (Student st : students) {
			String Branch = st.getBranch();
			if (!studentByBranch.containsKey(Branch)) {
				studentByBranch.put(Branch, new ArrayList<Student>());
			}
			studentByBranch.get(Branch).add(st);
		}

		

		for (String Branch : studentByBranch.keySet()) {
            List<Student> branchStudents = studentByBranch.get(Branch);

		int totalMarks = 0;
		for (Student student : branchStudents) {
			totalMarks = totalMarks + student.getMarks();
		}

		double avarageMarks = (double) totalMarks / branchStudents.size();
		System.out.println("Branch: " + Branch);
		System.out.println("Average Marks: " + avarageMarks);
		
		
		System.out.println("Students:");
		 for (Student student : branchStudents) {
	            System.out.print(student.getStudent() + ",");
	        }
               System.out.println();
	}

}
}

class Student{
	private String branch;
	private String student;
	private int marks;
	
	
	public Student(String branch, String student, int marks) {
		super();
		this.branch = branch;
		this.student = student;
		this.marks = marks;
	}


	public String getBranch() {
		return branch;
	}


	public String getStudent() {
		return student;
	}


	public int getMarks() {
		return marks;
	}
	
	
}
