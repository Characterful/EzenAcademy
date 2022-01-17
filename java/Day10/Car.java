package ezen;
import java.util.Scanner;
public class Car {
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	private String cName;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcColor() {
		return cColor;
	}
	public void setcColor(String cColor) {
		this.cColor = cColor;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	private String cNumber;
	private String cColor;
	private String driver;
	
	public void printAttribute() {
		System.out.println("차 이름 : " + getcName() );
		System.out.println("차 색 : " + getcColor() );
		System.out.println("차량 번호 : " + getcNumber() );
		System.out.println("운전자 주소 : " +getDriver() );
		System.out.println("속도 : " + getSpeed() );
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
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
		c.setcName(cName);
		c.setcColor(cColor);
		c.setcNumber(cNumber);
		c.setDriver(driver);
		c.setSpeed(speed);
		c.printAttribute();
	}
}
