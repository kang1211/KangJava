package arraylist;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<member> mbr = new ArrayList<>();
		mbr.add(new member("이순신","lee@naver.com","남성",1012345678));
		mbr.add(new member("김유신", "kim@naver.com","남성",1045687896));
		mbr.add(new member("소서노", "ssno@gmail.com", "여성", 1048593256));
		mbr.add(new member("나혜석", "na@gmail.com", "남성", 1025478135));
		mbr.add(new member("정도전", "roadbefore@naver.com","남성",1043330305));
		
		System.out.println(mbr.get(2));
		System.out.println(mbr.size());
		System.out.println(mbr.subList(1, 4));
		
		member tmp = new member("정도전", "roadbefore@naver.com","남성",1043330305);
		
		System.out.println(mbr.indexOf(tmp));
		System.out.println(mbr.contains(tmp));
		// indexOf()
		
		
//		System.out.println(mbr);
	}
}
