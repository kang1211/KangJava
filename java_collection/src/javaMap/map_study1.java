package javaMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class map_study1 {
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<>();
		
		hash.put("김민수", "오늘도 웹툰");
		hash.put("박종권","영상?웹툰?보고있나?");
		hash.put("서종우", "짝궁머해요?");
		hash.put("남기현","언제까지잘거야????????????????앙");
		hash.put("김민수", "쉬었다올게요"); //key 김민수의 value값을 갱신, 덮어쓰기
		
		
		System.out.println(hash);
		
		hash.remove("김민수"); // 키를 통한 값 삭제
		
		hash.replace("서종우", "앙!"); // value 수정
		
		System.out.println(hash.get("박종권")); // 해당 키의 value값 가져오기
		
		Set<String> keys = hash.keySet();// 키 묶음 생성
//		keys.add("강감찬"); 추가 불가능 다른방법을 쓰세요
		System.out.println(keys);
		
		Collection<String> val = hash.values();
		System.out.println(val.size());//배열 크기
//		val.add("아하"); 추가 불가능 다른방법을 쓰세요
		System.out.println(val);
		
		System.out.println(hash.containsKey("김민자")); // key 포함여부 확인 메소드 containsKey
		System.out.println(hash.containsValue("앙!")); // value 포함여부 확인 메소드 containsValue
		
		hash.forEach((key,value) ->{System.out.println(key+"  "+value);}); //key와 value값을 한줄씩 출력하기
		
	}
}

// Map - HashMap : 단일검색, 해시테이블 이라는 배열에 접근하기때문에 검색시간이 일정하다. 순서 없음
//	   - TreeMap : 범위검색, 이진트리 구조를 사용하기 때문에 기본정렬을 유지, 검색시간은 데이터 양에 비례한다.
//	     key:value   ,key는 중복을 허용하지 않는다, value는 중복 가능 중복된다면 나중에 입력된 value가 덮어씌여진다 key는 변동없음
//		 HashMap에서 key는 null을 허용하지만 TreeMap은 허용하지않는다.