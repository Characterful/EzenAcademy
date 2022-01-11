package ezen;
import java.util.Scanner;
public class BankAppliaction {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int blance = scanner.nextInt();
		int i=0;
		while(true) {
			if(accountArray[i] != null)
				i++;
			else {
				accountArray[i] = new Account(ano, owner, blance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
			
		}
	}
	
	private static void accountList() {
		int i=0;
		while(accountArray[i] != null) {
			System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBlance());
			i++;
		}
	}
	
	private static void deposit() {
		System.out.println("----");
		System.out.println("예금");
		System.out.println("----");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int blance = scanner.nextInt();
		
		blance = findAccount(ano).getBlance() + blance;
		findAccount(ano).setBlance(blance);
		
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("----");
		System.out.println("출금");
		System.out.println("----");
		
		System.out.print("계좌번호: ");
		
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int blance = scanner.nextInt();
		
		blance = findAccount(ano).getBlance() - blance;
		findAccount(ano).setBlance(blance);
		
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		int i=0;
		while(true) {
			if(!accountArray[i].getAno().equals(ano))
				i++;
			else
				break;
		}
			
		return accountArray[i];
	}
		
	
}
