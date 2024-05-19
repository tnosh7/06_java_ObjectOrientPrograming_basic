package step6_02.method;

import java.util.Scanner;

/**
 * 24-05-13
 * 메서드 문제 풀이1
 * @author 윤성희
 *
 */

class Exx05{

	int test1() {
		int total = 0;
		for (int i = 1; i < 6; i++) {
			total += i;
		}
		return total;
	}
	
	int test2() {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
	
		int max= arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = scan.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		scan.close();
		return max;
	}
	
}


public class MethodEx05_풀이2 {

	public static void main(String[] args) {

		
			Exx05 e = new Exx05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			System.out.println(e.test1());	
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			System.out.println(e.test2());


	}

}
