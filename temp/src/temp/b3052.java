package temp;
import java.util.*;

public class b3052 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int arr[] = new int[10];
		for (int i=0; i<10; i++) {
			arr[i] = sc.nextInt() % 42;
			//42�� ���� �������� �迭�� ����
		}
		
		HashSet<Integer> hashSet = new HashSet<>();
		for (Integer item : arr) {
			hashSet.add(item);
		}

		System.out.println(hashSet.size());

	}

}
