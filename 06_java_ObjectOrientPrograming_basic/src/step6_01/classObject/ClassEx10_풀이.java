package step6_01.classObject;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

class Ex10_v {
	
	int[] menuPrices   = {    2500,       3800,     1500,  1000};
	String[] menuNames = {"치즈버거", "불고기버거", "감자튀김", "콜라"};
	int[] orderCnt = new int[4];
	int totalPrice = 0;
	
}

public class ClassEx10_풀이 {

	public static void main(String[] args) {
		Ex10_v e = new Ex10_v();
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("======== 빅 버거 ========");
			for (int i = 0; i < e.menuNames.length; i++) {
				System.out.println((i+1) + ". " + e.menuNames[i] + " : " + e.menuPrices[i] + "원");
			}
			System.out.print(">>>>> 1)주문 \t2)영수증 출력 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.print(">>>>> 메뉴번호 선택 : ");
				int idx = scan.nextInt()-1;
				
				e.orderCnt[idx]++;
				
			}
			else if (sel == 2) {
				System.out.println("-------------------");
				System.out.println("ITEM\tQTY\tAMT");
				for (int i = 0; i < e.menuNames.length; i++) {
					System.out.println(e.menuNames[i] + "\t" + e.orderCnt[i]+"\t"+ e.menuPrices[i]);
				}
				System.out.println("-------------------");
				for (int i = 0; i < e.menuPrices.length; i++) {
					e.totalPrice += (e.orderCnt[i] * e.menuPrices[i]);
				}
				System.out.println(">>합계금액 : " + e.totalPrice);
				System.out.print("지불액 입력 : ");
				int money = scan.nextInt();
				System.out.println("잔액 = " + (money-e.totalPrice) + "원");
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
			
			
			
			
		
	}

}
