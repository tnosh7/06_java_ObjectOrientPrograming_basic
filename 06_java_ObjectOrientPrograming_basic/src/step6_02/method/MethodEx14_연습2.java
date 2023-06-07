 package step6_02.method;

import java.util.Arrays;
import java.util.Scanner;

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

class Theat{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	int bookCnt = 0;				
	int money = 0;					
	
	
	void showMenu() {
		//메뉴
		
		System.out.println("--메가박스--");
		System.out.println("1.좌석예매 2.영수증출력");
	}
	
	void showSeat() {
		//좌석 조건 
		System.out.println("좌석 선택 : ");
		int idx = scan.nextInt();
		if (idx != seat.length-1) {
			if (seat[idx] == 1) {
				System.out.println("이미 예매가 완료된 자리입니다.");
			}
			else {
				seat[idx] = 1;
				bookCnt++;
 			}
		}
		
	}
	
	
	
	void choiceSeat() {
		// 좌석 현황 출력하기
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print("[X]");
			}
			else {
				System.out.print("[O]");
			}
		}
		System.out.println();
	}
	
	
	
	void showSales() {
		//매출 
		money = bookCnt * 12000;
		System.out.println("총금액 : " + money + "원");
	}
	
	void run() {
		while (true) {
			showMenu();
			int sel = scan.nextInt();
			if (sel == 1) {
				choiceSeat();
				showSeat();
			}
			else {
				showSales();
				break;
			}
		}
	}
}

public class MethodEx14_연습2 {

	public static void main(String[] args) {

		Theat megabox = new Theat();
		megabox.run();
		
	}

}
