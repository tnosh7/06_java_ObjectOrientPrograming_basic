package step6_02.method;

import java.util.Arrays;

class Ex06{
	
	void test1(int x, int y) {
		int tol = 0;
		for (int i = x; i <= y; i++) {
			tol += i;
		}
		System.out.println("전체 합 : " + tol);
	}
	
	void test2(int[] arr) {
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("arr배열의 최대값 : " + max);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = tmp;
		}
		System.out.print(Arrays.toString(arr) + " ");
	}
}

public class MethodEx06_풀이 {

	public static void main(String[] args) {
		
		
			Ex06 e = new Ex06();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.test1(x, y);
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			
			// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);
		

	}

}
