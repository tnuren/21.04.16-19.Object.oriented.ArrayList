package day14;

import java.util.*;

public class BankService {
// service 클래스 : 처리를 담당하는 클래스(비즈니스 클래스)
	/*
	 * 메소드이름 : deposit 매개변수 : list 리턴 : list (Main이 최신 데이터 필요하니까)
	 */
	Scanner scan = new Scanner(System.in);

	List<BankDTO> deposit(List<BankDTO> list) {
		System.out.print("계좌를 입력하세요 : ");
		String account = scan.next();

		System.out.print("입금금액을 입력하세요 : ");
		int input = scan.nextInt();

		for (int i = 0; i < list.size(); i++) {
			if (account.equals(list.get(i).getAccountNumber())) {
				int balance = list.get(i).getBalance() + input;
				list.get(i).setBalance(balance);
			}
		}
		return list;

	}
	/*
	 * 메소드이름 : withdraw
	 * 매개변수 : list
	 * 리턴 : list
	 */
	
	
	List<BankDTO> withdraw(List<BankDTO> list) {
		System.out.print("계좌를 입력하세요 : ");
		String account = scan.next();

		System.out.print("출금금액을 입력하세요 : ");
		int input = scan.nextInt();

		for (int i = 0; i < list.size(); i++) {
			if (account.equals(list.get(i).getAccountNumber())) {
				int balance = list.get(i).getBalance() - input;
				list.get(i).setBalance(balance);
			}
		}
		return list;
	
	
	
	
	
	}
}