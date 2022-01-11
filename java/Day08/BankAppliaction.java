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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		
		System.out.print("������: ");
		String owner = scanner.nextLine();
		
		System.out.print("�ʱ��Աݾ�: ");
		int blance = scanner.nextInt();
		int i=0;
		while(true) {
			if(accountArray[i] != null)
				i++;
			else {
				accountArray[i] = new Account(ano, owner, blance);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
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
		System.out.println("����");
		System.out.println("----");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		
		System.out.print("���ݾ�: ");
		int blance = scanner.nextInt();
		
		blance = findAccount(ano).getBlance() + blance;
		findAccount(ano).setBlance(blance);
		
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}

	private static void withdraw() {
		System.out.println("----");
		System.out.println("���");
		System.out.println("----");
		
		System.out.print("���¹�ȣ: ");
		
		String ano = scanner.nextLine();
		
		System.out.print("��ݾ�: ");
		int blance = scanner.nextInt();
		
		blance = findAccount(ano).getBlance() - blance;
		findAccount(ano).setBlance(blance);
		
		System.out.println("���: ����� �����Ǿ����ϴ�.");
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
