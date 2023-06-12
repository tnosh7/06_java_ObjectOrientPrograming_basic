package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class NumGame {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[][]first = new int[3][3];
	int[][]second = new int[3][3];
	int cnt = 1;
	
	void setGame() {
		int k = 0;
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				first[i][j] = k+1;
				second[i][j] = k + 10;
				k++;
			}
		}
	}
	
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int yr = ran.nextInt(3);
			int xr = ran.nextInt(3);
		
			int tmp = first[yr][xr];
			first[yr][xr] = first[0][0];
			first[0][0] = tmp;
		}
	}
	
	void printGame() {
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first.length; j++) {
				if (first[i][j] != 0) {
					System.out.print(first[i][j] + "\t");
				}
				else if (first[i][j] ==0 ) {
					System.out.print(" \t");
				}
			}
			System.out.println("\n");
		}
	}
	void game(){
		System.out.print("y입력 : ");
		int y = scan.nextInt();
		System.out.print("\nx입력 : ");
		int x = scan.nextInt();
		if (cnt > 0 && cnt < 10) {
			if (first[y][x] == cnt) {
				first[y][x] = second[y][x];
				cnt++;
			}
		}
		else if (cnt > 9 && cnt < 19) {
			if (first[y][x] == cnt) {
				first[y][x] = 0;
				cnt++;
			}
		}
	}
	void run() {
		setGame();
		shuffle();
		while (true) {
			System.out.println("=======1to18=======");
			printGame();
			game();
			if (cnt == 19) {
				System.out.println("게임승리");
				break;
			}
		}
	}
}

public class Arr17 {

	public static void main(String[] args) {
		NumGame n = new NumGame();
		n.run();
	}

}
