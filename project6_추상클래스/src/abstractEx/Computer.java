package abstractEx;

public abstract class Computer { 
	//�߻�Ŭ������ ����� �ϱ����� ����, �ν��Ͻ�ȭ �� �� ����
	
	public abstract void display(); //�޼ҵ� ����
	public abstract void typeing(); //�߻� �޼ҵ�
	//���⼭�� ��� �������� �� - ���� ��ӹ��� Ŭ�������� ��ü������ �����ؾ� �� �� ���
	//����Ŭ������ ����
	
	
	//�Ϲ� �޼ҵ�鵵 ����Ŭ�������� �������̵��� ���� ������ ����
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
