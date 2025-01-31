package comparator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "umang", "em");
		Student st2 = new Student(2, "umang2", "egm");
		Student st3 = new Student(3, "umang3", "emf");
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.sort(null);
		System.out.println(studentList);
	}
}
