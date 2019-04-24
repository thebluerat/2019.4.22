package color0424;

public class 조건문 {
	
	/*********************
	 * - if문
	 * if() {} -if문 쓸 때 필수
	 * else {} -if 조건이 아닌 것
	 * else if(조건식이 들어감) {} -두 번째 조건이 필요할 때
	 * 비교자 - 대상 (비교자) 비교대상
	 * == 같다
	 * != 같지 않다
	 * > 크다
	 * < 작다
	 * >= 크거나 같다
	 * <= 작거나 같다
	 * 
	 * -switch문
	 * switch -비교값
	 * case: 비교값과 같으면 실행. 변수를 쓸 수 없다. 각각의 case에 추가하면 된다. break로 묶어주면 됨.
	 ************************/
	public void t1(int a) {
		if(10 == a) {
			System.out.println("같다");
		} else {
			System.out.println("같지 않다");
		}
		
	}
	
	public boolean t2(int a) {
		if(10 == a) {
			return true;
		}else {
			return false;
		}
	}

	public int t3(int a, int b) {
		if(a == b) {
			return 1;
		}else {
			return 0;
		}
	}

	public int t4(int a, int b) {
		if (a>b ) {
			return a;
		}else if(a<b) {
			return b;
		}else {
			return -1;
		}
	}

	public String t5(int a, int b) {
		if(a == b) {
			return "두 개의 값이 같다";
		}else if (a <= b) {
			return "a 변수의 값이 b보다 작거나 같다";
			}else if (a != b) {
			return "두 개의 값이 같지 않다";
		
		
		}else if (a > b) {
			return "a 변수의 값이 크다";
		}else if (a < b) {
			return "b 변수의 값이 크다";
		}else if (a >= b) {
			return "a 변수의 값이 b보다 크거나 같다";
		
			}else  {
			return "두 개의 값을 비교할 수 없다";
		}
	}

	public String t6(int a, int b) {
		if(a == b) {
			return "두 개의 값이 같다";
		}
		if(a != b) {
			return "두 개의 값이 같지 않다";
		}
		if(a<b) {
			return "b 변수의 값이 크다";
		}
		if(a>b) {
			return "a 변수의 값이 크다";
		
		}
		
		
		
		return "두 개의 값을 비교할 수 없다";
	}

	public String t7(int a, int b) {
		String msg = "";
	    if(a == b) {
			msg = "두 개의 값이 같다";
		}
		if(a<b) {
			msg = "b 변수의 값이 크다";
		}
		
		if(a != b) {
			msg = "두 개의 값이 같지 않다";
		}
		
		if(a>b) {
			msg = "a 변수의 값이 크다";
		
		}
		
		return msg;
	}


	public String t8(int a) {
		String msg = "";
		switch (a) {
		case 0:
			msg = "전달 받은 값은 0입니다.";
			break;
			default:
				msg = "전달 받은 값은 case 값에 없습니다.";
				break;
		}
		return msg;
	}
	
	public String t9(int a) {
		String msg = "";
		
		switch (a) {
		case 0:
			msg = msg + "0 비교";
		case 1:
			msg = msg + "1 비교";
		case 2:
			msg = msg + "2 비교 범위의 값입니다.";
			break;
			default:
				msg = "0 ~ 2 범위의 값이 아닙니다.";
				break;
				
		}
		return msg;
	}
	
	public String t10(int score) {
		String grade = "";
		
		switch (score/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
			default:
				grade = "F";
				break;
		}
		
		return grade;
	}
	
}


