package homework1227;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		
		Rcgame sedan = new sedan();
		Rcgame suv = new suv();
		Rcgame supercar = new supercar();
		Rcgame truck = new truck();
		Rcgame myCar=new control();
		
		
		boolean a = true;
		System.out.println("1. 아반떼, 2. 쏘렌토 , 3. 페라리488, 4. 메가트럭");
		System.out.println("플레이 하고 싶으신 차량 번호를 입력해주세요.");
		
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		
		if(i==1) {
			sedan.select();
		}else if(i==2) {
			suv.select();
		}else if(i==3) {
			supercar.select();
		}else if(i==4) {
			truck.select();
		}else
			System.out.println("다시 입력하세요");	
		
		System.out.println("3차선으로 차량 운행을 시작합니다.");
		System.out.println("드라이브 : 1 | 브레이크 : 2");
		System.out.println("좌회전 : 3 | 우회전 : 4");
		

		
		while(true) {
			Scanner start = new Scanner(System.in);
			int me = start.nextInt();
			
			if(me==1) {
				myCar.speed();
			}else if(me==2) {
				myCar.stop();
			}else if(me==3) {
				myCar.left();
			}else if(me==4) {
				myCar.right();
			}
		}
	}
}