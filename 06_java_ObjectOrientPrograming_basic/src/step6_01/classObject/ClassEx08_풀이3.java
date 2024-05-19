package step6_01.classObject;
/**
 * # 숫자이동[3단계] : 클래스 + 변수
 * 24-05-13
 * @author 윤성희
 *
 */
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
import java.util.Scanner;

class Exx08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exx08 ex= new Exx08();
		
		
		for (int i = 0; i < ex.game.length; i++) {
			if (ex.game[i] == 2) System.out.print(" 옷 ");
			else if (ex.game[i] == 0) System.out.print(" _ ");
			else System.out.print(" || ");
		}
		System.out.println();
		System.out.print("\n캐릭터 이동\n 왼쪽(1) 오른쪽(2): ");
		int move = scan.nextInt();
		if (move == 1) {
			
		}
		else if (move == 2) {
			
		}
		else {
		}
	}
	

}
