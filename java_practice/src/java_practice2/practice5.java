package java_practice2;

abstract class Car {
	abstract void run();
}

class Ambulance extends Car {
	void run() {System.out.println("���深���� ��������");}
}
	
class SportsCar extends Car {
	void run() {System.out.println("���������� ��������");}
}

class Cultivate extends Car {
	void run() {System.out.println("���Ⱑ ��������");}
}

public class practice5 {

	public static void main(String[] args) {

		//Car[] cars = new Car[3];
		//cars = new Car[] { new Ambulance(), new SportsCar(), new Cultivate()};
	
		//�ڽ�Ŭ������ ��ü ����, Ÿ���� �θ� Ÿ��
		Car[] cars = { new Ambulance(), new SportsCar(), new Cultivate()};
		
		//�ݺ������� �� ��ü�� run() ȣ��
		for(int i=0; i < cars.length; i++)
		{
			System.out.println(cars[i]); //�� ��ü�� ������ �޸� ������ �ּ� �� ���
			cars[i].run();
		}

		
		for(Car obj: cars)
			obj.run();
	}
}