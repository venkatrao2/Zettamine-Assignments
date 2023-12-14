package Day03;
public class StudentC {
	static int sid = 100;
	private String studentId;
	private String studentName;
	private String studentEmail;
	private static String collegeName = "Zettamine CE";
	

	public StudentC(String studentName,String studentEmail) {
		super();
		this.studentId = generateId();
		this.studentName=studentName;
		this.studentEmail  =studentEmail;
	}
	private String generateId() {
		
		return "ZETTA_"+(++sid);
	}


	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-25s | %-12s", studentId, studentName, studentEmail, collegeName );
	}
		 
	}
	
	
	


