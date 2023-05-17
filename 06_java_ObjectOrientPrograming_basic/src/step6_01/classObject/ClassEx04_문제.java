package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex04_풀이 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_문제 {

	public static void main(String[] args) {
		
		Ex04_풀이 answer = new Ex04_풀이();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		answer.scores[0] = 87;
		answer.scores[1] = 11;
		answer.scores[2] = 92;
		answer.scores[3] = 14;
		answer.scores[4] = 47;
		System.out.println(Arrays.toString(answer.scores));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int tol = 0;
		
		for (int i = 0; i < answer.scores.length; i++) {
			tol += answer.scores[i];
		}
		double avg = tol / 5.0; 
		System.out.println("총점(" + tol + ")  평균(" + avg + ")");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		
		for (int i = 0; i < answer.scores.length; i++) {
			if (answer.scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println(cnt + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		System.out.println( "성적 : " + answer.scores[idx] + "점");
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		idx = 0;
		for (int i = 0; i < answer.scores.length; i++) {
			if (answer.scores[i] == score) {
				idx = i;
			}
		}
		System.out.println("인덱스 : " + idx );
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		idx = 0;
		System.out.print("학번 입력 : ");
		int num = scan.nextInt();
		for (int i = 0; i < answer.hakbuns.length; i++) {
			if (answer.hakbuns[i] == num) {
				idx = i;
			}
		}
		System.out.println("성적 : " + answer.scores[idx] + "점");
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		idx = 0;
		System.out.print("학번 입력 : ");
		num = scan.nextInt();
		int check = 0;
		for (int i = 0; i < answer.hakbuns.length; i++) {
			if (answer.hakbuns[i] == num) {
				idx = i;
				check =1;
			}
		}
		if (check != 1 ) System.out.println("해당학번은 존재하지 않습니다.");
		System.out.println();
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int max = answer.scores[0];
		int maxIdx = 0;
		
		for (int i = 0; i < answer.scores.length; i++) {
			if (max < answer.scores[i]) {
				max = answer.scores[i];
				maxIdx = i;
			}
		}
		System.out.println(answer.hakbuns[maxIdx] + "번(" + max + "점)");
	}

}
