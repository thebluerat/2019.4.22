package color;

import color0423.Var;

public class main {
	public  void main(String[] a) {
		System.out.println("변수 시작!");
		String 문자열 ="Hello World"; //변수 선언과 대입이 동시에 이루어진 것.
		System.out.println(문자열); //변수 사용
		문자열 = "문자열 변경"; //값 변경
        System.out.println(문자열);// 변수 사용
        문자열 = "1234"; //연산
        System.out.println(문자열); //변수 사용
        
        
        int 정수 = 1;
        System.out.println(정수);
        
        
       String 결과값 = 문자열 + 정수 + 정수;
       System.out.println(결과값);
       
       

       
       byte b1 = 10;
       short s1 =20;
       int i1 =100;
       long l1 = 1000;
       i1 = b1; //int(4byte) <=byte(1byte)
       s1 = (short)l1;
       float f = l1;
       
       
       char single = '\'';
       String quote = "hello \"홍길동!\"";
       String root = "c:\\";
       System.out.println(single);
       System.out.println(quote);
       System.out.println(root);
       System.out.println("서울\t대구\t부산");
       System.out.println("안녕하세요\n 이 부분은 다음 줄에");
       System.out.println("\uD64D\uAE38\uB3D9");
       
       
    Var v = new Var();
    int s = v.state1;
    
       
       
       
	}
	

}
