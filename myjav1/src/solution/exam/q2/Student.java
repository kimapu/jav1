package solution.exam.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

	private final int SUBJECT_MAX = 4;
	List<Double> marksLst = new ArrayList<>(SUBJECT_MAX);
	
	public Student() {}

	public Double[] getMarks() {
		return marksLst.toArray( Double[] :: new );
	}	
	
	public void addMarks(double m) {
		marksLst.add(m);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.addMarks(10);
		s1.addMarks(20);
		s1.addMarks(30);
		s1.addMarks(40);

		//display
		System.out.println( ">> Marks List..." );
		Arrays.stream(s1.getMarks()).forEach(System.out :: println);
		
		//average
		System.out.print( "\nAverage: ");
		Arrays.stream(s1.getMarks())
			.mapToDouble(Double :: doubleValue).average().ifPresent(System.out::println);
		
	}
	
}
