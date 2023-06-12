package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */
// 카드랑 메뉴 따로 출력   
class MemoryGam{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;
	
	void shuffle() {
		
		for (int i = 0; i < front.length; i++) {
			int r = ran.nextInt(10);
			int tmp = front[r];
			front[r] = front[0];
			front[0] = tmp;
		}
	}
	
	void printCard() {
		
		System.out.print(Arrays.toString(front)+ " ");
		System.out.println();
		System.out.print(Arrays.toString(back)+ " ");
		
	}
	void menu() { 
		System.out.println("=====카드게임=====");
		System.out.println("1. 카드 선택 ");
		System.out.println("2. 게임 종료");
	}
	
	void answer() { 
		System.out.println("같은 카드 선택 1: ");
		int idx1 = scan.nextInt();
		System.out.println("같은 카드 선택 2: ");
		int idx2 = scan.nextInt();
		if (front[idx1] == front[idx2]) {
			back[idx1] = front[idx1];
			back[idx2] = front[idx2];
			correctCnt++;
		}
	}
	
	void run() { 
		while(true) { 
			shuffle();
			printCard();
			menu();
			
			int sel = scan.nextInt();
			if (sel == 1)  {
				answer();
				if (correctCnt == 5) {
					System.out.println("게임승리");
					break;
				}
			}
			else if (sel==2) {
				System.out.println("게임종료");
				break;
			}
			
		}
	}
}

public class MethodEx16_풀이 {

	public static void main(String[] args) {

		MemoryGam mg = new MemoryGam();
		mg.run();

	}

}
