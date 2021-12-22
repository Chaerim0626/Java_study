package project4_�迭��ArrayList;

public class ObjectCopy {
	
	public static void main(String[] args) {
		/* 
		 - �迭 �����ϱ�
		 System.arraycopy(�����ҹ迭, ������ ù ��ġ, ���迭, �ٿ����� ù ��ġ, ������ ��Ұ���);
		 
		 - ��ü�迭�� �����Ѵٰ� �ؼ� �ν��Ͻ��� �����Ǵ� �� �ƴ�
		 - ��ü�迭 �����Ѵٰ� �ٸ� �ν��Ͻ��� ����Ű�� ���� �ƴ�
		 - �ٸ� �ν��Ͻ��� ����Ű�� �� : ���� ����
		 
		 */
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //��ü �迭 ����

		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
 		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("--------------");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		} //���� ����
		
		
		String[] strArr = {"Java", "Android", "Python"};
		for(int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		
		//���� for��
		for(String s: strArr) { //ó������ ������ �� ��ȸ
			System.out.println(s);
		}
		
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int num : arr) { //num = arr[i], �ϳ��� ��ȸ
			System.out.println(num);
		}
	}

}
