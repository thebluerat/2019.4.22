package color0423;

public class B2 {
	//생성자
	public B2 (String msg) {
		//5
		System.out.println("A2 class : " + msg);//6
		new A2("그려!");//7
	}

	// class 전역 변수
	int a;
	
	// 메소드
	public void b() {
		// 메소드 지역 변수
		int c = 1;
		
		a = c;
	}
	
}
