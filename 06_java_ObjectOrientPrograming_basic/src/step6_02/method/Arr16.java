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

class CardGame {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	int[]front = {1,1,2,2,3,3,4,4,5,5};
	int[]back = new int[10];
	int cnt = 0;
	
	void frontRandom() {
		
		for (int i = 0; i < front.length; i++) {
			int r = ran.nextInt(10);
			int tmp = front[r];
			front[r] = front[0];
			front[0] = tmp;
		}
	}
	void printGame() {
		
		System.out.println(Arrays.toString(front) + " ");
		System.out.println(Arrays.toString(back) + " ");
		System.out.println("=====카드 게임=====");
		System.out.println("[1]카드 선택 \t[2]게임 종료 :");
	}
	
	void gamePlay() {
		System.out.print("선택 1 : ");
		int num1 = scan.nextInt();
		System.out.print("선택 2 : ");
		int num2 = scan.nextInt();
		
		if (front[num1] == front[num2]) {
			back[num1] = front[num1];
			back[num2] = front[num2];
			cnt++;
		}
	}
	
	void run() {
		frontRandom();
		while (true) {
			printGame();
			int sel = scan.nextInt();
			if (sel == 1) {
				gamePlay();
				if (cnt == 5) {
					System.out.println("게임 승리");
					break;
				}
			}
			else if (sel == 2) {
				System.out.println("게임 종료");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
		}
	}
}

public class Arr16 {

	public static void main(String[] args) {
		CardGame e = new CardGame();
		e.run();
	}

}
