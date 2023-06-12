package step6_02.method;
/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

import java.util.Scanner;

class cgv {
	
	Scanner scan = new Scanner(System.in);
	int[] seat = new int[8];
	int cnt = 0;
	
	void seatJustify() {
		for (int i = 0; i < seat.length; i++) {
			seat[i] = 0;
		}
	}
	void printSeat() {
		System.out.print("좌석 선택(0~7) : ");
		int sel = scan.nextInt();
		if (seat[sel] == 1) {
			System.out.println("이미 선택된 자리입니다.");
		}
		else if (seat[sel] == 0) {
			seat[sel] = 1;
			cnt++;
		}
	}
	void printMenu() {
		for (int i = 0; i < seat.length; i++) {
			if (seat[i]== 0) {
				System.out.print(" X ");
			}
			else System.out.print(" O ");
		}
		System.out.println();
		System.out.print("[1]영화 예매 [2]종료 : ");
	}
	void printMoney() { 
		int tol = cnt * 12000;
		System.out.println("총액 = " + tol);
		System.out.print("금액 입력 : ");
		int cash = scan.nextInt();
		if (cash < tol) {
			System.out.println("금액이 부족합니다.");
		}
		else {
			System.out.println("잔액 : " + (cash - tol) + "원");
		}
	}
	void run() {
		seatJustify();
		while (true) {
			printMenu();
			int choice = scan.nextInt();
			if (choice == 1) {
				printSeat();
			}
			else {
				printMoney();
				break;
			}
		}
	}
	
}
public class Arr14 {

	public static void main(String[] args) {
		cgv c = new cgv();
		c.run();
	}

}
