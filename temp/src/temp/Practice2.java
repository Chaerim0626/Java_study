package temp;

public class Practice2 {

	public static void main(String[] args) {
		
		byte b = 21;
		System.out.printf("���� %d���� ���л��Դϴ�.", b);

		byte b1 = 10;
		System.out.printf("10�� 8������ %o, 16�����δ� %x�Դϴ�.", b1,b1);
	
		System.out.println();
		
		//������ ���ڿ��� ��ȯ�� ������ �ڸ��� ���ϱ�
		int a = 12345;
		String str = "12345";
		
		String stra = String.valueOf(a); //���� -> ���ڿ��� ��ȯ
		System.out.println(stra.length()); //���� �ڸ���
	
		int b2 = Integer.valueOf(str); //���ڿ� -> ������ ��ȯ
		System.out.println(b2+1);
	}
}
