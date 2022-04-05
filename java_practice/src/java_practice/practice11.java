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
	Person2() {
		
	}
	Person2(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	
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
	
	public void move() {
		System.out.println("�̵���...");
	}
	
}

class Villain2 extends Person2{
	//Field
	private String unique_key;
	private int weapon;
	private double power;
	
	//Consturctor
	Villain2() {}
	Villain2(String name, int age, int height, int weight, String unique_key,int weapon, double power){
		super(name, age, height, weight);
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
		
	}
	
	
	//Method
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
	public String getUnique_key() {return unique_key;}
	
	public void setWeapon(int weapon) {this.weapon = weapon;}
	public int getWeapon() {return weapon;}
	
	public void setPower(double power) {this.power = power;}
	public double getPower() {return power;}
	
	public void printPerson() {
		System.out.println("-----------------------");
		System.out.println("�Ǵ� �̸� : " + getName());
		System.out.println("�Ǵ� ���� : " + getAge());
		System.out.println("�Ǵ� Ű : " + getHeight());
		System.out.println("�Ǵ� ü�� : " + getWeight());
		System.out.println("�Ǵ� �ѹ� : " + getUnique_key());
		System.out.println("�Ǵ� ���� : " + getWeaponName(getWeapon()));
		System.out.println("�Ǵ� �Ŀ� : " + getPower());
		System.out.println("-----------------------");
	}
	
	public String getWeaponName(int a) {
		String weapon;
		switch(a) {
			case 1:
			weapon="â";
			break;
			case 2:
				weapon="����";
				break;
			case 3:
				weapon="��";
				break;
			default:
				weapon="---";
				break;
		}
		return weapon;
	}
}

class Hero2 extends Person2{
	
}


public class practice11 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Villain2 v1 = new Villain2("����", 20, 180, 80, "15001231", 1, 99.5);
		v1.printPerson();
		System.out.print(v1.getName() + "");
		v1.move();
		
	}

}
