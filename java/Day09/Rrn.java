package ezen;

public class Rrn {
	
	private String rrn;
	
	
	public void Setter(String rrn) { this.rrn = rrn;}
	
	public String getter() { return rrn; }
	
	public String getSex() {
		if( rrn.charAt(7) == '1' || rrn.charAt(7) == '3') {
			return "����";
		}else if( rrn.charAt(7) == '2' || rrn.charAt(7) == '4') {
			return "����";
		}
		return null;
	}
	
	public int getAge() {
		int age = ((int)rrn.charAt(0) - 48) * 10 + (int)rrn.charAt(1) - 48;
		if( (int)rrn.charAt(7) == 49 || (int)rrn.charAt(7) == 50 )
			age = age + 1900;
		else if((int)rrn.charAt(7) == 51 || (int)rrn.charAt(7) == 52) 
			age = age + 2000;
		else
			return 0;
		age = 2022-age+1;
		return age;
	}
	
	public String getPlaceOfBirth() {
		int placeBirth = ((int)rrn.charAt(8) - 48) * 10 + (int)rrn.charAt(9) - 48;
		if(placeBirth >= 0 && placeBirth <= 8) 
			return "����Ư����";
		else if(placeBirth >= 9 && placeBirth <= 12) 
			return "�λ걤����";
		else if(placeBirth >= 13 && placeBirth <= 15) 
			return "��õ������";
		else if(placeBirth >= 16 && placeBirth <= 25) 
			return "��⵵";
		else if(placeBirth >= 26 && placeBirth <= 34) 
			return "������";
		else if(placeBirth >= 35 && placeBirth <= 39) 
			return "��û�ϵ�";
		else if(placeBirth == 40)
			return "����������";
		else if(placeBirth >= 41 && placeBirth <= 47 && placeBirth != 44) 
			return "��û����";
		else if(placeBirth == 44 && placeBirth == 96) 
			return "����Ư����ġ��";
		else if(placeBirth >= 48 && placeBirth <= 54) 
			return "����ϵ�";
		else if(placeBirth >= 55 && placeBirth <= 64) 
			return "���󳲵�";
		else if(placeBirth >= 65 && placeBirth <= 66) 
			return "���ֱ�����";
		else if(placeBirth >= 67 && placeBirth <= 70) 
			return "�뱸������";
		else if(placeBirth >= 71 && placeBirth <= 80) 
			return "���ϵ�";
		else if(placeBirth >= 81 && placeBirth <= 90 && placeBirth != 85) 
			return "��󳲵�";
		else if(placeBirth == 85) 
			return "��걤����";
		else if(placeBirth >= 91 && placeBirth <= 95) 
			return "����Ư����ġ��";
		else
			return "������ ��";
	}
	
	public String printPRN() {
		return getSex()+"\t"+getAge()+"\t"+getPlaceOfBirth();
	}

}
