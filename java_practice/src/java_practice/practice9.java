package java_practice;

class Person {
	
	//1. �Ӽ�
	int age;
	String name;
	
	//2. ������
	Person() {}
	Person(int age, String name){
		this.age = age; //this�� ������ ��ü �ڽ��� �ǹ�
		this.name = name;
	} //������ �����ε�
	
	
	//3. �޼ҵ�
	void printPerson() {
		System.out.println("���� : " + age + " �̸� : " + name);
	}
	
}
public class practice9 {

	public static void main(String[] args) {
		
	//1. ������ : Constructor
	//�����ڴ� newŰ����� Ŭ������ ��ü�� ������ �� ���� ���� �ڵ������� ȣ��Ǵ� �޼ҵ�
	//��ü�� �ʱⰪ�� �����ϴ� �뵵�� ���� ���
	//�����ڸ��� Ŭ������� ����
	
		
	//2. ������ ��ġ
	//���� �Ӽ��� �޼ҵ� ���̿� ���
		
		
	//3. ��ü ����
	Person p1 = new Person(20,"ȫ�浿");
	Person p2 = new Person(30, "�̼���");
	Person p3 = new Person(40, "��������");
	
	p1.printPerson();
	p2.printPerson();
	p3.printPerson();
	

	}

}
