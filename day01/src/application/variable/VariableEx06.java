package application.variable;

/*
 * 
 *  # 상수 ( constant ) 
 * 
 *  - 값이 변하지 않는 데이터
 *  - final 키워드를 사용하여 만든다.
 * 	- 변경되면 안되는 데이터의 보호를 위해 사용한다.
 *  - 특정데이터를 의미있는 문자로 사용하여 인식하기 쉽게 한다. 
 * 
 * 
 * */

public class VariableEx06 {

	public static void main(String[] args) {

		// 변수
		int orderQty = 1;
		orderQty = 3;
		System.out.println(orderQty);
		
		// 상수
		final String DATABASE_SOURCE = "8.8.8.8";
		
		System.out.println(DATABASE_SOURCE);
	}

}
