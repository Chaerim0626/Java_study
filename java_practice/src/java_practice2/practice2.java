package java_practice2;

abstract class Animal {
	//��ü���� ������ �ۼ����� �ʰ� �������� Ư¡�� �߻������� ���� --> ���ϰ� ������ ���� �޼���� ����
	abstract void cry();
	
}
class Dog extends Animal {
	void cry() {System.out.println("�۸�");}
}
class Cat extends Animal {
	void cry(){System.out.println("�߿�");}
}


public class practice2 {

	public static void main(String[] args) {
		
		//1. �߻�Ŭ������ ��ü�� ������ ���� ��ü ���� �Ұ���

		
		//2. �߻�Ŭ���� ��� -> ��� �޾� ���
		//�߻� Ŭ������ ��ӹ��� �ڽ�Ŭ�������� �ش� �޼��带 �������̵��Ͽ� �������� �� ���
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
	}
}
