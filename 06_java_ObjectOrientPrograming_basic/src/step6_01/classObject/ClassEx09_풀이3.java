package step6_01.classObject;

import java.util.Random;

/**
 * # 기억력 게임 : 클래스 + 변수
 * 24-05-13
 * @author 윤성희
 *
 */
/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Exx09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_풀이3 {

	public static void main(String[] args) {		
		Exx09 ex = new Exx09();
		Random ran = new Random();
		int index = ran.nextInt(10);
		int[] temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ex.front[i];
			ex.front[i] = ex.front[index];
			temp[i] = ex.front[index]; 
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(ex.front[i] + " ");
		}
		
		
	}
}

