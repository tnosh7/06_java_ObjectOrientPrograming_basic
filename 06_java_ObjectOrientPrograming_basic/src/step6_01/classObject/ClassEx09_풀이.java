package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_풀이{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_풀이 {

	public static void main(String[] args) {
		
		Ex09_풀이 e = new Ex09_풀이();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int size =e.front.length;
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt();
			int tmp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = tmp;
		}
		while (true) {
			for (int i = 0; i < size; i++) {
				if (e.front[i] == 1) System.out.println("ㅁ\t");
				if (e.front[i] == 2) System.out.println("o\t");
				if (e.front[i] == 3) System.out.println("△\t");
				if (e.front[i] == 4) System.out.println("◇\t");
				if (e.front[i] == 5) System.out.println("▽\t");
			}
			System.out.println();
			for (int i = 0; i < size; i++) {
				if (e.back[i] == 1) System.out.println("■\t");
				if (e.back[i] == 2) System.out.println("●\t");
				if (e.back[i] == 3) System.out.println("▲\t");
				if (e.back[i] == 4) System.out.println("◆\t");
				if (e.back[i] == 5) System.out.println("▼\t");
			}
			System.out.println();
			
			
			if (e.answerCnt == 5) break;
			System.out.print("인덱스 1  입력 : ");
			int idx1 = scan.nextInt();
			System.out.print("인덱스 2  입력 : ");
			int idx2 = scan.nextInt();

			if (e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx1];
				e.answerCnt++;
			}
		}
		
		scan.close();
	}

}
