package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;
/**
 * # 학생성적관리 프로그램[1단계] : 클래스 + 변수
 * 24-05-13
 * @author 윤성희
 *
 */

class Exx04{
	
	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];

}

public class ClassEx04_풀이3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Exx04 ex = new Exx04();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < ex.scores.length; i++) {
			ex.scores[i] = ran.nextInt(100)+1;
			System.out.print(ex.scores[i] + " ");
		}
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total = 0;
		double avg;
		for (int i = 0; i < ex.scores.length; i++) {
			total += ex.scores[i];
		}
		avg = total / ex.scores.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int count = 0 ;
		for (int i = 0; i < ex.scores.length; i++) {
			if (ex.scores[i] >= 60) {
				count++;
			}
		}
		System.out.println("합격생 수 : " + count);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		System.out.println("성적 : " + ex.scores[index]);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적을 입력 : ");
		int myScore = scan.nextInt();
		for (int i = 0; i < ex.scores.length; i++) {
			if (ex.scores[i] == myScore) {
				index = i;
			}
		}
		System.out.println("인덱스 : " + index);
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 : ");
		int studentNum = scan.nextInt();
		for (int i = 0; i < ex.hakbuns.length; i++) {
			if (ex.hakbuns[i] == studentNum) {
				index = i;
			}
		}
		System.out.println("성적 : " + ex.scores[index]);
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		index = 0;
		System.out.print("학번 입력 : ");
		studentNum = scan.nextInt();
		for (int i = 0; i < ex.hakbuns.length; i++) {
			if (ex.hakbuns[i] == studentNum) {
				index = i;
			}
		}
		if (index == 0) System.out.println("해당 학번은 존재하지 않습니다.");
		else System.out.println("성적 : " + ex.scores[index]);
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max = ex.scores[0];
		for (int i = 0; i < ex.scores.length; i++) {
			if (max < ex.scores[i]) {
				max = ex.scores[i];
				index = i;
			}
		}
		System.out.println(ex.hakbuns[index] + "(" + max + "점)");
	}

}
