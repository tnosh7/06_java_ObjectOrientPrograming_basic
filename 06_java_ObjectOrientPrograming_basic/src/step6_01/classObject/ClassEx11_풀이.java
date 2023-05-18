package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;


class Ex11_풀이 {

	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
	
}


public class ClassEx11_풀이 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		
		while (true) {
			System.out.println("-----------------------");
			System.out.println("계좌번호    비밀번호     계좌잔액");
			System.out.println("-----------------------");
			if (e.identifier != -1) System.out.println(e.arAcc[e.identifier] +"\t"+ e.arPw[e.identifier] +"\t"+e.arMoney[e.identifier]);
			System.out.println("-----------------------");
			if (e.identifier == -1) System.out.println("상태 : 로그아웃");
			else System.out.println("상태 : " + e.arAcc[e.identifier] + "로그인");
			System.out.println("-----------------------");
			System.out.println("[Mega Bank]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) { 
				if (e.identifier == -1 ) {
					if (e.accCnt == e.arAcc.length-1) {
						System.out.println("[메세지]가입 가능한 계좌가 없습니다.");
						continue;
					}
					else {
						System.out.print("[가입]계좌번호를 입력하세요 : ");
						String acc = scan.next();
						System.out.print("\n[가입]비밀번호를 입력하세요 : ");
						String pw = scan.next();
						System.out.print("\n[가입]금액을 입력하세요 : ");
						int money = scan.nextInt();
						System.out.println("[메세지]가입을 축하합니다.");
						e.arAcc[e.accCnt] = acc;
						e.arPw[e.accCnt] = pw;
						e.arMoney[e.accCnt] = money;
						e.accCnt++;
					}
				}
				else System.out.println("로그아웃 후에 이용해주세요.");
			}
			else if (sel == 2) {
				if (e.identifier != -1) {
					for (int i = e.identifier; i < e.accCnt-1; i++) {
						e.arAcc[i] = e.arAcc[i+1];
						e.arPw[i] = e.arPw[i+1];
						e.arMoney[i] = e.arMoney[i+1];
					}
					e.identifier = -1;
					e.accCnt--;
					System.out.println("[메세지]탈퇴되었습니다. 안녕히가십시오");
				}
				else System.out.println("로그인 후에 이용가능합니다.");
			}
			else if (sel == 3) {
				int check = 0;
				if (e.identifier == -1 && e.accCnt > -1) {
					System.out.print("[로그인]계좌번호를 입력하세요 : ");
					String loginAc = scan.next();
					for (int i = 0; i < e.accCnt; i++) {
						if (e.arAcc[i].equals(loginAc)) {
							check = 1;
						}
					}
					if (check == 1) {
					System.out.print("[로그인]비밀번호를 입력하세요 : ");
					String loginPw = scan.next();
					for (int i = 0; i < e.accCnt; i++) {
						if (e.arPw[i].equals(loginPw)) {
							e.identifier = i;
							System.out.println("[메세지]" + e.arAcc[e.identifier] + "님, 환영합니다.");
							continue;
						}
					}
					}
				}
				else System.out.println("계좌번호와 비밀번호를 확인해주세요.");
			}	
			else if (sel == 4) {
				if (e.identifier != -1) {
					System.out.println("[메세지]로그아웃 되었습니다.");
					e.identifier = -1;
				}
				else System.out.println("로그인 후에 이용가능합니다.");
			}
			else if (sel == 5) {
				if (e.identifier != -1) {
					System.out.print("[입금]입금할 금액을 입력하세요  : ");
					int addMoney = scan.nextInt();
					e.arMoney[e.identifier] +=addMoney;
				}
				else System.out.println("로그인 후에 이용가능합니다.");
			}
			else if (sel == 6) {
				int check = 0;
				int idx = 0;
				if (e.identifier != -1) {
					System.out.print("[이체]이체할 계좌번호를 입력하세요  : ");
					String awayAc = scan.next();
					
					for (int i = 0; i < e.accCnt; i++) {
						if (e.arAcc[i].equals(awayAc)) {
							check = 1;
							idx = i;
						}
					}
					System.out.print("[이체]이체할 금액을 입력해주세요 : ");
					int awayMoney = scan.nextInt();
					
					if (awayMoney > e.arMoney[e.identifier]) {
						System.out.println("[메세지]잔액이 부족합니다.");
					}
					else {
						e.arMoney[e.identifier] -= awayMoney;
						e.arMoney[idx] += awayMoney;
					}
				}
				else System.out.println("로그인 후에 이용가능합니다.");
			}
			else if (sel == 7) {
				if (e.identifier != -1) {
					System.out.println(e.arAcc[e.identifier] + "님의 계좌잔액은 " + e.arMoney[e.identifier] + "원 입니다.");
				}
				else System.out.println("로그인 후에 이용가능합니다.");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		scan.close();
	}

}
