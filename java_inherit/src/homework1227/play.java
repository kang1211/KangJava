package homework1227;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		
		Rcgame sedan = new sedan();
		Rcgame suv = new suv();
		Rcgame supercar = new supercar();
		Rcgame truck = new truck();
		
		boolean a = true;
		System.out.println("1. 아반떼, 2. 쏘렌토 , 3. 페라리488, 4. 메가트럭");
		System.out.println("플레이 하고 싶으신 차량 번호를 입력해주세요.");
		
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		
		while(a= true) {
		
		if(i==1) {
			sedan.select();
			break;
		}else if(i==2) {
			suv.select();
			System.out.println("에스유비");
			break;
		}else if(i==3) {
			supercar.select();
			System.out.println("슈퍼카");
			break;
		}else if(i==4) {
			truck.select();
			System.out.println("트럭");
			break;
		}else
			System.out.println("다시 입력하세요");
			continue;
		}
		

		

	}
}
