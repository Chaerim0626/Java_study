package staticEx;

public class Student {

	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	
	public Student() {
		serialNum++; //�����ڰ� ȣ��ɶ����� �й� ����
		studentID = serialNum; //ID�� ���� �ν��Ͻ����� ���� ��
	}
}
