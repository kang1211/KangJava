package homework1227;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		
		Rcgame sedan = new sedan();
		Rcgame suv = new suv();
		Rcgame supercar = new supercar();
		Rcgame truck = new truck();
		
		Scanner in = new Scanner(System.in);
		
		String i = in.nextLine();
		
//		sedan.cc();
//		suv.cc();
//		supercar.cc();
//		truck.cc();
		
		System.out.println(i);
		
//		sedan.vw();
//		suv.vw();
//		supercar.vw();
//		truck.vw();
	}
}
