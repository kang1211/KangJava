package study121801;

public class homeWork1218 {
	public static void main(String[] args) {
		int[] score = {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		int avg = (30+4+50+60+14+80+45+72+94+25)/10;
		String[] rating = new String[10];
		int k=0;
		
		for(int i=0;i<score.length;i++) {
			if(score[i]<=avg) {
				rating[k] = "F";
				k++;
			}else{
				rating[k] = "A";
				k++;
			}
			System.out.print(rating[i]);	
		}
	}
}
