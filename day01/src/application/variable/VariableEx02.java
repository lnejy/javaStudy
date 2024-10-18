package application.variable;

/*
  
  
   # 데이터 타입 (Data Type)
   
    1. 기본 데이터 타입 (Primitive Data Types)
	
		- 기본 데이터 타입은 자바에서 기본적으로 제공되는 데이터 타입으로, 값을 저장하는 데 사용된다. 기본 데이터 타입에는 다음과 같은 종류가 있다
	
		1-1) 정수 타입
			byte  : 8비트 정수 ([-128, 127])
			short : 16비트 정수 ([-32,768, 32,767])
			int   : 32비트 정수 ([-2^31, 2^31 - 1])
			long   : 64비트 정수 ([-2^63, 2^63 - 1])
		
		1-2) 부동 소수점 타입
			float  : 32비트 IEEE 754 단정밀도 부동 소수점
			double : 64비트 IEEE 754 배정밀도 부동 소수점 (일반적으로 더 많이 사용됨)
		
		1-3) 문자 타입
			char : 16비트 유니코드 문자 (0부터 65,535까지)
		
		1-4) 논리 타입
			boolean : 참(true) 또는 거짓(false) 값만을 가짐
	
	
	2. 참조 데이터 타입 (Reference Data Types)
	
		- 참조 데이터 타입은 객체를 가리키는 변수 타입으로 객체의 메모리 주소를 저장한다. 여기에는 다음과 같은 종류가 있다.
	
		2-1) 클래스 타입 (Class Types)
		사용자가 정의한 클래스
		
		2-2) 인터페이스 타입 (Interface Types)
		인터페이스를 구현한 클래스
		
		2-3) 배열 타입 (Array Types)
		배열을 가리키는 참조
		
		2-4) 기타 참조 타입 (Other Reference Types)
		null을 가질 수 있는 모든 참조 타입
		
		
	[ 주의사항 ] 
	 - 기본 데이터 타입은 데이터 자체를 저장하지만 참조 데이터 타입은 객체에 대한 참조를 저장한다.
	 - 기본 데이터 타입은 스택 메모리에 저장되고 참조 데이터 타입은 힙 메모리에 저장된다.
	 - 자바의 모든 클래스는 Object 클래스를 상속받기 때문에 모든 객체는 기본적으로 Object 타입의 참조를 가질 수 있다.
   
 */


public class VariableEx02 {

	public static void main(String[] args) {
	
		// 1. 원시 데이터 타입
		
		// 1) 정수
		int var1=100;
		long var2=100l; //접미사 l을 붙여서 사용 가능
	
		// 2) 실수
		float var3=1.1f; //접미사 f를 붙여서 사용
		double var4=1.1;
		
		// 3) 문자 
		char var5='A';
	
		// 4) 논리
		boolean var6=true;
		
		// 2. 참조 데이터 타입
		
		// 1) 객체
		Object var7=null;
		
		// 2) 배열
		int[] var8=null;
		
		// 3) 글자
		String var9=null;
		
	}

}
