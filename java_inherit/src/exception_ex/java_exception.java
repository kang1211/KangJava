package exception_ex;

import java.io.BufferedReader;
import java.io.FileReader;

public class java_exception {
	
//	static Scanner scan = new Scanner(System.in);
	
//	static String myAge(String birth) throws StringIndexOutOfBoundsException{
//		Date today = new Date();  날짜 다루는 클래스, getXxx() 메서드로 날짜시간가져오기 가능 하지만 구버전
		
//		Calendar today = Calendar.getInstance();
		
//		System.out.println(today.get(Calendar.YEAR)+"년");
//		System.out.println(1+today.get(Calendar.MONTH)+"월");
//		System.out.println(today.get(Calendar.DATE)+"일");
//		
//		System.out.println("올해 주차 : "+today.get(Calendar.WEEK_OF_YEAR));
//		
//		System.out.println("요일(1-일요일)"+today.get(Calendar.DAY_OF_WEEK));
//		
//		today.set(2020, 1,1);
//		System.out.println("이달의 마지막 날 :"+today.getActualMaximum(Calendar.DATE));
		
//		int year = today.get(Calendar.YEAR);
//		String age=null;
		
		// throw - 예외(오류)를 발생시키는 방법
		// throw를 가지고 있는 메서드는 반드시 throws가 있어야 한다.
		// throw를 통해 해당 메서드가 어떤 오류를 안고 있는지 인지시켜줄 수 있고, 예외처리를 강요한다.
		// 예외처리에 대한 관리를 용이하게 해준다.
		
		// throws - 예외를 넘겨주는 방법
		
		
//		if(birth.length() != 8) { //입력한 생년월일이 8자리가 아니라면
//			throw new StringIndexOutOfBoundsException("생년월일은 8자리 입력하세요");
//		}if(!birth.matches("[+-]?\\d*(\\.\\d+)?")) {
//			throw new NumberFormatException("숫자만 입력하세요");
//		}
//		
//		int myYear = Integer.parseInt(birth.substring(0,4));
//		
//		age = (year-myYear)+"세";
//		return age;
		
//		finally { // try구문에서 오류가 발생하거나 발생하지 않아도 무조건 실행되는 구문
//			return "0세";
//		}
		
//		System.out.print(1900+today.getYear()+"년 "); 년도가 1900년도부터 시작한다.
//		System.out.print(1+today.getMonth()+"월 "); 월이 1월부터 시작한다.
//		System.out.println(today.getDate()+"일");
		
		
//	}
	
	public static void main(String[] args) {
		
		// 자동 자원 반환 예외처리 - 파일열기와 같은 외부 파일(데이터)를 사용하게되는경우
		//					   사용한 메모리와 cpu 등등을 close를 통해 반환해야한다.
		//					   자동자원반환 예외처리는 코드의 복잡성을 줄여준 예외처리이다.
		//	try( 파일열기 ){
		//	}catch(예외클래스){
		//	}
		
//		BufferedReader bf=null;
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt")))
		{
			
			while(true) {
				String line = bf.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			
		}catch(Exception e) {
			System.out.println("파일 로드 및 반환 실패");
		}
//		try {
//			bf = new BufferedReader(new FileReader("c:/test/book.txt"));
//		
//			System.out.println(bf.readLine());
//			System.out.println(bf.readLine());
//			
//		}catch(Exception e){
//			System.out.println("파일읽기 실패");
//		}finally {
//			try {
//				bf.close();
//			}catch(Exception a) {
//				System.out.println("파일닫기 실패");	
//			}
//		}
//		String birth=null;
//		
//		System.out.print("생년월일 : ");
//		birth = scan.nextLine();
//		
//		try {
//			String age = myAge(birth);
//			System.out.println(age);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		
//		String name = null;// String의 변수 첫 빈값은 null을 넣는다.
//		int score=0;// int의 변수 첫 빈값은 0을 넣는다.
//		int[] num = {};
//		try {
//			score=scan.nextInt();
//			
//			System.out.println("이름 : "+name.concat("님"));
//			System.out.println(score/num.length);
//		}catch(java.lang.NullPointerException n) {
//			System.out.println("이름을 입력하세요");
//			
//		}catch(java.lang.ArithmeticException a) {
//			System.out.println("성적을 입력하세요");
//		}catch(Exception e) {
//			e.printStackTrace();// 오류 내용 확인
//		}
//		
//		 System.out.print("정상 실행");
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
//			e.printStackTrace(); // 오류 내용 확인
//			System.out.println("0으로 나누기 할 수 없습니다.");
//		}
//			System.out.println("프로그램 종료");
	}
}
