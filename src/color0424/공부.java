package color0424;

import java.util.Scanner;

public class 공부 {

	public static void main(String[] args) {
		
		
		System.out.println("점수를 입력하씨오!");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if (score>100) {
			System.out.println("장난하지 마세요");
		}
	    else if(score>=90) {
			System.out.println("A학점입니다");
		}
		else if(score>=80) {
			System.out.println("B학점입니다");
		}
		else if(score>=70) {
			System.out.println("C학점입니다");
		}
		else if(score>=60) {
			System.out.println("저런... D학점입니다");
		}
		else {
			System.out.println("F");
		}
		
		
		
	}
	
	

}
