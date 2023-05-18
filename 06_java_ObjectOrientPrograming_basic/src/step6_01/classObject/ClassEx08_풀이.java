package step6_01.classObject;

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class Ex08_풀이{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}



public class ClassEx08_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex08_풀이 answer = new Ex08_풀이();
		
		int player = 0;
		
		while (true) {
			
			for (int i = 0; i < answer.game.length; i++) {
				if (answer.game[i] == 2) {
					System.out.print(" [옷] ");
					player = i;
				}
				else System.out.print(answer.game[i]+ " ");
			}
			System.out.println();
			
			System.out.print("player(1~2) : ");
			int p1 = scan.nextInt();
			
			if (p1 == 1) {
				int check = 0;
				if (player-1 < 0) {
					answer.game[player] = 0;
					player = answer.game.length-1;
					answer.game[player] =2;
					continue;
				}
				else if (answer.game[player-1] == 1) {
					System.out.print("벽  격파(3) 입력 : ");
					int smash =scan.nextInt();
					if (smash == 3) {
						check =1;
					}
				}
				else check = 1;
				
				if (check ==1 ) {
					answer.game[player] = 0;
					player--;
					answer.game[player] = 2;
				}	
			}
			
			else if (p1 == 2) {
				
				int check = 0;
				if (player +1 == answer.game.length) {
					answer.game[player] = 0;
					player = 0;
					answer.game[player] =2;
					continue;
				}
				else if (answer.game[player+1] == 1) {
					System.out.print("벽  격파(3) 입력 : ");
					int smash =scan.nextInt();
					if (smash == 3) {
						check =1;
					}
				}
				else check = 1;
				
				if (check ==1 ) {
					answer.game[player] = 0;
					player++;
					answer.game[player] = 2;
				}	
			}
		}
		
	}
}
