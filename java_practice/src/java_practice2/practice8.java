package java_practice2;

class Sample {
	private Object obj;
	
	Sample(Object x) {
		this.obj = x;
	}
	
	public Object getObj() {
		return obj;
	}
	void printInfo() {
		System.out.println(obj.getClass().getName());
	}
}

public class practice8 {
	
	public static void main(String[] args) {
		//��ü ����-> ���ڿ�
		Sample s1 = new Sample(12345);
		System.out.println(s1.getObj());
		s1.printInfo();
		
		//Object �ڷ������� �����ϸ� ���Ͻ� ��ȯ Ÿ���� Object�� �Ǵ� ���� �߻�
		//ó������ ����ȯ���� ���
		int num = (int)s1.getObj();
		System.out.println(num);
	}

}
