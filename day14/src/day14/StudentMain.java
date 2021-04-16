package day14;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student();
//		setter를 이용하여 필드값 지정		
//		s.name = "학생";
		s.setName("학생");
//		s.phone = "010-1111-2222";
		s.setPhone("010-1111-2222");
//		s.address = "인천";
		s.setAddress("인천");
		
		// getter를 이용하여 필드값 가져오기
		String var2 = s.getName();
		System.out.println(var2);
		
		System.out.println(s.getAddress());
						
//		List<String> list = new ArrayList<String>();
//		list.add(s.name);
//		list.add(s.phone);
//		list.add(s.address);
//		
//		System.out.println(list);
		
		
		Student s2 = new Student("학생2" , "010-2222-1111" , "서울");
		
		// Student 객체를 ArrayList에 저장하기.
		// Student 객체를 담을 수 있는 ArrayList 필요
		
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(s);
		stuList.add(s2);
		
		// stuList의 0번 인덱스에 저장한 s 의 name값 출력해보기
		System.out.println(stuList.get(0).getName());
		System.out.println(stuList.get(1).getName());
	
		String var1 = stuList.get(0).getName();
		System.out.println(var1);
		
		stuList.get(1).setName("학생2이름변경"); 
		System.out.println(stuList.get(1).getName());
		
		
		
	}

}
