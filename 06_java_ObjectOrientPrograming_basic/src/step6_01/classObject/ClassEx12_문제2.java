package step6_01.classObject;

import java.util.Scanner;

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


class E12{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}



public class ClassEx12_문제2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		E12 e = new E12();
		//값입력 - 출력 - 승리자 - 선택 조건 - 승리조건 
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game[i].length; j++) {
				e.game[i][j] = "[ ]";
			}
		}
		
		while (true) { 
			
			System.out.println("=====틱택토 게임=====");
			for (int i = 0; i < e.game.length; i++) {
				for (int j = 0; j < e.game[i].length; j++) {
					System.out.print(e.game[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.print("Y선택 : ");
			int y = scan.nextInt();
			System.out.print("X선택 : ");
			int x = scan.nextInt();
			
			if (e.win == 1) {
				System.out.println("[p1]승리");
				break;
			}
			else if (e.win == 2) {
				System.out.println("[p2]승리");
				break;
			}
			if (e.win == 0 && e.turn == 9) {
				System.out.println("비겼다.");
				break;
			}
			
			if(e.turn % 2 == 0) {
				if (e.game[y][x].equals("[X]")) {
					System.out.println("중복입력");
					continue;
				}
				else {
					e.game[y][x] = "[O]";
					e.turn++;
				}
				
			}
			else if(e.turn % 2 == 1) {
				if (e.game[y][x].equals("[O]")) {
					System.out.println("중복입력");
					continue;
				}
				else {
					e.game[y][x] = "[X]";
					e.turn++;
				}
			}
			
			for (int i = 0; i < 3; i++) {
				if (e.game[i][0] == "[O]" && e.game[i][1] == "[O]"&& e.game[i][2] == "[O]") e.win = 1;
				if (e.game[i][0] == "[X]" && e.game[i][1] == "[X]"&& e.game[i][2] == "[X]") e.win = 2;
			}
			
			for (int i = 0; i < 3; i++) {
				if (e.game[0][i] == "[O]" && e.game[1][i] == "[O]" && e.game[2][i] == "[O]") e.win = 1;
				if (e.game[0][i] == "[X]" && e.game[1][i] == "[X]" && e.game[2][i] == "[X]") e.win = 2;
			}
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (e.game[i][j] == "[O]" && e.game[i+1][j+1] == "[O]"&& e.game[i+2][j+2] == "[O]") e.win = 1;
					if (e.game[i][j] == "[X]" && e.game[i+1][j+1] == "[X]"&& e.game[i+2][j+2] == "[X]") e.win = 2;
				}
			}
			for (int i = 3; i > 0; i--) {
				for (int j = 0; j < 3; j++) {
					if (e.game[i][j] == "[O]" && e.game[i-1][j+1] == "[O]"&& e.game[i-2][j+2] == "[O]") e.win = 1;
					if (e.game[i][j] == "[X]" && e.game[i-1][j+1] == "[X]"&& e.game[i-2][j+2] == "[X]") e.win = 2;
				}
			}
			
		}
		
		
		
	
	}

}
