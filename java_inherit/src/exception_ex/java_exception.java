package exception_ex;

import java.util.Scanner;

public class java_exception {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = null;// String의 변수 첫 빈값은 null을 넣는다.
		int score=0;// int의 변수 첫 빈값은 0을 넣는다.
		int[] num = {};
		try {
			score=scan.nextInt();
			
			System.out.println("이름 : "+name.concat("님"));
			System.out.println(score/num.length);
		}catch(java.lang.NullPointerException n) {
			System.out.println("이름을 입력하세요");
			
		}catch(java.lang.ArithmeticException a) {
			System.out.println("성적을 입력하세요");
		}
		
//		try {
//		String name = scan.nextLine();
//		System.out.println(name.charAt(0));
//		}catch(Exception e) {// Exception만 적어도 되네? 모든 예외 코드중 가장 최상위 코드
//			System.out.println("이름을 입력하세요");
//		}
		
//		try {
//		
//			int num = 10;
//		
//			System.out.println(num/0);
//		
//			System.out.println(" 아무 문제 없다");
//		
//		}catch( java.lang.ArithmeticException e ) {// try{} catch(오류내용 변수e){} 를 통해 오류가 생긴다면 실행 없이 넘길 수 있다.
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("0으로 나누기 할 수 없습니다.");
//		}
//			System.out.println("프로그램 종료");
// 업뎃없뎃
	}
}
