package java_practice2;

class Person{
	String name;
	int age;
	
	Person() {}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	
}


public class practice1 {

	public static void main(String[] args) {
		
		Person[] pa = new Person[10]; //��ü �迭 ����
		//PersonŸ���� ��ü 5�� ����
		
		for (int i=0; i<pa.length; i++) {
			pa[i] = new Person(i+ "�� �ĺ���", i+20);
			
			//1. getter, setter �޼��� ����ؼ� ���
			System.out.println(pa[i].getName() + " --> " + pa[i].getAge());
		
			//2. array index ����� ��� -> private ���� �����ϰ� ���
			System.out.println(pa[i].name + pa[i].age);
			
			//3. printf
			System.out.printf("%s�� ���̴� %d�� �Դϴ�.", pa[i].name, pa[i].age);
		
		}
		
	}

}
