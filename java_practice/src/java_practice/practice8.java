package java_practice;

public class practice8 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = a+b;
		String a1 = "1";
		String b1 = "2";
		String c1 = a1+ b1;
		
		//���ڿ� ���ڷ� ��ȯ �� ����
		//Integer Ŭ������ static ���� (static�� ��ü�� �������� Ŭ������.�޼ҵ��()�ٷ� ��� ����)
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt((b1));
		System.out.println(a2+b2); //3
		
		//���� ����, parseInt(����, ����) �ٸ� ������ 10������ �ٲپ���
		System.out.println(Integer.parseInt("2022", 10)); //10������ ����
		System.out.println(Integer.parseInt("1001", 2)); //9
		
		
	}

}
