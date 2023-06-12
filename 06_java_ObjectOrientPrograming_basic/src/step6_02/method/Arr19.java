package step6_02.method;

import java.util.Scanner;

class tictaktoe {
	Scanner scan = new Scanner(System.in);
	String [][]tictoe = new String[3][3];
	int win = 0;
	int turn = 0;
	void tictoeGame() {
		for (int i = 0; i < tictoe.length; i++) {
			for (int j = 0; j < tictoe.length; j++) {
				tictoe[i][j] = "[ ]";
			}
		}
	}
	void printTictoe() {
		System.out.println("==== 틱택톡 ====");
		for (int i = 0; i < tictoe.length; i++) {
			for (int j = 0; j < tictoe.length; j++) {
				System.out.print(tictoe[i][j]);
			}
			System.out.println();
		}
		System.out.println("=============");
	}
	
	void p1Play() {
		System.out.print("[" + (turn +1) + "]" + " y인덱스 입력 : ");
		int y = scan.nextInt();
		System.out.print("[" + (turn +1) + "]" + " x인덱스 입력 : ");
		int x = scan.nextInt();
		if (turn % 2 == 0) {
			if (tictoe[y][x].equals("[X]")) {
				System.out.println("다시 입력하세요.");
			}
			else {
				tictoe[y][x] = "[O]";
				turn++;
			}
		}
	}
	void p2Play() {
		System.out.print("[" + (turn +1) + "]" + " y인덱스 입력 : ");
		int y = scan.nextInt();
		System.out.print("[" + (turn +1) + "]" + " x인덱스 입력 : ");
		int x = scan.nextInt();
		if (turn % 2 == 1) {
			if (tictoe[y][x].equals("[O]")) {
				System.out.println("다시 입력하세요.");
			}
			else {
				tictoe[y][x] = "[X]";
				turn++;
			}
		}
	}
	void width() {
		for (int i = 0; i < 3; i++) {
			if (tictoe[i][0].equals("[O]") && tictoe[i][1].equals("[O]") &&  tictoe[i][2].equals("[O]")) win=1;
			if (tictoe[i][0].equals("[X]") && tictoe[i][1].equals("[X]") &&  tictoe[i][2].equals("[X]")) win=2;
		}
	}
	
	void length() {
		for (int i = 0; i < 3; i++) {
			if(tictoe[0][i].equals("[O]") && tictoe[1][i].equals("[O]") && tictoe[2][i].equals("[O]")) win=1;
			if(tictoe[0][i].equals("[X]") && tictoe[1][i].equals("[X]") && tictoe[2][i].equals("[X]")) win=2;
		}
	}
	void cross() {
		if(tictoe[0][0].equals("[O]") && tictoe[1][1].equals("[O]") && tictoe[2][2].equals("[O]")) win=1;
		if(tictoe[0][0].equals("[X]") && tictoe[1][1].equals("[X]") && tictoe[2][2].equals("[X]")) win=2;

		if(tictoe[2][0].equals("[O]") && tictoe[1][1].equals("[O]") && tictoe[0][2].equals("[O]")) win=1;
		if(tictoe[2][0].equals("[X]") && tictoe[1][1].equals("[X]") && tictoe[0][2].equals("[X]")) win=2;
	}
	
	void run() {
		
		tictoeGame();
		
		while(true) {
			printTictoe();
			if (win == 1) {
				System.out.println("p1승리");
				break;
			}
			else if (win == 2) {
				System.out.println("p2승리");
				break;
			}
			else if (turn == 9 && win == 0) {
				System.out.println("비겼다");
				break;
			}
			p1Play();
			p2Play();
			width();
			length();
			cross();
		}
		
	}
	
}


public class Arr19 {

	public static void main(String[] args) {
		tictaktoe e = new tictaktoe();
		e.run();
	}

}
