package temp;

public class Practice9 {
	
	public static void showMenu() {
		System.out.println("ShowMenu() �޼��尡 ȣ��Ǿ����ϴ�.");
	}
	
	public static void plus(int n1, int n2) {
		int res = n1+n2;
		System.out.println(res);
	}
	
	public static int returnMethod() {
		int result = 100;
		return result;
	}

	public static void main(String[] args) {
		
		//��ȯ�� X ���ڰ� X
		showMenu();
		
		//��ȯ�� X ���ڰ� O
		plus(2,5);
		
		//��ȯ�� O ���ڰ� X
		returnMethod();
	}
	
	//
}
