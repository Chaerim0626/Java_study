package temp;
import java.util.*;

public class b2577 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		
		int res[] = new int[10]; //�ִ� 9�ڸ�
		
		int result = n1*n2*n3;
		
		while(result > 0) {
			res[result % 10]++;
			result /= 10;
		}
		for(int s : res) {
			System.out.println(s);
		}


	}

}
