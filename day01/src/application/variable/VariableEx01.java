package application.variable;

/*

	# 변수 ( variable )
	
	- 변수(Variable)는 데이터를 저장하는 공간이며, 프로그램 실행 중에 값이 변경될 수 있는 메모리 위치를 가리킨다. 
	- 변수는 데이터를 보관하고, 처리하고, 조작하는 데 사용된다.
	- 변수를 사용하여 프로그램에서 데이터를 저장하고 관리할 수 있다.

	   	1) 변수의 선언 그리고 초기화
	   	
		   	변수의 선언 	: int nData;	// 메모리 공간 할당
		   	변수의 초기화	: nData = 0;    // 값 저장
	   
	   	
	   	2) 변수의 선언과 동시에 초기화
	   	
	   		int nData = 0;
	   	
	   
	   	3) 변수의 특징
	   	
		3-1) 타입 안정성(Type Safety): 자바는 정적 타입 언어로, 변수의 타입이 한 번 선언되면 해당 타입에 맞는 값만 저장할 수 있다.
		3-2) 스코프(Scope): 변수는 선언된 위치에서만 접근할 수 있다. 이를 변수의 스코프라고 한다.
		3-3) 메모리 할당: 변수는 스택 메모리에 저장된다. 기본 데이터 타입은 실제 값을 저장하고, 참조 데이터 타입은 객체에 대한 참조를 저장한다.
		3-4) 재할당 가능: 변수는 값의 변경이 가능하다. 한 번 선언된 변수는 다른 값으로 여러 번 재할당할 수 있다.

*/


public class VariableEx01 {

	public static void main(String[] args) {
		
		int memberAge;
		memberAge=22;
		System.out.println(memberAge);
		
		double memberWeight=73.5;
		System.out.println(memberWeight);
		
		char memberGenderEng='m';
		char memberGenderKor='남';
		System.out.println(memberGenderEng);
		System.out.println(memberGenderKor);
		
		String memberName="원재연";
		System.out.println(memberName);
		
		boolean isFirst=true;
		System.out.println(isFirst);
		
		System.out.println();
		
		//변수의 특징 > 고유성
		int productPrice=18000;
		// int productPrice=19000; > 같은 이름의 변수 생성 불가
		
		productPrice=19000; //재할당
		productPrice=20000; //재할당
		
		System.out.println(productPrice);
		
		//변수의 초기값 / 초기화
		int deliveryPrice=0; //initialize
		System.out.println(deliveryPrice);
		
		double rate=0.0;
		char agreeYn=0;
		boolean isChecked=false;
		String account=null; 
		
		
	}

}
