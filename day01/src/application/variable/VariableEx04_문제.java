package application.variable;

public class VariableEx04_문제 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		double taxRate = 33.0/1000.0;
		int income = 2000000;
		double totalTax = income * taxRate;
		System.out.println(totalTax + "원");
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int sum = 100 + 88 + 92;
		double avg = sum / 3;
		System.out.println(avg + "점");
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int height = 3;
		int bottom = 7;
		double area = height*bottom/2.0;
		System.out.println(area);
		
		//문제4) 100초를 1분 40초로 출력
		int totalSec = 100;
		int min = totalSec / 60;
		int sec = totalSec - (min * 60);
		System.out.println(min + "분 " + sec + "초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int total = 800;
		int coinCount500 = 800 / 500;
		int coinCount100 = (800 - (coinCount500 * 500)) / 100;
		System.out.println("500원 " + coinCount500 + "개, 100원 " + coinCount100 + "개");
		
	}

}
