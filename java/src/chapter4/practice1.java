package chapter4;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		/*
		 * <미니 계산기 만들기>
		 * - 조건 -
		 * 1. 계산은 덧셈, 뺄셈, 곱셈, 나눗셈 만 잘 동작하면 됨
		 * 2. 숫자 두개 입력받기
		 * 3. 간단한 설명 출력해주기
		 * 4. 코드마다 주석달기
		 * 5. 소수로도 계산이 가능해야 함
		 * 6. 출력형태는 소수점 둘째자리까지
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요: ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("숫자2을 입력하세요: ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.print("계산기호를 입력하세요(+ - * /): ");
		String cal = sc.nextLine();
		
		//System.out.println("숫자1 : " + num1 + " / 숫자2 : " + num2 + " / 기호 : " + cal);
		
		
		if(cal.equals("+")) {
			System.out.printf("계산결과 : %.2f", num1 + num2);
		}else if (cal.equals("-")) {
			System.out.printf("계산결과 : %.2f", num1 - num2);
		}else if (cal.equals("*")) {
			System.out.printf("계산결과 : %.2f", num1 * num2);
		}else if (cal.equals("/")) {
			if(num2 == 0) {
				System.out.println("계산할 수 없습니다.");
			}else {
				System.out.printf("계산결과 : %.2f", num1 / num2);
			}
		}else {
			System.out.println("잘못된 기호입니다.");
		}
		
		
//		switch(cal) {
//		case "+":
//			System.out.printf("계산결과 : %.2f", num1 + num2);
//			break;
//		case "-":
//			System.out.printf("계산결과 : %.2f", num1 - num2);
//			break;
//		case "*":
//			System.out.printf("계산결과 : %.2f", num1 * num2);
//			break;
//		case "/":
//			System.out.printf("계산결과 : %.2f", num1 / num2);
//			break;
//		default:
//			System.out.println("잘못된 기호입니다.");
//				
//		}
			
		
	
		
	}

}
