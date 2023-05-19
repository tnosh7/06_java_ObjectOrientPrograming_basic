package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */ //void return
class MethodType { 
	
	// 입력데이터도 없고 결과데이터도 없는 경우 (00)				//returnX 결과데이터X //e.뭐뭐 없으면
	void type00() { 
		
		System.out.println("==========");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 정보조회");
		System.out.println("4. 정보수정");
		System.out.println("5. 종료");
		System.out.println("==========");
		System.out.println();
		
	}
	
	// 입력데이터는 있고 결과데이터는 없는 경우 (10)
	void type10(String fileName) { // 파라메타 
		
		//int testVar = 10; // 지역변수 
		
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	// 입력데이터는 없고 결과데이터는 있는 경우(01)
	double type01() { 
		return 3.141592;
	}
	

	// 입력데이터도 있고 결과데이터도 있는 경우(11)
	int type11(String birth) { 
		String temp = birth.substring(0, 4);
		int age = 2023 - Integer.parseInt(temp) + 1 ;
		
		return age;  //type11 앞 int랑 리턴age랑 타입이 같아야 함 . 
		
	}
}

public class MethodEx02 {

	public static void main(String[] args) {

		MethodType methodType = new MethodType(); 

		// 입력데이터도 없고 결과데이터도 없는 경우 (00)
		methodType.type00();
		methodType.type00();
		methodType.type00();
		System.out.println();
		
		
		// 입력데이터는 있고 결과데이터는 없는 경우 (10)
		methodType.type10("팀 버너스리.txt");
		methodType.type10("데니스 리치.txt");
		methodType.type10("제임스 고슬링.txt");
		
//		methodType.type10('C'); // 에러 (파라메타의 타입이 일치해야 한다.)
//		methodType.type10(100);
		
//		methodType.type10("파일1.txt", "파일2.txt");	// 에러 (파라메타의 개수가 일치해야 한다.) 
//		methodType.type10("파일1.txt", "파일2.txt" , "파일3.txt");
	
		// 입력데이터는 없고 결과데이터는 있는 경우(01)
		System.out.println("PI : " + methodType.type01());
		double pi = methodType.type01();					
		System.out.println("PI : " + pi);
		System.out.println();

		// 입력데이터도 있고 결과데이터도 있는 경우(11)
		System.out.println("나이 : " + methodType.type11("19700101") + "세" );
		
		int age = methodType.type11("19800101");
		System.out.println("\n나이 : " + age + "세");
		
		if (methodType.type11("19900101") == 34) {
			System.out.println("\n나이 : 34세");
		}
		
	}

}


