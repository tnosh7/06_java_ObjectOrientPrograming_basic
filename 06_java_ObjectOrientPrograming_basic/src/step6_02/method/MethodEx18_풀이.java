package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class SpeedGam {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;
//front 에 숫자넣기 / 게임 출력 / 입력에 따른 조건 /  run 에서 
	void rNum () {
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back.length; j++) {
				front[i][j] = num;
				back[i][j] = num + 9;
				num++;
			}
		}
		num = 1;
	}
	void shuffle() { 
		for (int i = 0; i < 1000; i++) {
			int xR = ran.nextInt(front.length);
			int yR = ran.nextInt(front[0].length);
			int tmp = front[0][0];
			front[0][0] = front[xR][yR];
			front[xR][yR] = tmp;
			tmp = back[0][0];
			back[0][0] = back[xR][yR];
			back[xR][yR] = tmp;
		}			
	}
	void menu() {
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back.length; j++) {
				if (front[i][j] == 0) System.out.print("    ");
				else System.out.print(front[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("y입력 : ");
		int y =scan.nextInt();
		System.out.print("\nx입력 : ");
		int x =scan.nextInt();
		
		if (front[y][x] == num) {
			if (num >0 && num < 10) {
				front[y][x] = back[y][x];
				
			}
			else if (num >= 10 && num < 19) {
				front[y][x] = 0;
			}
			num++;
		}	
	}
	void run () {
		rNum();
		shuffle();
		while (true) {
			
			if (num == 18) {
				System.out.println("게임승리");
				break;
			}
			menu();
			
			
			
		}
	}
		
	
	
	
	
}



public class MethodEx18_풀이 {

	public static void main(String[] args) {
		
		SpeedGam sg = new SpeedGam();
		sg.run();

	}

}
