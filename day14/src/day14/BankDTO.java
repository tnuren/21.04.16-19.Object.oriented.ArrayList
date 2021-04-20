package day14;

public class BankDTO {
	// DTO : Data Transfer Object => 데이터 전달을 위한 객체
	// => 필드 , 기본생성자 , 매개변수있는생성자 , getter / setter , toString 을 가지고 시작함.
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	BankDTO(){

	}
	
	BankDTO(int clientNumber,String name,
			String accountNumber , int balance	){
		this.clientNumber = clientNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		
		
		
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [clientNumber=" + clientNumber + ", name=" + name + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
