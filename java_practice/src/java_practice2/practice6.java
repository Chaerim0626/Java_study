package java_practice2;

class Human{
	
}

class Superman extends Human {
	
}

public class practice6 {

	public static void main(String[] args) {
	
		//1. �迭���� ������ ����� ���ϸ� �� ��ü���� ������ �ؾ���
		Human[] h = new Human[10];
		h[0] = new Human();
		h[1] = new Superman();
		
		//2. �Ű������� ������
		//System.out.println()�� ��ü�� �Ű������� �޾Ƶ� �ش� ��ü ���� ��� -> ������ Ȱ��
		//object�� �ֻ��� Ÿ��
		System.out.println(new Human());
	}

}
