package ezen;

import java.util.Scanner;

public class RentCar extends Car{
	
	private int fare;
	private String comp; 
	public int getFare() { return fare; }
	public void setFare(int fare) { this.fare = fare; }
	public String getComp() { return comp; }
	public void setComp(String comp) { this.comp = comp; }
	
	public RentCar() {}
	
	@Override
	public void setSpeed(int speed) {
		if(speed < 0 || speed > 120 ) return;
		super.setSpeed(speed);
		
	}
	@Override
	public void printAttribute() {
		super.printAttribute();
		System.out.println("��Ʈ��� : " + getFare());
		System.out.println("��Ʈȸ�� : " + getComp());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentCar rc = new RentCar();
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �̸��� �Է��Ͻÿ�. : ");
		String cName = sc.nextLine();
		System.out.print("�� ���� �Է��Ͻÿ�. : ");
		String cColor = sc.nextLine();
		System.out.print("���� ��ȣ�� �Է��Ͻÿ�. : ");
		String cNumber = sc.nextLine();
		System.out.print("������ �ּҸ� �Է��Ͻÿ�. : ");
		String driver = sc.nextLine();
		System.out.print("�ӵ��� �Է��Ͻÿ�. : ");
		int speed = sc.nextInt();
		
		System.out.print("��Ʈ����� �Է��Ͻÿ� : ");
		sc.nextLine();
		int fare = sc.nextInt();
		
		System.out.print("��Ʈȸ�縦 �Է��Ͻÿ� : ");
		sc.nextLine();
		String comp = sc.nextLine();
		rc.setcName(cName);
		rc.setcColor(cColor);
		rc.setcNumber(cNumber);
		rc.setDriver(driver);
		rc.setSpeed(speed);
		rc.setFare(fare);
		rc.setComp(comp);
		rc.printAttribute();
	}

}
