package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //��ü�� ����
		bus.take(1000); //take �޼ҵ� ȣ��
		money -= 1000;
		
	}
	
	public void takeSubway(Subway subway) { //��ü�� ����
		subway.take(1500); //take �޼ҵ� ȣ��
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + " �Դϴ�.");
	}
}
