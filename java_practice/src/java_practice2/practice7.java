package java_practice2;

class Point{

	   Point(){}
	   public void motherClass() {
	      System.out.println("�̰��� �θ� Ŭ����");
	   }
	}
	class inheritance extends Point{
	   
	   public void motherClass() {
	      System.out.println("�̰��� �ڽ� Ŭ����");
	   }
	   public void motherClassEx() {
	      super.motherClass();
	   }
	}
	public class practice7 {
	   public static void main(String args[]) {
	   inheritance i = new inheritance();
	   Point p = (Point)i;
	   
	   p.motherClass();
	   
	   
	   }
	}