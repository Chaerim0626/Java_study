package java_practice2;

class Person3 {
	String str1 = "�� �θ� Ŭ����";
	void method1() {
		System.out.println("�������̵� ���� �θ� Ŭ�������Լ�");
	}
}

class Student3 extends Person3 {
	
	String str2 = "�� �ڽ� Ŭ����";
	void method1() {
		System.out.println("�������̵��� �Լ�");
	}
	void useSuper() {
		super.method1();
	}
	void cast( ) {System.out.println("�ڽĿ��Ը� �ִ� �Լ� ȣ��");}
}

public class practice4 {

	public static void main(String[] args) {
		
		//1. �θ� + �ڽ� Ŭ������ ��� �ڿ� ��� ����
		Student3 s1 = new Student3();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		
		//�ڽ�Ŭ�������� �������̵��� �θ� Ŭ������ ���� �޼��带 ȣ���Ϸ���?
		s1.useSuper();
		System.out.println("---------------------");
		
		
		//2. �θ��� �ڿ��� ��� ����
		Person3 s2 = new Student3(); //�ڽ�Ŭ������ ��ü ����鼭 Ÿ���� �θ�Ŭ���� ���
		System.out.println(s2.str1); //str2��� �Ұ���
		s2.method1(); //�������̵��� ���� �ڽ��� �޼���� �����
		
		//�ڽ��� �޼��带 �ٷ� ȣ���ϰ� ������? ĳ��Ʈ �ʿ�
		((Student3)s2).cast();
		
		//3. �θ��� �ڿ� ��� ����
		Person3 p1 = new Person3();
		
		//4. Student3 p2 = new Person3(); �Ұ���

	}

}
