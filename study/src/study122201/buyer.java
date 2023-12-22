package study122201;

import java.text.DecimalFormat;

public class buyer {
	int member_num; //회원번호
	String member_name; //회원 이름
	int expend; //지불금액
	mart[] basket; //장바구니

	buyer(){}
	buyer(int num,String name){
		this.member_name=name;
		this.member_num=num;
	}
	
	@Override
	public String toString() {
		String out ="회원번호 : "+member_num+"  회원명 : "+member_name+"\n"+"장바구니 목록 \n";
		
		for(int i=0;i<basket.length;i++) {
			out += (i+1)+". "+basket[i]+"\n";
		}
		out +="총 결제 금액 : " + total_price();
		return out;
	}
	
	String total_price() {
		//장바구니에 담겨있는 물건의 총금액 구하고 천단위 콤마로 변환하여 return 하세요
		int total = 0;
		for(int i =0;i<basket.length;i++) {
			total += basket[i].price;
		}
		
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(total)+"원";
	};
}
