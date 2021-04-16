package day14;

import java.util.*;

public class PeopleMain {

	public static void main(String[] args) {
		
		People p = new People();
		
		List<People> peopleList = new ArrayList<People>();
		
		p.setName("이름");
		p.setrNumber("111111-2222222");
		p.setAddress("인천");
		p.setAge(20);
		
		People p2 = new People();
		p2.setName("이름2");
		p2.setrNumber("222222-1111111");
		p2.setAddress("서울");
		p2.setAge(21);
		
		People p3 = new People();
		p3.setName("이름3");
		p3.setrNumber("333333-1112222");
		p3.setAddress("대구");
		p3.setAge(22);
		
		peopleList.add(p);
		peopleList.add(p2);
		peopleList.add(p3);
				
		for(int i = 0; i < peopleList.size(); i++) {
//			System.out.println(peopleList.get(i).getName());
//			System.out.println(peopleList.get(i).getrNumber());
//			System.out.println(peopleList.get(i).getAddress());
//			System.out.println(peopleList.get(i).getAge());
			System.out.println(peopleList.get(i));
			// 이렇게 쓸 수 있다.
		}
	
//		System.out.println(peopleList.get(0));
//		System.out.println(p);
//		System.out.println(p.toString());
		//셋이 같은거
		
	}

}
