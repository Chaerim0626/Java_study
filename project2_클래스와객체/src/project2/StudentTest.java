package project2;

public class StudentTest {

	public static void main(String[] args) {
		//class ���� (�ٸ� Ŭ�������� �ҷ��� ���� ����)
		
		Student studentLee = new Student(); //����Ʈ ������
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		Student studentKim = new Student(); //�ν��Ͻ� ������ �����ϱ�
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�̱� ��ȣ��";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();

		System.out.println(studentLee); //�� �޸𸮿� ������ �ּҰ� ���
	
	}
	
	
}
