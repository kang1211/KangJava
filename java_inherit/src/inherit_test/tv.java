package inherit_test;

public class tv extends house{

	int ch=10;//채널
	int vol=12;//소리
	
	public tv(){ // 기본 생성자 메서드
		System.out.println("tv 클래스의 생성자입니다.");
		ch=10;
		vol=12;

	}
	public tv(String brand){ // 매개변수가 있는 생성자메서드
		super(brand);
//		super.brand=brand;//super는 부모 class변수 지칭, this는 나의 변수
	}
	
	void channel_up() {
		this.ch++;
	}
	void channel_down() {
		this.ch--;
	}
	
	@Override
	public void power() 
		onoff = !onoff;
		System.out.println("Tv 전원 : "+ onoff);
	}
	
	@Override
	public String toString() {
		return "브랜드 : "+super.brand+" , 전원 : "+super.onoff + " 현재채널:"+ch+" 볼륨:"+vol;
	}
}

