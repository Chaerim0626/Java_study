package project1;

public class 제어문 {

	public static void main(String[] args) {
		

		//1. if문
		
		int age = 11;
		
		if (age < 8){
			System.out.println("미취학 아동입니다.");
		}
		else if (age < 14) {
			System.out.println("초등학생입니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		
		//2. if문을 조건 연산자로 구현
		int a = 10;
		int b = 20;
		int max = 100;
		
		if (a > b)
			max = a;
		else
			max = b;
		max = (a>b) ? a : b;
		
		
		
		//3. switch-case문
		//조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행문이 결정될 때
		int rank = 1;
		char medalColor;
		switch(rank) {
		case 1: medalColor = 'G';
				break;
		case 2 : medalColor = 'S';
				break;
		case 3 : medalColor = 'B';
				break;
		default : medalColor = 'A';	
				break;
		}
		System.out.println(rank+ "등 메달의 색깔은" + medalColor + "입니다.");
		//자바7부터 case값에 문자열 사용 가능
		
		int month = 8;
		int day = 0;
		
		//case 여러개 쓰기
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
			
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			break;
		}
		System.out.println(month + "월은 " + day + "일 까지 있습니다.");
	
	
		
		
		//4. 반복문 - while문 (조건식이 참인 동안 수행문을 반복해서 수행)
		
		int num = 1;
		int sum = 0;
		
		//1부터 10까지 더하기
		while(num <= 10) {
			
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		
		//5. 반복문  - do while문 (최소 한 번 실행)
		
		int num2 = 1;
		int sum2 = 0;
		
		do {
			sum2 += num2;
			num2++;
		}while(num2 <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum2 + "입니다.");
		
		
		
		//6. 반복문 - for문 (주로 조건이 횟수인 경우)
	
		int num3, sum3;
		
		for (num3 = 1, sum3 = 0; num3 <= 10; num3++)
		{
			sum3 += num3;
		}
		System.out.println(sum3);
		System.out.println(num3);
	
		
		
		//7. 중첩 반복문 (구구단)
		int dan;
		int times;
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "*" + times + "=" + dan*times);
			}
			System.out.println(); //개행
		}
	
		int dan2 = 2;
		int times2;
		while (dan2 <= 9) {
			times2 = 1; //초기화 잊지말 것
			while(times2 <= 9)
			{
				System.out.println(dan2 + "*" + times2 + "=" + dan2*times2);
				times2++;
			}
			dan2++;
			System.out.println();
			
		}
		
		//기타
		for(int i=0; i < 10; i++) //int i=1; i<=10; 보다 이 방식 선호
		{
			System.out.println("Hello World");
		}
		
		
		
		//8. continue문 (조건을 만족하면 나머지를 수행하지말고 넘어감)
		int total = 0;
		int num4;
		for(num4 = 1; num4 <= 100; num4++) {
			if ((num4 % 2) == 1)
			{
				continue;
			}
			total += num4;
		}
		System.out.println(total);
		
		
		
		//9. break문 (더 이상 반복을 수행하지 않고 반복문 빠져나옴)
		int sum4 = 0;
		int num5 = 1;
		while (true)
		{
			sum4 += num5;
			if (sum4 > 100)
				break;
			num5++;
		}
		
		System.out.println(sum4);
		System.out.println(num5);
	}
}
