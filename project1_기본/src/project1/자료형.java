package project1;

public class �ڷ��� {

	public static void main(String[] args) {
		
		//1. �⺻���
		System.out.println("Hello World");
		
		
		//2. ������ �ڷ���
		int num = 10;
		int bNum = 0B1010; //������
		int oNum = 012; //8����
		int hNum = 0XA; //16����
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
		
		//���� : ���� ����ϱ����� �����ϴ� ��(variable) 
		int num3; //���� ����
		num3 = 10; //�� �ʱ�ȭ
		int level = 20; //����� ���ÿ� �ʱ�ȭ
		
		/* 1. �����̸��� ���ĺ�, ����, _, $�� ����
		2. ��ҹ��� ����
		3. ���� ���� X, Ű����� �̸� ��� X */
		
		
		/* �ڷ��� 
		������ : byte(1), short(2), int(4), long(8)
		������ : char(2)
		�Ǽ��� : float(4), double(8)
		���� : boolean(1)
	
	    */
		byte bData = -128;
		System.out.println(bData);
		
		
		char ch = 'A';
		System.out.println((int)ch);
		
		float fNum = 3.14F; //float���� f�� F�� ����ؾ��� (long����)
		
		boolean b1 = true;
		boolean b2 = false;
		
		
		var dNum = 3.14; //���������� var�� ��� X
		//�� ���� �Ұ���
		
		
		//3. ��� : ������ �ʴ� ��
		final double PI = 3.14;
		final int MAX_NUM = 100;
		
		//4. ���ͷ� : ���α׷����� ����ϴ� ��� ����, ��, �� ��
		//ex) 10, 3.14, true
		
		
		/* 5. �� ��ȯ
		 
		�������� ����ȯ : �ڿ������� �� ��ȯ, ���� ������ ū ����
		������� ����ȯ : ������ �ݴ�
		*/
		byte bNum2 = 10;
		int num4 = bNum2;
		System.out.println(num4); //������
		
		int iNum = 1000;
		byte bNum3 = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum3); //������ ����
		
		double dNum2 = 3.14;
		iNum = (int)dNum2;
		System.out.println(iNum); //�Ҽ��� ���� �����
	}

}