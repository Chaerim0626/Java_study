package java_practice2;
class Person4{
	public Object obj;
	
	Person4(Object obj){
		this.obj = obj;
	}
}
class Student4{
	
	public int grade;
	
	Student4(int grade) {this.grade = grade;}
}

class Teacher{
	
}


public class practice9 {
	public static void main(String[] args)
	{
		Person4 p1 = new Person4(new Student4(1));
		//������ �ܰ迡�� ������ �������� �ߵ� -> ����ȯ���� �Ǽ��� �Ͼ �� �־ ���׸� ź��
		Teacher t1 = (Teacher)p1.obj;
		
	}

}
