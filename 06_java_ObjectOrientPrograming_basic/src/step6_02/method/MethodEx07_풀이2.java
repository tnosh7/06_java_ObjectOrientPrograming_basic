package step6_02.method;

/**
 * 24-05-14
 * 메서드 문제 풀이3
 * @author 윤성희
 *
 */
class Exx07 {
	
	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println("짝수");
		}
		else System.out.println("홀수");
	}
	void getAvgBetweenValues(int x, int y) {
		int total = 0;
		int cnt =0;
		for (int i = x; i <= y; i++) {
			total += i; 
			cnt++;
		}
		int avg = total / cnt;
		System.out.println("평균 : " + avg);
	}

	void printPrimeNums(int primeNumber) {
		for (int i = 1; i <= primeNumber; i++) {
			for (int j = i; j < primeNumber; j++) {
				
			}
		}
	}
}


public class MethodEx07_풀이2 {

	public static void main(String[] args) {
		
		
			Exx07 e = new Exx07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
