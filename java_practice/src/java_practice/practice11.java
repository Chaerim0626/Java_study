package java_practice;

class Person2{
	//Field
	private String name;
	private int age;
	private int height;
	private int weight;
	//private�� Ŭ���� �������� ���� ����
	//getter, setter�� ���� ��� �ʵ��� ���� �ʿ信 ���� ���
	
	//Constructor
	
	//Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() { return age; }
	
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public void setWeight(int weight) { this.weight = weight;}
	public int getWeight() {return weight;}
	
}

class Villain2 extends Person2{
	
}

class Hero2 extends Person2{
	
}


public class practice11 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Person2 p1 = new Person2();
		
		p1.setName("ȫ�浿");
		System.out.println(p1.getName());
		
	}

}
