package temp;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		//����� �Է��� ���� ��ü ����
		Scanner sc = new Scanner(System.in);
		
		//2���� �迭�� ��� �� ���� -> �Է����� ó��
		System.out.print("���� ���� �Է��ϰ� enter ġ���� = ");
		int R = sc.nextInt(); //���� �Է�
		
		System.out.print("���� ���� �Է��ϰ� enter ġ���� = ");
		int C = sc.nextInt();
		
		
		//char 2���� �迭 ���� -> gameMap[R][C]����
		
		char[][] gameMap = new char[R][C];
		
		//����� �Է¹޾� ������ String �迭 ����
		//���� for���� ���鼭 2���� �迭�� �Է�
		String[] strAr = new String[R];
		
		//2���� �迭��� -> ����ڰ� �Է��ϴ� ������ ����
		for(int i=0; i < R; i++) {
			System.out.print((i+1) + "��° �࿡ �Է��� ����"+ C +"���� ���ʴ�� �Է��ϰ� enter ġ����");
			strAr[i] = sc.next();
			for(int j=0; j< C; j++) {
				gameMap[i][j] = strAr[i].charAt(j);
			}
		}
		System.out.println("--------------------");
		for(int i= 0; i < R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(gameMap[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	

}
