package day14;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Bank> list = new ArrayList<Bank>();
		boolean run = true;
		int select = 0;
		String name = "";
		String account = "";
		int input = 0;
		
		Bank b = new Bank();
		
		
		while(run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.고객등록  ㅣ  2.고객등록(생성자)  ㅣ  3.입금  ㅣ  4.출금  ㅣ  5.고객리스트  ㅣ  6.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택 > ");
			select = scan.nextInt();
			if(select == 1) {
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				b.setName(name);
				System.out.print("계좌를 입력하세요 : ");
				account = scan.next();
				b.setAccountNumber(account);
				System.out.print("입금할 금액을 입력하세요 : ");
				input = scan.nextInt();
				b.setBalance(input);
				list.add(b);
			
			} else if(select == 2) {
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				
				
			} 
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
