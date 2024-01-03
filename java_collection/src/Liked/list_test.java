package Liked;

public class list_test {
	
	public static void main(String[] args) {
		
		linkedList list = new linkedList();
		
		list.add("이순신");
		list.add("김유신");
		list.add("장영실");
		list.add("이성계");
		list.add("문익점");
		
//		System.out.println(list);// 일반 리스트 출력
		
//		System.out.println(list.get(2));// 장영실 가져오기
		
		list.remove(4);// 중간목록 삭제 코드(0번 인덱스 4번인덱스 삭제 불가)
		System.out.println(list);// 중간목록 삭제 코드(0번 인덱스 4번인덱스 삭제 불가)
		
		list.add(3,"강감찬");
		System.out.println(list);
		
		
	}
}
