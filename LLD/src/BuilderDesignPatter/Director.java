package BuilderDesignPatter;

public class Director {
	
	StudentBuilder studentBuilder;
	
	Director(StudentBuilder studentBuilder) {
		this.studentBuilder = studentBuilder;
	}
	
	public Student createStudent() {
		
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}
		else if(studentBuilder instanceof MBAStudentBuilder) {
			return createMBAStudent();
		}
		return null;
	}

	private Student createEngineeringStudent() {
		return  studentBuilder.setRollNumber(2).setAge(33).setFatherName("pradeep").setName("sj").setSubjects().build();
	}
	
	private Student createMBAStudent() {
		return studentBuilder.setRollNumber(211).setAge(331).setName("sj").setSubjects().build();
	}
}
