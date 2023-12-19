package study121801;

import java.util.Arrays;

public class homeWork1218 {
	public static void main(String[] args) {
		/*
		 * int[] score = {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}; int avg =
		 * (30+4+50+60+14+80+45+72+94+25)/10; String[] rating = new String[10]; int k=0;
		 * System.out.print("문자 배열함수 : "); for(int i=0;i<score.length;i++) {
		 * if(score[i]<=avg) { rating[k] = "F"; k++; }else{ rating[k] = "A"; k++; }
		 * System.out.print(rating[i]); }
		 */
		int[] score= {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		
		int total=0;
		for(int i=0;i<score.length;i++) {
			total += score[i];
		}
		int avg = total/score.length;
		char[] grade=new char[10];
		for(int i=0; i<score.length;i++) {
			if(score[i]<=avg)
				grade[i]='F'; // 문자는 작은따옴표''에 담아주고 문자열은 큰 따옴표""에 담아준다
			else
				grade[i]='A';
		}
		System.out.print(Arrays.toString(grade));
	}
}
