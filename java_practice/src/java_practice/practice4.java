package java_practice;

class TestNumber {
	int num;
	TestNumber(int num){
		this.num = num;
	}
}

public class practice4 {
	
	public static void sum(TestNumber a) {
		System.out.println(a); //TestNumber �ּҰ�
		System.out.println(a.num); //100���
		a.num += 400;
		System.out.println(a.num);
	}

	public static void main(String[] args) {
		//��ü ���� ����
		TestNumber a = new TestNumber(100);
		sum(a); //�ּҰ��� ���� sum�޼ҵ� ȣ��
		System.out.println(a.num);
	}

}