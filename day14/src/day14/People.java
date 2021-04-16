package day14;

public class People {

	private String name;
	private String rNumber;
	private String address;
	private int age;
	
	People(){
		
	}
	
	People(String name , String rNumber , 
			String address , int age){
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getrNumber() {
		return rNumber;
	}

	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
