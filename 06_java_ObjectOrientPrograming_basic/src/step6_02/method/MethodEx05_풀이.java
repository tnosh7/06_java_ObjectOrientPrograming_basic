package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class Ex05{

	void test1() {
		
	int[] num = new int[5];
	
	int tol = 0;
	for (int i = 0; i < num.length; i++) {
		num[i] = i+1; 
		tol += num[i];
	}
	System.out.println(tol);
		
	}
	
	void test2() {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int max = 0;
		while (true) {
			System.out.print("정수1 입력 : ");
			arr[0] = scan.nextInt();
			System.out.print("정수2 입력 : ");
			arr[1] = scan.nextInt();
			System.out.print("정수3 입력 : ");
			arr[2] = scan.nextInt();
			break;
		}
		for (int j = 0; j < arr.length; j++) {
			if (max < arr[j]) {
				max = arr[j];
			}
		}
		System.out.println(max);
		scan.close();
	}
	
}


public class MethodEx05_풀이 {

	public static void main(String[] args) {
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();

	}

}
