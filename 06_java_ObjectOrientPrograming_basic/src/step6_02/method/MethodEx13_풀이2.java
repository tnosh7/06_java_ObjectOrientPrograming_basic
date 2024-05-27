package step6_02.method;

import java.util.Arrays;
import java.util.Random;


/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */
 class Omr {
	 int []answer = {1, 3, 4, 2, 5};
	 int[] hgd = new int[5];	 
	 char[] ox = new char[5];	 
	 int score= 0;
	
	// 1.me 답안 완성하기
	 void setAnswer() {
		 Random ran = new Random();
		 for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1 ;
		}
	 }
	
	// 2.정답 출력하기
	 void printAnswer() {
		 System.out.println("Answer = " + Arrays.toString(answer));
		 System.out.println("Hgd = " + Arrays.toString(hgd));
		 System.out.println("ox = " + Arrays.toString(ox));
		 System.out.println("성적 = " + (score * 20) );
	 }

	
	// 3.정답 비교하기
	void answer() {
		 for (int i = 0; i < answer.length; i++) {
			if (answer[i] == hgd[i]) {
				score++;
				ox[i] = 'O';
			}
			else ox[i] = 'X';
		}
	 }
	
	// 4.실행하기
	 void run() {
		 setAnswer();
		 answer();
		 printAnswer();
	 }

 }

public class MethodEx13_풀이2 {

	public static void main(String[] args) {
		
		Omr o = new Omr();
		o.run();
		/*
		 * # 유용한 단축키
		 * 
		 * 1) ctrl + 메서드 호출부 클릭 > 메서드 정의부로 이동
		 * 2) 1)번 작업 이후 alt 왼쪽,오른쪽방향키로 메서드 호출부 정의부 자유롭게 이동
		 * 
		 * */
		
		

	}

}
