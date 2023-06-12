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
//답안 출력 // hgd 입력 // 정오표 출력+성적 // run

class ScoreMn {
	//정오표 변수배열을 정의하지 않고 그냥 print로 해결 
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};		// 모범답안
	int[] rNum = new int[5];			// 학생답안
	
	int answerCnt = 0;					// 정답을 맞춘 개수
	int score = 0;						// 성적
	
	//hgd출력
	void printR() {
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = ran.nextInt(5)+1;
		}
	}
	//
	void printAnswer() {
		System.out.print("answer = ");
		System.out.print(Arrays.toString(omr) + " ");
		System.out.print("\nhgd = ");
		System.out.print(Arrays.toString(rNum) + " ");
		
	}
	//정오표 출력 
	void printOx () {
		System.out.print("정오표  = ");
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == rNum[i]) {
				answerCnt++;
				System.out.print(" O ");
			}
			else System.out.print(" X ");
		}
		int tol = answerCnt*20;
		System.out.println("\n성적 = " + tol + "점");
	}
	//run
	void run() {
		printR();
		printAnswer();
		System.out.println();
		printOx ();
		
	}
}	
public class MethodEx13_풀이 {

	public static void main(String[] args) {
		
		ScoreMn sm = new ScoreMn();
		sm.run();
		
		/*
		 * # 유용한 단축키
		 * 
		 * 1) ctrl + 메서드 호출부 클릭 > 메서드 정의부로 이동
		 * 2) 1)번 작업 이후 alt 왼쪽,오른쪽방향키로 메서드 호출부 정의부 자유롭게 이동
		 * 
		 * */
		
		

	}

}
