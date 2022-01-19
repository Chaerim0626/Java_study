package object;


class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj; //�ٿ�ĳ����
			if(studentID == std.studentID) return true;
			else return false;
		}
		return false;
	}
}

public class EqulsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");

		System.out.println(str1 == str2); //������ �޸����� üũ
		System.out.println(str1.equals(str2)); //���ڿ��� ������ üũ

	
		Student std1 = new Student(1001, "Tomas");
		Student std2 = new Student(1001, "Tomas");
	
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(std1 == std2); //false
		System.out.println(std1.equals(std2)); //true
		
	}

}
