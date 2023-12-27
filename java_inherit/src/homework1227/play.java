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
		
		Rcgame car = new Rcgame(i);
		car.Select();
		
//		sedan.cc();
//		suv.cc();
//		supercar.cc();
//		truck.cc();
		
		
//		sedan.vw();
//		suv.vw();
//		supercar.vw();
//		truck.vw();
	}
}
