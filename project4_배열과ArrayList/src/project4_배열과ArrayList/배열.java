package project4_�迭��ArrayList;

public class �迭 {
	
	public static void main(String[] args) {
		/*
		 
		 - �迭
		 �޸𸮻� ���ӵ� ������ ������
		 ������, �������� ���ӵǾ��ִ� �ڷᱸ��
		 ������ 0��° ��Һ��� ����
		 
		 
		 - �迭�� ����
		 1. �ڷ���[] �迭�̸� = new �ڷ���[����];
		 2. �ڷ��� �迭�̸�[] = new �ڷ��� [����];
		 	 
		 
		 */
		
		int[] numbers = new int[] {0, 1, 2}; //�迭 �ʱ�ȭ
		
		int[] number2 = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		System.out.println(numbers.length);
		
	}
}

