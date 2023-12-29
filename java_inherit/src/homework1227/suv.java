package homework1227;

import java.util.Scanner;

public class suv extends Rcgame {
	
	public suv(){
		this.name = "쏘렌토";
		this.cc = 1998;
		this.vw = 1755;
		this.color="blue";
		this.maker="기아";
	}
	
	@Override
	public void select() {
		System.out.println("차량의 구동을 2륜과 4륜중 골라 입력해주세요. ");
		Scanner 구동  = new Scanner(System.in);
		String wd = 구동.nextLine();
		System.out.println("고르신 차량은 "+name+"입니다.");
		System.out.println("배기량 : "+cc);
		System.out.println("중량 : "+vw+"kg");
		System.out.println("색상 : "+color);
		System.out.println("메이커 : "+maker);
		System.out.println("구동방식 : "+wd);
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