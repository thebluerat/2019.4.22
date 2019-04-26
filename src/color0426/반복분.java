package color0426;

import java.util.Scanner;

public class 반복분 {
	
	public void lv1() {
		/**************************
		 * 1난이도 (한 행에 하나씩)
		 * 1단> 2단 (순차적으로 출력)
		 ****************************/
		for(int y = 1; y<=9; y++) {
			System.out.println(y + " 단");
			for(int x = 1; x <= 9; x++) {
				//1*1=1
				System.out.println(y + " * " + x + " = " +  (y*x));
			}
			System.out.println();
		}
	}
	
	public void lv2() {
		/****************
		 * 2난이도 (한 행에 3단씩)
		 * 1단 2단 3단 >4단 5단 6단 > 7단 8단 9단
		 *******************/
		for(int y = 1; y<=9; y=y+3) {
			System.out.print(y + " 단\t\t");
			System.out.print((y+1) + " 단\t\t");
			System.out.print((y+2) + " 단\t\t");
			System.out.println();
			for(int x = 1; x <= 9; x++) {
				//1*1=1
				System.out.print(y + " * " + x + " = " +  (y*x) + "\t");
				System.out.print((y+1) + " * " + x + " = " +  (y*x)+ "\t");
				System.out.print((y+2) + " * " + x + " = " +  (y*x)+ "\t");
				System.out.println();
			}
			System.out.println();
		}
		}
		
		
		public void lv3() {
			/*****************
			 * 3난이도 (한 행에 147>258>369)
			 * 1단 4단 7단 >2단 5단 8단> 3단 6단 9단
			 ***********************/
			
			for(int y = 1; y<=3; y++) {
				System.out.print(y + " 단\t\t");
				System.out.print((y+3) + " 단\t\t");
				System.out.print((y+6) + " 단\t\t");
				System.out.println();
				for(int x = 1; x <= 9; x++) {
					//1*1=1
					System.out.print(y + " * " + x + " = " +  (y*x) + "\t");
					System.out.print((y+3) + " * " + x + " = " +  (y*3)+ "\t");
					System.out.print((y+6) + " * " + x + " = " +  (y*6)+ "\t");
					System.out.println();
				}
				System.out.println();
			
			}
		
		
	   }
		
		
		public void lv4() {
			Scanner scan = new Scanner(System.in);
			//x축으로 출력할 개수를 입력받는다
			System.out.println("x축으로 출력할 개수를 입력하세요.");
			int x축 = scan.nextInt();
			for(int y = 1; y <= 9; y= y+x축) {
				for(int x = 1; x<=9; x++) {
					for(int 계산 = 0; 계산<x축; 계산++) {
						System.out.print((y+계산) + " * " + x + " = " +  ((y+계산)*x) + "\t");
					}
					System.out.println();
				}
				System.out.println();
				
			}
			scan.close();
			
		}
		
		public void lv5() {
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("x축으로 출력할 개수를 입력하세요.");
			int x축 = scan.nextInt();
			System.out.println("x축으로 출력할 개수를 입력하세요.");
			int Y축 = scan.nextInt();
			for(int y = 1; y <= Y축; y= y+x축) {
				for(int x = 1; x<=9; x++) {
					for(int 계산 = 0; 계산<x축; 계산++) {
						System.out.print((y+계산) + " * " + x + " = " +  ((y+계산)*x) + "\t");
					}
					System.out.println();
				}
				System.out.println();
				
			}
			scan.close();
			
			
			
			
			
			
		}
		
		
		
	

}
