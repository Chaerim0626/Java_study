package java_practice;
import java.util.*;

public class practice6 {

	public static String[] strMethod(String str1, String str2) {
		
		String a = str1.toUpperCase();
		String b = str2.toLowerCase();
		String[] res = {a, b}; //���ϰ� 2�� ������ �迭 ���� ����
		return res;
	}
	public static void main(String[] args) {
		
		String[] res = strMethod("korea", "USA");
		//�迭�� ��ü�� ��� ���� �ּҰ� ���, �ּҰ��� �׻� ������ �ٴ���!
		System.out.println(Arrays.toString(res));
	}

}
