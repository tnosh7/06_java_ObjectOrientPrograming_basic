package step6_01.classObject;
/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

import java.util.Scanner;

class Ex12_풀이{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}



public class ClassEx12_풀이 {
	
	public static void main(String[] args) {
		Ex12_풀이 e = new Ex12_풀이();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j <e.game.length; j++) {
				e.game[i][j] = "[ ]";
			}
		}
		String p1 = "[O]";
		String p2 = "[X]";
		
		while (true) {
			//게임출력 
			System.out.println("\n=====틱택토=====");
			for (int i = 0; i < e.game.length; i++) {
				System.out.println();
				for (int j = 0; j < e.game[i].length; j++) {
					System.out.print(e.game[i][j]);
				}
			}
			System.out.println();
			if (e.win ==1 ) {
				System.out.println("[p1]승리");
				break;
			}
			else if (e.win ==2 ) {
				System.out.println("[p2]승리");
				break;
			}
			if (e.win == 0 && e.turn == 9) {
				System.out.println("비겼다");
				break;
			}
			//turn 에 따른 조건 
			if (e.turn % 2 == 0) {
				System.out.print("[p1]Y좌표 입력 : ");
				int p1Y  = scan.nextInt();
				System.out.print("[p1]X좌표 입력 : ");
				int p1X  = scan.nextInt();
				
				if (e.game[p1Y][p1X].equals("[ ]")) {
					e.game[p1Y][p1X] = p1;
					e.turn++;
				}
			}
			if (e.turn % 2 == 1) {
				System.out.print("[p2]Y좌표 입력 : ");
				int p2Y  = scan.nextInt();
				System.out.print("[p2]X좌표 입력 : ");
				int p2X  = scan.nextInt();
				
				if (e.game[p2Y][p2X].equals("[ ]")) {
					e.game[p2Y][p2X] = p2;
					e.turn++;
				}
			}
			//승리조건 
			//가로 
			for (int i = 0; i < 3; i++) {
				if (e.game[i][0].equals(p1) && e.game[i][1].equals(p1) && e.game[i][2].equals(p1)) e.win =1; 
				if (e.game[i][0].equals(p2) && e.game[i][1].equals(p2) && e.game[i][2].equals(p2)) e.win =2; 
					
			}
			//세로
			for (int i = 0; i < 3; i++) {
				if (e.game[0][i].equals(p1) && e.game[1][i].equals(p1) && e.game[2][i].equals(p1)) e.win =1; 
				if (e.game[0][i].equals(p2) && e.game[1][i].equals(p2) && e.game[2][i].equals(p2)) e.win =2; 
					
			}
			//대각선 왼오 오왼 
				if (e.game[0][0].equals(p1) && e.game[1][1].equals(p1) && e.game[2][2].equals(p1)) e.win =1; 
				if (e.game[0][0].equals(p2) && e.game[1][1].equals(p2) && e.game[2][2].equals(p2)) e.win =2; 

				if (e.game[0][2].equals(p1) && e.game[1][1].equals(p1) && e.game[2][0].equals(p1)) e.win =1; 
				if (e.game[0][2].equals(p2) && e.game[1][1].equals(p2) && e.game[2][0].equals(p2)) e.win =2; 
		}
		
		
		scan.close();
	}

}
