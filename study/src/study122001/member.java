package study122001;

public class member {
	static String company; // 클래스 변수
	
	int num; // 인스턴스 변수
	String name; // 인스턴스 변수
	int age; //인스턴스 변수
	
	static{ //클래스 초기화 블럭 - 프로그램실행 될때
		company="LG";
		//num=10; // 클래스 초기화 블럭에서는 인스턴스변수 초기화 불가능
	}
	
	{ // 인스턴스 초기화 블럭, 중괄호 - 객체 생성시 실행
		company="삼성"; // 인스턴스 초기ㅗ하 블럭에서 클래스변수 초기화 가능
		num=50;
		name="김유신";
	}
	
	member(){// 생성자 메서드 - 생성자메서드는 return이 없다.
		// new member() -> 생성자 메서드 실행
		num=11;
		name="장보고";
		age=34;
	}
	
	public String toString() {
		return "번호 : " + num+" 이름 : "+name+" 나이 : "+age;
	}
	public static void main(String[] args) {
		member m = new member();
		System.out.println(m.toString());
	}
}

// 인스턴스 변수와 클래스 변수의 초기화
// 자바에서 class 내부의 변수들 초기화 방법
// 명시적 초기화, 초기화블로, 생성자메서드
// 명시적 초기화 - 변수 선언과 동시에 데이터 저장
// 초기화 블럭 - 인스턴스초기화 블럭:{ }
// 			- 클래스 초기화 블럭 : static{ }

// 초기화 진행순서
// 명시적초기화 -> 초기화 블럭 -> 생성자메서드





// 지역변수 : 생성 - 메서드나 제어문이 시작할대 생성
//		   소멸 - 메서드나 제어문이 종료되면 소멸
// 인스턴스 변수 : 생성 - 클래스의 객체생성시 생성(클래스정의만으로는 생성 안됨)
// (인스턴스메서드) 소멸 - 객체가 소멸되면 소멸(객체는 운영체제나 jvm에 의해 정리될때 소멸)
// 클래스 변수 : 생성 - 프로그램이 실행되면서 클래스 정의 부분을 jvm이 로드 할때 생성
// (클래스메서드) 소멸 - 프로그램 종료