package cafe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import customer.member;

public class Order_Counter {
	static Scanner scan = new Scanner(System.in);
	static HashMap<String, menu> Menu = null;
	static List<member> buyer = null;
	
	static member user=null; //로그인 성공한 회원 객체 저장 참조변수
	
	public static void main(String[] args) {
		Menu = file.menu_load();
		buyer = file.member_load();
		
		// 스토리 - 회원이 로그인하여 주문(모바일또는PC) 한다.
		// 로그인부터 주문과정까지를 제작
		
		user = login();
		// 주문
	}
	
	
	public static HashMap<Category,Set> classTask(){
		
		Set<menu> 커피 = new HashSet<>();
		Set<menu> 음료 = new HashSet<>();
		Set<menu> 빽스치노 = new HashSet<>();
		
		return null;
	}
	
	public static member login() {
		System.out.println("\n===========로그인==========");
		System.out.println("아이디 : ");
		String id = scan.nextLine();
		System.out.println("비밀번호 : ");
		String pw =scan.nextLine();
		
		member temp = new member(id,pw);
		int idx=0;
		
		if((idx = buyer.indexOf(temp)) != -1){// 아이디와 비밀번호가 일치하면
			System.out.println("로그인 성공");
			return buyer.get(idx);
		}
			//아이디 또는 비밀번호가 맞지않으면
			System.out.println("로그인 실패");
			return login();
		
		
		// ArrayList에 저장되어있는 객체들과 비교를 하기위해서는 
		// 반복문을 통해 객체 하나씩 가여와서 값 비교를 해준다.
		// 또는 ArrayList에 저장된 객체의 클래스에 비교하기위한 관련 메서드를 구현한다.
	}

}