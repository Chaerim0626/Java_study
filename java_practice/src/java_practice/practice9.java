package java_practice;

class Person1 {
	
	//1. �Ӽ�
	int age;
	String name;
	
	//2. ������
	Person1() {}
	Person1(int age, String name){
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
	Person1 p1 = new Person1(20,"ȫ�浿");
	Person1 p2 = new Person1(30, "�̼���");
	Person1 p3 = new Person1(40, "��������");
	
	p1.printPerson();
	p2.printPerson();
	p3.printPerson();
	

	}

}
