package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class MoveGame {
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[10];
	int arrCnt = 5;
	
	void arrJustify() {
		for (int i = 0; i < arr.length; i++) {
			arr[arrCnt] = 2;
			arr[i] = 0;
		}
	}
	void printArr() { 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) System.out.print(" 옷 ");
			else System.out.print(" _ ");
		}
		System.out.println();
	}
	void printMenu() { 
		System.out.println("========숫자 이둉게임========");
		System.out.print("[1]이동 [2]종료 : ");
	}
	void gamePlay() { 
		System.out.print("[1]왼 [2]오 : ");
		int move = scan.nextInt();
		if (move == 1) {
			if (arrCnt-1 < 0) {
				System.out.println("더이상 이동할 수 없습니다.");
			}
			else {
				arr[arrCnt] = 0;
				arrCnt--;
				arr[arrCnt] = 2;
			}
		}
		else if (move == 2) {
			if (arrCnt + 1 == arr.length) {
				System.out.println("더이상 이동할 수 없습니다.");
			}
			else {
				arr[arrCnt] = 0;
				arrCnt++;
				arr[arrCnt] = 2;
			}
		}
	}
	
	void run() { 
		arrJustify();
		while (true) { 
			printArr();
			printMenu();
			int sel = scan.nextInt();
			if (sel == 1) {
				gamePlay();
			}
			else {
				break;
			}
		}
		
	}
}



public class Arr15 {

	public static void main(String[] args) {
		MoveGame m = new MoveGame();
		m.run();
	}

}
