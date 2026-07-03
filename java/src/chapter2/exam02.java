package chapter2;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) throws Exception {
	   /** 기본타입-정수형
		 * byte : 1byte -> 256가지 > -128~127
		 * short : 2byte -> 65536가지 > -32768~32767
		 * int : 4byte -> 2의32제곱
		 * long : 8byte -> 2의64제곱 (int범위를 벗어나는숫자를 벗어날때 L 표시)
		 * 
		 * char(문자형) : 2byte(유니코드) -> 65536가지 > 0~65535
		 * 
		 * 기본타입 - 실수형
		 * float : 4byte (소수점 사용시 f 표시)
		 * double : 8byte
		 * 
		 * 클래스타입(기본타입x)
		 * String : 문자열 (크기x)
		 * 
		 * 논리형
		 * boolean : 2가지 종류의 값(true / false)
		 */
		 int a = 3, b = 5;
		 boolean result = a < b;
		 //System.out.println(result);
		 
		 // 타입변환
		 int num1;
		 short num2 = 10;
		 
		 //자동형변환 (작은타입 > 큰타입 대입)
		 num1 = num2;
		 //System.out.println(num1);

		 num1 = 50;
		 //강제형변환 (큰타입 > 작은타입 대입)
		 num2 = (short)num1;
		 
		 // 작은타입 ----------------------------------- 큰타입
		 // byte < short(char) < int < long < float < double
		 
		 char ch = 'A';
		 int num3 = ch;
		 
		 //System.out.println("num3 : " + num3);
		 
		 byte bt1 = 10, bt2 = 20;
		 //System.out.println("bt1 : " + bt1 + " / bt2 : " + bt2);
		 
		 byte btsum = (byte)(bt1 + bt2);
		 //System.out.println(btsum);
		 
		 //100p 예제 생각더하기
		 byte value1 = 10;
		 int value2 = 100;
		 long value3 = 1000L;
		 
		 long sum = value1 + value2 + value3;
		 System.out.println(sum);
		 
		 
		 System.out.println("result : " + value1 + value2 + value3);
		 System.out.println("result : " + (value1 + value2 + value3));
		 System.out.printf("result : %d\n", value1 + value2 + value3);
		 
		 System.out.println(Integer.parseInt("1") + 5);
		 
		 // print
		 // println > ln > line(한줄)
		 // printf > f > format(형식)
		 //  -> 형식지정자?? %d(정수) %f(실수) %s(문자열) %c(문자) ...
		 
		 System.out.printf("printf result : %d + %d + %d = %d\n", value1, value2, value3, value1 + value2 + value3);
		 
		 String st1 = "My name is";
		 String name = "Jihyeon";
		 String st2 = "and I'm";
		 int age = 20;
		 String st3 = "years old.";
		 
		 //My name is OOO and I'm 00 years old.
		 System.out.printf("%s %s %s %d %s\n", st1, name, st2, age, st3);
		 
		 
		 int year = 2026;
		 int month = 6;
		 int day = 29;
		 
		 //_ _ _ _ _ _ _ 1 2 3 
		 System.out.printf("%10d\n", 123);
		 System.out.printf("%10d\n", 12345);
		 System.out.printf("%10d\n", 1234567);
		 System.out.printf("%10d\n", 1234);
		 System.out.printf("%10d\n", 123456);
		 
//		 int keyCode = System.in.read();
//		 System.out.println("keyCode : " + keyCode);
//		 System.out.printf("keyCode : %c\n", keyCode);
		 // 한글은 인식을 못함 ??? 
		 
		 Scanner scanner = new Scanner(System.in);
		 String inputName = scanner.nextLine();
		 System.out.println(inputName);
		 
		 
	}

}
