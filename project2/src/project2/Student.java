package project2;

public class Student {
	//Ŭ������ ��κ� �빮�ڷ� ����, public Ŭ������ ���ϳ�
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ���ʱ� ���ʵ�";
				
		studentLee.showStudentInfo();
	}
}
