package color0425; 

import java.util.Scanner;

public class Test {
	public Test() {
		System.out.println("평가를 시작하겠습니다.");
		평가(); //평가 첫 번째 실행
	}
	
	Scanner scan = new Scanner(System.in);
	int num = 1;
	int input = 0;
	String score = "";
	
	public void 평가 () {
		

		System.out.println(num + "번 학생의 시험 점수를 입력하세요");
		input = scan.nextInt();
		if(input == 100 || input >=90) {
			score = "A";
		}else if(input == 89 || input >= 80) {
			score = "B";
		}else if (input == 79 || input >= 70) {
			score = "C";
		}else if (input == 69 || input >=60) {
			score = "D";
		}else {
			score = "F";
		}
		System.out.println(num + "번 학생의 시험 결과는" + score + "입니다.");
		num++;
		
		if(num > 10) {
			System.out.println("평가가 종료되었습니다.");
			return;
		}else {
			//다음 평가 시작
			평가();
			
		}
		
		
		
		
	}
	
	
	
	
}
