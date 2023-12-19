package study121901;

public class homeWork {
	public static void main(String[] args) {
		
		//과제
		String song = "크리스마스에는 많은 것을 원하지 않아요 # 내가 원하는건 딱 하나에요 #"
				+"트리 아래의 선물 간은것도 신경쓰지 않아요 # 당신을 원해요 #"
				+"당신이 생각하는 것보다 더 # 내 소원을 이뤄줘요 #"
				+"내가 크리스마스에 원하는건 당신이에요";
//		System.out.println(song);
		
/* 1. # 기준으로 한줄씩 출력하세요(#은 출력창에 나오면 안되요)
 * 2. 당신이라는 단어 대신 "그대"라고 바꾸어서 출력하세요
 * 3. 크리스마스를 영어로 변경하여 출력하세요(대문자로)
 * 4. 세번째#뒤의 가사가 무엇인지 출력하세요
*/ 
//		1.-------------------------------------------
		String[] temp = song.split("#");
		for(int i=0;i<6;i++) {
		System.out.println(temp[i]);
		}

//		2.-------------------------------------------
		String temp2 = song.replace("당신", "그대");
		System.out.println(temp2);
		
//		3.-------------------------------------------
		String large = song.replace("크리스마스","christmas");
		large = large.toUpperCase();
		System.out.println(large);

//		4.-------------------------------------------
		large = large.split("#")[3];
		System.out.println(large);
		
	}
}
//	깃허브 토큰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