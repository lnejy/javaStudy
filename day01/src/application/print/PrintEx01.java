package application.print; // 1) 패키지 선언문은 '항상' 첫줄에 작성한다.

import java.util.Scanner;

public class PrintEx01 {

	public static void main(String[] args) { //main기능의 {} 안에서 프로그래밍을 한다
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		
		int month = scan.nextInt();
		
		switch(month) {
		
		case 1: System.out.println("겨울"); break;
		case 2: System.out.println("겨울"); break;
		case 3: System.out.println("봄"); break;
		case 4: System.out.println("봄"); break;
		case 5: System.out.println("봄"); break;
		case 6: System.out.println("여름"); break;
		case 7: System.out.println("여름"); break;
		case 8: System.out.println("여름"); break;
		case 9: System.out.println("가을"); break;
		case 10: System.out.println("가을"); break;
		case 11: System.out.println("가을"); break;
		case 12: System.out.println("봄"); break;

		}
		
		scan.close();
	}

}
