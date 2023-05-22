package step6_02.method;

/*
 * 
 * # 메서드 오버로딩(overloading) , 메서드 중복정의
 * 
 *  1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 *  같은 이름으로 만들어진 여러개의 메서드를 사용할 수 있는 기법  [ 메서드 오버라이딩과 헷갈림 주의 ]
 *  
 */
class MethodOverloadingEx { 
	
	int add(int x , int y) {
		return x + y;
	}
	
	int add(int x , int y, int z) {
		return x + y + z;
	}
	
	double add(double x , double y) {
		return x + y;
	}
	
	int add(int[] arr) { 
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}

public class MethodEx19 {

	public static void main(String[] args) {
		
		MethodOverloadingEx obj = new MethodOverloadingEx();
		
		System.out.println(obj.add(12, 3));
		System.out.println(obj.add(12, 3, 1));
		// obj.add(12, 3, 1, 4); // error
		System.out.println(obj.add(3.14, 7.14));
		
		int[] temp = {1,2,3,4,5};
		System.out.println(obj.add(temp));
		
		System.out.println();
		
		// (참고) 메서드오버로딩 사용된 예시
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('c');
		System.out.println("글자");
		System.out.println(true);
		// System.out.println(1, 1);
		
		"글자데이터".substring(1);
		"글자데이터".substring(1, 3);
		
		
		
		
		
	}
}
