package java_practice;

class FarmMachine {
	
	//�Ӽ�
	int price; 
	int year;
	String color;
	
	//����
	void move() {System.out.println("Farmmachine is moving.");}
	void dig() {
		System.out.println("Farmmachine is digging");
	}
	void grind() {
		System.out.println("Farmmachine is grinding");
	}
	
}

public class practice7 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		FarmMachine fm = new FarmMachine(); //�޸� ������ ��ü ����, �ּҰ� ��ȯ
		System.out.println(fm);
		
		//2. ������ ��ü�� �Ӽ� �� �Է�
		fm.price = 1000000;
		fm.year = 2022;
		fm.color = "red";
		
		//3. �Ӽ��� ���
		String fm_price = String.format("%,d", 1000000);
		System.out.println(fm_price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		//4. ���� ����
		fm.move();
		fm.dig();
		fm.grind();
	}

}
