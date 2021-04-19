package day14;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<BankDTO> list = new ArrayList<BankDTO>();
		boolean run = true;
		int select = 0; // 선택
		String name = ""; // 이름
		String account = ""; // 계좌
		int input = 0; // 입금
		int balance = 0; // 총액

		while (run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.고객등록  ㅣ  2.고객등록(생성자)  ㅣ  3.입금  ㅣ  4.출금  ㅣ  5.고객리스트  ㅣ  6.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택 > ");
			select = scan.nextInt();

			if (select == 1) {
				BankDTO b1 = new BankDTO();
				int number = list.size() + 1;
				b1.setClientNumber(number);
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				b1.setName(name);
				System.out.print("계좌를 입력하세요 : ");
				account = scan.next();
				b1.setAccountNumber(account);
				System.out.print("입금할 금액을 입력하세요 : ");
				input = scan.nextInt();
				b1.setBalance(input + balance);
				list.add(b1);

			} else if (select == 2) {
				BankDTO b1 = new BankDTO(0, name, account, input);
				int number = list.size() + 1;
				b1.setClientNumber(number);
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				b1.setName(name);
				System.out.print("계좌를 입력하세요 : ");
				account = scan.next();
				b1.setAccountNumber(account);
				System.out.print("입금할 금액을 입력하세요 : ");
				input = scan.nextInt();
				b1.setBalance(input + balance);
				list.add(b1);

			} else if (select == 3) {

				System.out.print("계좌를 입력하세요 : ");
				account = scan.next();

				System.out.print("입금금액을 입력하세요 : ");
				input = scan.nextInt();

				for (int i = 0; i < list.size(); i++) {
					if (account.equals(list.get(i).getAccountNumber())) {
						balance = list.get(i).getBalance() + input;
						list.get(i).setBalance(balance);
					}
				}

			} else if (select == 4) {
				System.out.print("계좌를 입력하세요 : ");
				account = scan.next();

				System.out.print("출금금액을 입력하세요 : ");
				int output = scan.nextInt();

				for (int i = 0; i < list.size(); i++) {
					if (account.equals(list.get(i).getAccountNumber())) {
						balance = list.get(i).getBalance() - output;
						list.get(i).setBalance(balance);
					}
					
				}
			} else if (select == 5) {
				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j));
			}
		} else if (select == 6) {
			System.out.println("종료합니다.");
			
		}
	}
}
}