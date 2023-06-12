package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGam{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printGame() {
		for (int i = 0; i < move.length; i++) {
			if (move[i] == 8) System.out.print(" 옷 ");
			else System.out.print(" _ ");
		}
		System.out.println();
	}
	
	void printMenu() {
		System.out.println("========숫자 이동게임=========");
		System.out.print("왼(1)오(2) : ");
		System.out.println("3. 종료하기");
	}
	
	void gameLeft() {
		if (playerLocation > 0) {
			move[playerLocation] = 0;
			playerLocation--;
			move[playerLocation] = 8;
		}
		else {
			System.out.println("더이상 움직일 수 없습니다.");
		}
	}
	void gameRight() { 
		if(playerLocation < move.length-1) {
			move[playerLocation] = 0;
			playerLocation++;
			move[playerLocation] = 8;
		}
		else {
			System.out.println("더이상 움직일 수 없습니다.");
		}
	}
	void run () { 
		
		while (true) {
			printGame();
			printMenu();
			int sel = scan.nextInt();
			if (sel == 1) {
				gameLeft(); 
			}	
			else if (sel== 2) {
				gameRight() ;
			}
			else {
				System.out.println("프로그램종료");
				break;
			}
		}
		
		
	}
	
}

public class MethodEx15_풀이 {

	public static void main(String[] args) {
		
		NumberGam g = new NumberGam();
		g.run();

	}

}
