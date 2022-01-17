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
		System.out.println("랜트비용 : " + getFare());
		System.out.println("랜트회사 : " + getComp());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentCar rc = new RentCar();
		Scanner sc = new Scanner(System.in);
		System.out.print("차 이름을 입력하시오. : ");
		String cName = sc.nextLine();
		System.out.print("차 색을 입력하시오. : ");
		String cColor = sc.nextLine();
		System.out.print("차량 번호를 입력하시오. : ");
		String cNumber = sc.nextLine();
		System.out.print("운전자 주소를 입력하시오. : ");
		String driver = sc.nextLine();
		System.out.print("속도를 입력하시오. : ");
		int speed = sc.nextInt();
		
		System.out.print("랜트비용을 입력하시오 : ");
		sc.nextLine();
		int fare = sc.nextInt();
		
		System.out.print("랜트회사를 입력하시오 : ");
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
