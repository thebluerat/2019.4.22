package color0424;

import java.util.Scanner;

public class 공부2 {

	public static void main(String[] args) {

		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = null;
		if(score>=90) {
			if(score>=95) grade = "A+";
			else grade = "A0";
			}
		
		
		
		System.out.println(grade + " 학점입니다");
		}
		
		
	}


