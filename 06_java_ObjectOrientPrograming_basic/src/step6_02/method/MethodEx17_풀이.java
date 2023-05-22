package step6_02.method;

import java.util.Scanner;

//# 틱택토
//1. 게임 출력 조건 설정 2. 게임출력 3. 메뉴출력 4.선택에 따른 조건 설정  
//6.run 게임조건,while문 안에서 게임출력 /메뉴출력(scanner)/승리조건 run에서 설정 ./cnt/   
class TicTacTo{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	void printGame() { 
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				game[i][j] = " ";
			}
		}
	}
	
	void printMenu () { 
		
		System.out.println("== 틱택톡 ==");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("==========");
	}
	void turn() {
		System.out.print("[" + (turn+1) + "] y인덱스 입력 : ");
		int y = scan.nextInt();
		System.out.print("[" + (turn+1) + "] x인덱스 입력 : ");
		int x = scan.nextInt();
		if (turn % 2 == 0) {
			if (game[y][x].equals(" ")) {
				game[y][x] = "O";
			}
				
		}
		else if (turn % 2 == 1) {
			if (game[y][x].equals(" ")) {
				game[y][x] = "X";
			}
		}
		turn++;
	}
	void width() {
		if (game[0][0].equals("O") && game[0][1].equals("O") && game[0][2].equals("[O]")) win =1;
		if (game[0][0].equals("X") && game[0][1].equals("X") && game[0][2].equals("[X]")) win =2;
	}
	
	void length() {
		if (game[0][0].equals("O") && game[1][0].equals("O") && game[2][0].equals("[O]")) win =1;
		if (game[0][0].equals("X") && game[1][0].equals("X") && game[2][0].equals("[X]")) win =2;
	}
	void cross() { 
		if (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("[O]")) win =1;
		if (game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("[X]")) win =2;
	
		if (game[2][0].equals("O") && game[1][1].equals("O") && game[0][2].equals("[O]")) win =1;
		if (game[2][0].equals("X") && game[1][1].equals("X") && game[0][2].equals("[X]")) win =2;
	}
	void run() {
		
		printGame();
		while(true ) { 
			
			printMenu();
			if (win ==1) {
				System.out.println("p1승리");
				break;
			}
			else if (win ==2 ) {
				System.out.println("p2승리");
				break;
			}
			turn();
			width();
			length();
			cross();
		}
		
		
	}
}


public class MethodEx17_풀이 {

	public static void main(String[] args) {
		
		TicTacTo tic = new TicTacTo();
		tic.run();

	}

}
