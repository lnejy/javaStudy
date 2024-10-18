package application.variable;

/*
 * 변수의 생명주기(Life cycle), 스코프(Scope)
 * 
 */

public class VariableEx05 {
	
	public static void main(String[] args) {
		
		int x = 1;
		
		if(true) {
			int y = 2;
			System.out.println(y);
		}
		
		if (true) {
			int z = 3;
			System.out.println(z);
		}
		
		System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);
		
	}
}
