package study122102;

public class music {
	
	static int count=0; //클래스 변수, 면시적초기화로 0 저장
	
	String singer; //가수
	String title; // 제목
	int playing_time; //재생시간
	int a;
	music(){} // 기본 생성자 메서드
	
	music(String 가수, String 제목){//매개변수가 있는 생성자 메서드
		this.singer=가수;
		this.title=제목;
	}
	music(String singer,String title, int time){//매개변수가 있는 생성자 메서드
		this(singer, title);
		this.playing_time=time;
	}
	
	@Override
	public String toString() {
		return "가수 : "+singer+" - "+title+"("+transform()+")";
	}
	
	String transform() {
		int min = playing_time/100; //Integer.toString(playing_time).charAt(0);//.substring(0,1);
		int sec = playing_time%100;
		
		return min+":"+sec;
	}
}