package day14;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "학생";
		s.phone = "010-1111-2222";
		s.address = "인천";
		
		List<String> list = new ArrayList<String>();
		list.add(s.name);
		list.add(s.phone);
		list.add(s.address);
		
		System.out.println(list);
		
		

	}

}
