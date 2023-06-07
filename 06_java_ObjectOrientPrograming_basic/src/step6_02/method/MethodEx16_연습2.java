package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */
//먼저 카드 섞기. 카드출력,메뉴 , 선택조건,  run = 카드출력,,메뉴, 선택하기(scanner), 게임종료  
//break를 써야 하는 구문은 run에서 쓰기 
class Memory{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;
	
	void shuffle() {
		for (int i = 0; i < back.length; i++) {
			int r = ran.nextInt(10);
			int tmp = front[0];
			front[0] = front[r];
			front[r] = tmp;
		}
	}
	
	void printCard() {
		System.out.print(Arrays.toString(front) + " ");
		System.out.println();
		System.out.print(Arrays.toString(back) + " ");
		System.out.println();
		
	}
	
	
	
	void choiceCard() {
		System.out.print("카드 선택1 : ");
		int sel1 = scan.nextInt();
		System.out.print("카드 선택2 : ");
		int sel2 = scan.nextInt();
		
		if (front[sel1] == front[sel2]) {
			back[sel1] = front[sel1];
			back[sel2] = front[sel2];
			correctCnt++;
		}
		
	}
	
	
	
	void run() {
		while (true) {
			shuffle();
			printCard();
			choiceCard();
			if (correctCnt == 5) {
				break;
			}
			
		}
}
}
public class MethodEx16_연습2 {

	public static void main(String[] args) {

		Memory mg = new Memory();
		mg.run();

	}

}
