package java_practice2;

class Person2{
	String name;
	int age;
	int weight;
	
	Person2() {}
	Person2(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	void wash() {System.out.println("�Ĵ�.");}
	void study() {System.out.println("�����ϴ�.");}
	void play() {System.out.println("���.");}
}


interface Allowance {
	public static final String a = "Korea";
	abstract void in(int price, String name);
	abstract void out(int price, String name);
}

interface Train {
	abstract void train(int training_pay, String name);
}

class Student extends Person2 implements Allowance, Train{
	//���� �� ���� extends Ű���尡 �������� ��
	
	Student(){}
	Student(String name, int age, int weight){
		super(name, age, weight);
	}
	
	public void in(int price, String name) {
		System.out.printf("%s���Լ� %d�� �뵷�� �޾ҽ��ϴ�.%n", name, price);
	}
	public void out(int price, String name) {
		System.out.printf("%s�� %d���� �����߽��ϴ�.%n", name, price);
	}
	public void train(int training_pay, String name) {
		System.out.printf("[%s --> %d�� �ԱݿϷ�]%n", name, training_pay);
	}
}

public class practice3 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Student s1 = new Student("ȫ�浿", 20, 85);
		
		//2. Ŭ������ �������̽��κ��� ��Ӱ� ������ �� �޼��� ȣ��
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "��");
		s1.out(5000, "�䰪");
		s1.train(1500000, "����");
		
		//3. ��� �ʵ� ����ϱ�
		System.out.println(s1.a);
	}

}
