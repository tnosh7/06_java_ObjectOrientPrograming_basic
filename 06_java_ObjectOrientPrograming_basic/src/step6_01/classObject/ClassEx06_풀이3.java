package step6_01.classObject;

import java.util.Random;

/**
 * # OMR카드 : 클래스 + 변수
 * 24-05-13
 * @author 윤성희
 *
 */
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


class Exx06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}


public class ClassEx06_풀이3 {

	public static void main(String[] args) {
		Exx06 ex = new Exx06();
		Random ran = new Random();

		System.out.print("answer : ");
		for (int i = 0; i < ex.answer.length; i++) {
			System.out.print(ex.answer[i] + " ");
		}
		
		System.out.print("\nhgd : ");
		for (int i = 0; i < ex.hgd.length; i++) {
			ex.hgd[i] = ran.nextInt(5)+ 1;
			System.out.print(ex.hgd[i] + " ");
		}
		System.out.print("\n정오표 = ");
		for (int i = 0; i < ex.answer.length; i++) {
			if (ex.answer[i] == ex.hgd[i]) {
				System.out.print(" O ");
				ex.answerCnt++;
			}
			else System.out.print(" X ");
		}
		ex.score = ex.answerCnt * 20;
		System.out.println("\n점수 : " + ex.score);
		
		
		
	}

}
