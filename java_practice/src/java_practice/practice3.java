package java_practice;

public class practice3 {
	
	public static void sum(Integer a) {
		a+=400;
		System.out.println(a); //100�̶�� �� ��� 
	}

	public static void main(String[] args) {
		//wrapper Ŭ������ integerŬ���� Ÿ������ ����a�� �����ϰ� new�� ��ü�� �����Ͽ� �ش� �ּҰ��� �޼ҵ带 ������.
		 
		Integer a = new Integer(100); //new�ϴ� ���� �ּҰ� ��ȯ, ��ü�� ������Ÿ��
		sum(a);
		System.out.println(a); //call by valueó�� ����
	}

}
