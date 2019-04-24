package color0424;

public class Main {

	//1. 생성자 - {}가 있음
	//생성자 안에 생성자 생성은 하지 않는다
	//생성자 안에 메소드 생성도 하지 않는다.
	//2. 변수, 상수 - 클래스 안의 전역.
	//3. 메소드 - {}가 있음. 메소드 안의 변수 - 메소드 전역. 메소드 밖에서는 안 됨 -지역이란?
	//메소드 안에 메소드 생성은 하지 않는다
	//메소드 안에 생성자도 생성하지 않는다.
	//4. static(정적) : 만들지 않는다. 단, main 메소드에만 static을 사용한다. ) 계산기 c = new 계산기(); System.out.println(c.덧셈(5, 3));
	//5. 재사용성 - 가능하면 기능을 구현하는 클래스를 따로 둔다
	
	public void main(String[] ag) {
		계산기 calc = new 계산기();
		int a = 2;
		int b = 4;
		int c;
		float d;
		calc.테스트(a, b);
		c = calc.덧셈(a, b);
		c = calc.뺄셈(a, b);
		d = calc.나눗셈(a, b);
		d = calc.곱셈(a, b);
		
		
		
		
		
		
		
	}
	

}
