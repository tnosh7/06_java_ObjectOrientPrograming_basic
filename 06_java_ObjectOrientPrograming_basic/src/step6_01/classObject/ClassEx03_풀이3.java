package step6_01.classObject;

/**
 * # 학생성적관리 프로그램[1단계] : 클래스 + 변수
 * 24-05-13
 * @author 윤성희
 *
 */

class Exx03{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_풀이3 {

	public static void main(String[] args) {
		
		Exx03 ex = new Exx03();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for (int i = 0; i < ex.arr.length; i++) {
			total += ex.arr[i];
		}
		System.out.println("헙은 " + total);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		total = 0;
		for (int i = 0; i < ex.arr.length; i++) {
			if (ex.arr[i] % 4 == 0) {
				total += ex.arr[i];
			}
		}
		System.out.println("헙은 " + total);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int count = 0;
		for (int i = 0; i < ex.arr.length; i++) {
			if (ex.arr[i] % 4 == 0 ) {
				count++;
			}
		}
		System.out.println("4의 배수의 개수 : " + count);		
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		count = 0;
		for (int i = 0; i < ex.arr.length; i++) {
			if (ex.arr[i] % 2 == 0 ) {
				count++;
			}
		}
		System.out.println("짝수의 개수 : " + count);		


	}

}
