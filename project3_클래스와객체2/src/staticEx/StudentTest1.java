package staticEx;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //�ڵ����� ID +1 �ϰ� ����
		
		
		Student studentT = new Student();
		
		System.out.println(studentT.studentID);
		
		System.out.println(Student.serialNum); //static������ Ŭ���� �̸����� ����
		System.out.println(Student.serialNum);
		
	}
}
