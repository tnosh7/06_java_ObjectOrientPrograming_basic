package step6_01.classObject;
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

import java.util.Scanner;

class Ex10_풀이 {
	
	int[] menuPrices   = {    2500,       3800,     1500,  1000};
	String[] menuNames = {"치즈버거  ", "불고기버거", "감자튀김  ", "콜      라 "};
	int[] orderCnt = new int[4];
	int totalPrice = 0;
	
}


public class ClassEx10_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex10_풀이 aa = new Ex10_풀이();
		
		while (true) {
			System.out.println("========맘스터치========");
			System.out.println("ITEM\tQTY\tAMT");
			for (int i = 0; i < aa.menuPrices.length; i++) {
				System.out.println((i+1) + "번. " + aa.menuNames[i] + " : " + aa.menuPrices[i]+ "원");
			}
			System.out.println("----------------------");
			
			System.out.print("1.주문 2.영수증출력 :");
			int menu = scan.nextInt();
			
			if (menu == 1) {
			
				System.out.print("메뉴선택(1~4) : ");
				int sel = scan.nextInt();

				if (sel == 1) {
					aa.orderCnt[0]++;
				}
				
				else if (sel == 2) {
					aa.orderCnt[1]++;
				}
				
				else if (sel == 3) {
					aa.orderCnt[2]++;
				}
				
				else if (sel == 4) {
					aa.orderCnt[3]++;
				}
			}
			else if (menu ==2 ) {
				System.out.println("========맘스터치========");
				System.out.println("ITEM\tQTY\tAMT");
				for (int i = 0; i < aa.menuPrices.length; i++) {
					aa.totalPrice += aa. orderCnt[i] * aa.menuPrices[i];
					System.out.println("*" + aa.menuNames[i] + " :  " 
					+ aa.orderCnt[i] +" : " + aa.menuPrices[i]+ "원");
				}
				System.out.println("----------------------");
				System.out.println(">>합계 금액 : " + aa.totalPrice  );
				System.out.print(">>지불액 입력 : ");
				int money =scan.nextInt();
				System.out.println(">>받은 금액 : " + money);
				System.out.println("----------------------");
				System.out.println(">>잔돈 : " + (money - aa.totalPrice) + "원");
				break;
			}
		}
		scan.close();
	}

}
