package study122102;

import java.util.Scanner;

public class java_method {
	
	static void list_print(music[] mylist) {
		for(music obj : mylist) {
			System.out.println(obj);
		}
	}
	
	static void song_search(String keyword, music[] mylist) {// 가수 또는 노래제목으로 검색
		
		boolean issong = false;
		
		for(music obj : mylist)//		for(int i=0;i<mylist.length;i++)	
			{
			if(obj.singer.equals(keyword) || obj.title.equals(keyword)){
				System.out.println(obj);
				issong=true;
//			if(mylist.singer.equals(keyword) || mylist.title.equals(keyword)){
//				System.out.println(mylist);
//				issong=true;
			}
			}
		if(!issong)
			System.out.println("검색결과없음");
}
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		music[] mylist = new music[] {
		new music("이무진","Episode",341),
		new music("버즈","가시",402),
		new music("임재범","고해",502),
		new music("아이유","블루밍",342),
		new music("악뮤","후라이의꿈",327),
		new music("창모","메테오",333),
		new music("김태우","사랑비",400),
		new music("김건모","서울의달",345),
		new music("비와이","가라사대",318),
		new music("노라조","형",413)
		};
		
		list_print(mylist);
		
		System.out.print("조회할 가수 또는 노래명 입력");
		String keyword = scan.nextLine();
		
		song_search(keyword,mylist);
	}
}
