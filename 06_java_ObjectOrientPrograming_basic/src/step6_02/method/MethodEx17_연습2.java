package step6_02.method;

import java.util.Scanner;

//# 틱택토
//1. 게임 출력 조건 설정 2. 게임출력 3. 메뉴출력 4.선택에 따른 조건 설정  
//6.run 게임조건,while문 안에서 게임출력 /메뉴출력(scanner)/승리조건 run에서 설정 ./cnt/   
class TicTac{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	void setGame() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = "[ ]";
			}
		}
	}
	
	
	// 게임 화면 출력
	void showGame() {
		for (int i = 0; i < game.length; i++) {
			System.out.println();
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[i][j]+ " ");
			}
		}
	}
	
	
	// 인덱스 선택
	void choiceIdx() {
		System.out.print("선택Y : ");
		int y = scan.nextInt();
		System.out.print("선택X : ");
		int x = scan.nextInt();
		
		if (turn % 2 == 0) {
				game[y][x] = "[O]";
				turn++;
			}
		
		else if (turn % 2 == 1) {
				game[y][x] = "[X]";
				turn++;
			}
	}
	
	//for문 잊지말것 
	void exitWidth() {
		for (int i = 0; i < game.length; i++) {
			if (game[i][i] == "[O]" && game[i][i+1] == "[O]" && game[i][i+2] == "[O]" ) win = 1;
			if (game[i][i] == "[X]" && game[i][i+1] == "[X]" && game[i][i+2] == "[X]" ) win = 2;
		}
	}
	
	
	void exitHeight() {
		for (int i = 0; i < game.length; i++) {
			if (game[i][i] == "[O]" && game[i+1][i] == "[O]" && game[i+2][i] == "[O]" ) win = 1;
			if (game[i][i] == "[X]" && game[i+1][i] == "[X]" && game[i+2][i] == "[X]" ) win = 2;
		}
	}
	

	void exitCross() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (game[i][j] == "[O]" &&  game[i+1][j+1] == "[O]" && game[i+2][j+2] == "[O]") win = 1;
				if (game[i][j] == "[X]" &&  game[i+1][j+1] == "[X]" && game[i+2][j+2] == "[X]") win = 1;
			}
		}
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < 3; j++) {
				if (game[i-2][j+2] == "[O]" &&  game[i-1][j+1] == "[O]" && game[i][j] == "[O]") win = 1;
				if (game[i-2][j+2] == "[X]" &&  game[i-1][j+1] == "[X]" && game[i][j] == "[X]") win = 1;
			}
		}
	}
	
	
	void run() {
		
		setGame();
		while (true ) {
			showGame();
			choiceIdx();
			if (win == 1) {
				System.out.println("[p1]승리");
				break;
			}
			if (win == 2) {
				System.out.println("[p1]승리");
				break;
			}
			else if (turn == game.length) {
				System.out.println("비겼다");
				break;
			}
			
			choiceIdx();
			exitWidth();
			exitHeight();
			exitCross();
		}
		
}
}

public class MethodEx17_연습2 {

	public static void main(String[] args) {
		
		TicTac tic = new TicTac();
		tic.run();

	}

}
