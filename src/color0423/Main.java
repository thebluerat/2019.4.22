package color0423;

public class Main {

	public static void main(String[] args) {
		System.out.println("변수 연습");
		/************************************
		 *  1.변수
		 *  2.메소드 (method)
		 *  3.출력
		 *  4.연산 (사칙연산)
		 *  5.접근제한자
		 *  6.정적 (static)
		 *  7.리턴타입(void)
		 *  8.자료형
		 *  9.매개변수(메소드 호출 시 같이 보낼 값. 스트링 어쩌고)
		  ***********************************/
		
		/*********************
		 * 변수 사용법
		 * 1. 변수 선언이 있어야 한다
		 * 2. 변수에 데이터 대입이 이루어져야 한다 (값 담기)
		 * 3. 변수 사용
		 *************************/
		int a; //1
		a = 1; //2 1번과 2번은 같이 쓸 수 있다
		System.out.println(a); //3
		
		int b = 2; //1, 2
		System.out.println(b); //3
		
		int c, d, e; //1 자료형이 동일하면 변수를 한 번에 선언할 수 있다
		c = a; //2 대입은 개별로. a와 c는 같은 주소값을 갖는다.
		d = b; //2
		e = c + d; //2
		System.out.println(e); //3
		
		
		int f;
		f = 5;
		System.out.println(f);
		
		
	
		
		
		
		
	}
	

}
