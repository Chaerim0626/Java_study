package template;

public abstract class Car { //�߻�Ŭ������ ���ø� �޼ҵ� Ȱ��
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public final void run() { //����Ŭ�������� ���� �Ұ���
		startCar();
		drive();
		stop();
		turnOff();
		
	}
}
