package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */

class Product {
	
	String code;
	String name;
	int price; 
	int deliveryPrice;
	
}

public class ClassEx02 {

	public static void main(String[] args) {

		// ClassEx01에서 생성한 클래스 
		Member member = new Member();
		member.id = "qwer1234";
		member.name = "익명";
		
		System.out.println("id : " + member.id);
		System.out.println("name : " + member.name);
		System.out.println();
		
		Product product = new Product();
		product.code = "0x001";
		product.name = "스마트 TV";
		product.price = 300000;
		product.deliveryPrice = 3000;
		
		System.out.println("code : " +product.code);
		System.out.println("name : " +product.name);
		System.out.println("price : " +product.price);
		System.out.println("deliveryPrice : " +product.deliveryPrice);
		
	}

}
