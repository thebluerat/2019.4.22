package color0424;

import java.util.Scanner;

public class 계산기연습 {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계산 시작");
		System.out.print("첫 번째 값을 입력하세요");
		int a = scan.nextInt();
		System.out.print("연산자를 입력하세요");
		String c = scan.next();
		System.out.print("두 번째 값을 입력하세요");
		int b = scan.nextInt();
		
		계산기 calc = new 계산기();
		
		
		
		String msg = "";
		switch (c) {
		case "+":
			msg = a + "+" + b + "=" + calc.덧셈(a, b);
			break;
		case "-":
			msg = a + "-" + b + "=" + calc.뺄셈(a, b);
			break;	
		case "*":
			msg = a + "*" + b + "=" + calc.곱셈(a, b);
			break;	
		case "/":
			msg = a + "/" + b + "=" + calc.나눗셈(a, b);
			break;	
			default:
				msg = "계산 불가";
				break;
		}
		
		System.out.println(msg);
		
	}

}
