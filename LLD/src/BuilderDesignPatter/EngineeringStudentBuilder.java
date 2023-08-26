package BuilderDesignPatter;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<>();
		subs.add("OSA");
		subs.add("OS");
		subs.add("computer Architecture");
		this.subjects = subs;
		return this;
	}

	

}
