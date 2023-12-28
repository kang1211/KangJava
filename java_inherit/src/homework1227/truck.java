package homework1227;

import java.util.Scanner;

public class truck extends Rcgame{
	
	public truck(){
		this.name = "메가트럭";
		this.cc = 12700;
		this.vw = 5500;
		this.color="gray";
		this.maker="현대";
	}

	@Override
	public void select() {
		System.out.println("트럭의 바퀴를 골라주세요. ");
		System.out.println("6호 | 8호 | 10호");
		Scanner 휠  = new Scanner(System.in);
		String ws = 휠.nextLine();
		System.out.println("고르신 차량은 "+name+"입니다.");
		System.out.println("배기량 : "+cc);
		System.out.println("중량 : "+vw+"kg");
		System.out.println("색상 : "+color);
		System.out.println("메이커 : "+maker);
		System.out.println("바퀴 사이즈 : "+ws);
		System.out.println("------------------");
	}
	@Override
	public void speed() {
		if(Drive==170) {
			System.out.println("현재 최고 속도로 주행중입니다. 속도에 주의하세요");
		}else {
		Drive=+10;
		System.out.println("속도 : "+Drive);
		}
	}
	@Override
	public void stop() {
		Drive=0;
		System.out.println("차가 정지하였습니다. 속도가 0이 됩니다.");
	}
	@Override
	public void left() {
		if(Handle==1) {
			System.out.println("더이상 차가 좌측으로 이동할 수 없습니다.");
		}else{
			Handle-=1;
			System.out.println("좌측 이동하여 "+Handle+"차선으로 차선 변경합니다.");
		}
	}
	@Override
	public void right() {
		if(Handle==5) {
			System.out.println("더이상 차가 우측으로 이동할 수 없습니다.");
		}else {
			Handle+=1;
			System.out.println("우측 이동하여 "+Handle+"차선으로 차선 변경합니다.");
		}
	}
	
}