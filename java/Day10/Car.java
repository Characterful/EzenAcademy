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
		System.out.println("�� �̸� : " + getcName() );
		System.out.println("�� �� : " + getcColor() );
		System.out.println("���� ��ȣ : " + getcNumber() );
		System.out.println("������ �ּ� : " +getDriver() );
		System.out.println("�ӵ� : " + getSpeed() );
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
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
		c.setcName(cName);
		c.setcColor(cColor);
		c.setcNumber(cNumber);
		c.setDriver(driver);
		c.setSpeed(speed);
		c.printAttribute();
	}
}
