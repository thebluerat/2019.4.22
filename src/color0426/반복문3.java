package color0426;

import java.util.Scanner;

public class 반복문3 {
	
	public void t1() {
		while(true) {
			//true라고 쓰는 순간 무한 루프.
			System.out.println("무한 루프");
		}
	}

	
	public void t2() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("입력");
			String input = scan.next();
			if("exit".equals(input)) {
				break;
			}
			System.out.println("무한 루프");
		}
		System.out.println("while문 종료");
		scan.close();
	}
	public void t3() {
		
	int count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
		}
		System.out.println("count: " + count);
	}

}
