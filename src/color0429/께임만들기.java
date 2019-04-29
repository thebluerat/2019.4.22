package color0429;

import java.util.Scanner;

public class 께임만들기 {
	public boolean t7(int aX, int aY, int bX,int bY) {
		boolean result = false;
		
		
	
		
		int[][] 맵 = {
				
				{4,4,4,4,4,4,4,4,4,4},
				{4,1,1,1,1,1,4,1,1,4},
				{4,1,1,1,3,1,4,3,1,4},
				{4,1,1,1,0,1,0,1,1,4},
				{4,1,1,0,1,0,0,1,1,4},
				{4,1,3,1,1,0,0,1,1,4},
				{4,1,3,0,1,0,0,1,1,4},
				{4,1,1,1,3,1,1,3,1,4},
				{4,1,1,1,1,1,1,1,1,4},
				{4,4,4,4,4,4,4,4,4,4},

		};
		
		for(int y = 0; y < 맵.length; y++) {
			for(int x = 0; x < 맵[y].length; x++) {
				if(맵[aY][aX] == 0) {
					aY = bY;
					aX = bX;
					result = true;
				}
				
				if (y==aY && x==aX) {
					System.out.print("★\t");
				}else if(맵[y][x] == 3) {
					System.out.print("♥\t");
				}else if(맵[y][x] == 1) {
					System.out.print("○\t");
				}else if(맵[y][x] == 4) {
					System.out.print("♨\t");
				
				}else {
					System.out.print("■\t");
				}
				
			}
			System.out.println();
		}
		
		return result;
		
	}
	
	public void t8() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		t7(aX, aY, bX, bY);
		
		while(true) {
			String input = scan.next();
			switch(input) {
			case "w":
				aY--;
				break;
			case "s":
				aY++;
				break;
			case "a":
				aX--;
				break;
			case "d":
				aX++;
				break;
			default:
				break;
			}
			System.out.println(aY + "," + aX + "," + bY + "," + bX);
			
			if(t7(aX, aY, bX, bY)) {
				aX = bX;
				aY = bY;
			}else {
				bX = aX;
				bY = aY;
			}
		}
	}
	
	public void t9() {
		
		
		
	}
	
	

}
