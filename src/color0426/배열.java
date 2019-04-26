package color0426;

public class 배열 {
	
     public void t1() {
    	 int a;//변수라면 이렇게 선언
    	 int[] aa;//배열 선언'대괄호!'
    	 
    	 
    	 a=1;
    	 
    	
    	 
    	 aa= new int[5];//배열은 공간 확보 필요. 배열 생성 및 크기 설정
    	 aa[0]=1;//하나만넣는게아님.배열 특정 위치에 값 담기
    	 
    	 int[]bb = new int[2];
    	 bb[0]=0;
    	 bb[1] = 1;
    	 System.out.println(a);
    	 System.out.println(aa);
    	 System.out.println(bb);
		 
    	 System.out.println(aa[0]); //배열 특정 위치 값 사용
    	 System.out.println(bb[0]);
    	 System.out.println(bb[1]);
    			 
     }
     
     
     public void t2() {
    	 int[] one단 = new int[9];
    	 one단[0] = (1*1);
    	 one단[0] = (1*2);
    	 
    	 
     }

     
     public void t3() {
    	 int[] arr1;
    	 int arr2[];
    	 arr1 = new int[5];
    	 int[] arr = new int[5];
    	 for(int i = 0; i<arr.length; i++) {
    		 System.out.println("arr[" + i + "]=" + arr[i]);
    	 }
    	 
    	 arr[0] = 10;
    	 arr[1] = 20;
    	 arr[2] = 30;
    	 for(int i = 0; i < arr.length; i++) {
    		 System.out.println("arr[" + i + "] = " + arr[i]);
    	 }
    	 System.out.println("개선된 for 구문 이용 출력");
    	 for(int i:arr) {
    		 System.out.println(i);
    	 }
    			 
    			 
    	 
     }
     
     
     public void t4() {
    	 
    	 String[]요일 = new String[7];
    	 요일[0]="일"; 
    	 요일[1]="월"; 
    	 요일[2]="화"; 
    	 요일[3]="수"; 
    	 요일[4]="목"; 
    	 요일[5]="금"; 
    	 요일[6]="토";
    	 
    	 // 일>화>목>토
    	 for(int a = 0; a<요일.length; a = a+2) {
    		 
    			 System.out.println(요일[a]);
    		
    		 
    	 }
    	 
    	 for(int i = 0; i < 요일.length; i++) {
    		 if(i%2==0) {
    			 System.out.println(요일[i]);
    		 }
    	 }
    		 
    	 
    	 
     }

     
     
     public void t5() {
    	 
    	 int[][] 빙고 = new int[5][5];
    	 빙고 [0][0] = 5;
    	 빙고 [0][1] = 3;
    	 빙고 [1][2] = 1;
    	 
    	 for(int i = 0; i<빙고.length; i++) {
    		 for(int j = 0; j< 빙고[i].length; j++) {
    			 System.out.print(빙고[i][j]);
    			 
    		 }
    		 System.out.println();
    	 }
    	 
     }
     
     public void t6() {
    	 String[][] 요일 = new String[7][5];
    	 //현재 달의 달력 데이터를 요일 배열에 데이터를 담아보세요 무슨 뜻이지?
    	 // 오늘 요일을 출력할 것.
    	 
    	 
    	 
     }



}
