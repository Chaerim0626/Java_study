package java_practice;


class Person {
	//Field
	int gender;
	int power;
	
	//Constructor
	Person() {
		this.gender = 1;
		this.power = 100;
	}
	//Method
	void walk() {
		System.out.println("�ɾ�� �־��");
	}
	
}

class Hero extends Person {
	String name;
	int age;
	
	Hero(){}
	Hero(String name, int age){
		this.name = name;
		this.age = age; 
	}
	
	void walk() {
		//�������̵� - �������ؼ� �ٸ��뵵�� ���
		System.out.println("2��� ���� �ɾ�� �־��");
	}
	
	void eat( ) {
		System.out.println("��԰� �־��");
	}
	
	void displayPerson() {
		System.out.println("�̸� : " + name + "���� : " + age + "���� : " + gender + "�Ŀ� : " + power);
	}
}

class Villain {
	
}


public class practice10 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Person p1 = new Person();
		p1.walk();
		
		
		//2. ����� ���� ���۸� ��ü ����
		Hero h1 = new Hero("���۸�", 20);
		System.out.println(h1.age);
		System.out.println(h1.name);
		System.out.println(h1.gender); //�θ�Ŭ���� �ʵ�
		
		//
		
		

	}

}
