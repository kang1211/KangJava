package homework1227;

import java.util.Scanner;

public class supercar extends Rcgame{
	
	public supercar(){
		this.name = "페라리488";
		this.cc = 5999;
		this.vw = 1585;
		this.color="yellow";
		this.maker="페라리";	
	}

	@Override
	public void select() {
		System.out.println("차량의 엔진의 성능을 1, 2, 3 중에 골라 숫자로 입력하세요 ");
//		System.out.println("엔진1 : 속력20");
//		System.out.println("엔진2 : 속력30");
//		System.out.println("엔진3 : 속력40");
		
		Scanner 엔진  = new Scanner(System.in);
		int engine = 엔진.nextInt();
		System.out.println("고르신 차량은 "+name+"입니다.");
		System.out.println("배기량 : "+cc);
		System.out.println("중량 : "+vw+"kg");
		System.out.println("색상 : "+color);
		System.out.println("메이커 : "+maker);
		System.out.println("엔진 : "+engine);
		System.out.println("------------------");
	}
	@Override
	public void speed() {

		if(Drive==280) {
			System.out.println("현재 최고 속도로 주행중입니다. 속도에 주의하세요");
		}else {
			Drive=+20;
			System.out.println("속도 : "+Drive);
			}
//			if(engine==1) {
//				Drive=+20;
//				System.out.println("속도 : "+Drive);
//			}else if(engine==2){
//				Drive=+30;
//				System.out.println("속도 : "+Drive);
//			}else if(engine==3){
//				Drive=+40;
//				System.out.println("속도 : "+Drive);
//			}
		
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