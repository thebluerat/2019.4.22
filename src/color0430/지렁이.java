package color0430;

import java.util.Scanner;

public class 지렁이 {
	
	int[][] map = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,1,0},
			
			
	};
	
	int[] play = {1,1};  // Y축, X축
	int[] 꼬리 = new int[6];
	int count = 0;
	int[] history = {1,1}; //Y축, X축
	int[][] 먹을거 = {
			{2,2}, {2,7}, {4,5}, {6,2}, {6,8}, {8,4}
	};
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		view();
		while(true){
			switch (scan.next().toUpperCase()) { //사용자에게 명령어를 받는다
			case "W": //위쪽 (-1)
				play[0] = play[0] - 1; 
				break;
			case "S": //아래(+1)
				play[0] = play[0] + 1;
				break;
			case "A": //왼(-1)
				play[1] = play[1] - 1;
					break;
			case "D": //오른(+1)
				play[1] = play[1] + 1;
					break;
				
			default:
					break;
			}
			
			//벽 예외 처리
			if(play[0] == 0) {
				play[1] = 1;
				
			}else if(play[1] == 0 ) {
				play[1] = 1;
			}else if(play[1] == 9) {
				play[1] = 8;
			}else if(play[0] == 9&& play[1] == 8) {
				view();
				System.out.println("배 터진 지렁이");
				break; //게임 종료
				
			}else if(play[0] == 9) {
				play[0] = 8;
			}
			
			
			
			//먹을거 예외 처리 : 먹을 게 6개라서 반복문이 필요하다.
			for(int 대상 = 0; 대상< 먹을거.length; 대상++) {
				if(play[0] == 먹을거[대상][0] && play[1] == 먹을거[대상][1]) { //player와 먹을 걸 합친다
					꼬리[count] = 대상+1;//1,2,3,4,5,6
					count++;
					
					
				}
				
			}
			
			if(count>0) {
				//먹을 거의 히스토리 적용
					for(int 대상 = 0; 대상<count; 대상++) {
						int 오리지날대상 = 꼬리[대상] - 1;
						if(대상 == 0) {
						먹을거[오리지날대상][0] = history[0];
						먹을거[오리지날대상][1] = history[1]; 
					}else {
						int 오리지날전대상 = 꼬리[대상-1] - 1;
						먹을거[오리지날대상][0] = 먹을거[오리지날전대상][0];
						먹을거[오리지날대상][1] = 먹을거[오리지날전대상][0];
					}
				}
			}
			
			view();
			history[0] = play[0];
			history[1] = play[1];
		}
		
}
	
	
	public void view() {
		for(int row = 0; row<map.length; row++) {
			for(int col = 0; col<map[row].length; col++) {
			//	System.out.print(map[row][col]);
				boolean check = true;
				if(play[0] == row && play[1] == col) {
					System.out.print(" ㉿ ");
					continue;
				}
				
				for(int 대상 = 0; 대상<먹을거.length; 대상++) {
					for(int i = 0; i<=count; i++) {
					if((대상+1) != 꼬리[i]) {
						if(먹을거[대상][0] == row && 먹을거[대상][1] == col) {
						System.out.print(" ★ ");
						check = false;
						break;
					 }
					}else if((대상+1)==꼬리[i]){
						if(먹을거[대상][0] == row && 먹을거[대상][1] == col) {
						System.out.print(" ㉿ ");
						check = false;
						break;
						}
						}
					 }
				}
				
				if(check) {
				if(map[row][col] == 0) {
					System.out.print(" ■ ");
				}else if(map[row][col] == 1) {
					System.out.print(" □ ");
				}
				}
			}
			System.out.println();
			
		}
		
	}
	
	public void move() {
		
	}
	
	public void sum() {
		
	}

}
