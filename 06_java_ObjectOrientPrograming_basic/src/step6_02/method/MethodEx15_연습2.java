package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */
//일단 게임문제 출력, 메뉴 출력 , 이동할때 조건(왼/오), 그다음 런 .?
//메뉴선택은 run에서 하기 
class Number{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printPlay() {
	
		for (int i = 0; i < move.length; i++) {
			if (move[i] == 8 ) System.out.print("옷");
			else System.out.print("_");
			System.out.print(" ");
		}
		System.out.println();
	}
	
	void showMenu() {
		
		while (true) {
			printPlay();
			run();
			moveLeft();
			moveRight();
			}
			else {
				break;
			}
		}
		
	}
	
	
	
	void moveLeft() {
		int idx = scan.nextInt();
		if (idx == 1) {
			if (playerLocation == 0) {
				System.out.println("더이상 이동할 수 없습니다.");
			}
			else {
				move[playerLocation] = 0;
				playerLocation--;
				move[playerLocation] = 8;
			}
		}
	}
	
	
	
	void moveRight() {
		int idx = scan.nextInt();
		if (idx == 2) {
			if (playerLocation == move.length-1) {
				System.out.println("더이상 이동할 수 없습니다.");
			}
			else {
				move[playerLocation] = 0;
				playerLocation++;
				move[playerLocation] = 8;
			}
		}
	}
	
	
	
	void run() {
		System.out.println("1 .이동\t2. 종료  ");
		int sel = scan.nextInt();
		if (sel == 1) {
			System.out.print("왼(1) 오(2) 입력 : ");
	
}
}
public class MethodEx15_연습2 {

	public static void main(String[] args) {
		
		Number g = new Number();
		g.run();

	}

}
