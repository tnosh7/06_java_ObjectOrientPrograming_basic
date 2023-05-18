package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


class Ex13_풀이 {

	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
	
}



public class ClassEx13_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex13_풀이 e = new Ex13_풀이();
		
		for (int i = 0; i < e.SIZE; i++) {
			e.front[i] = i+1;
			e.back[i] = i+ e.SIZE +1;
		}

		

		for (int i = 0; i < 1000; i++) {
			int rNum = ran.nextInt(e.SIZE);
			int tmp = e.front[0];
			e.front[0] = e.front[rNum];
			e.front[rNum] = tmp;
		}
		
		
		int k = 1;
		while (true) {
			System.out.println();
			
			for (int i = 0; i < e.front.length; i++) {
				if (e.front[i] == 0) System.out.print("\t");
				else System.out.print(e.front[i] + "\t");
				if (i % 3 == 2) System.out.println("\n");
			}
			if (k==19) {
				System.out.println("게임승리");
				break;
			}
			
			System.out.print("입력(0~8):");
			int idx = scan.nextInt();
			
			if (e.front[idx] == k) {
				if (1 <= k && k <= e.SIZE) {
					e.front[idx] = e.back[idx];
				}
				else if (e.SIZE < k && k <= 18) { //back 완성 
					e.front[idx] = 0;
				}
			k++; 
			}
		}
		scan.close();
	}

}
