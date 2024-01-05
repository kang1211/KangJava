package javaMap;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TreeMap;

public class map_study2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tree = new TreeMap<>();
		
		tree.put(101, "서울특별시");
		tree.put(204, "인천광역시");
		tree.put(406, "대전광역시");
		tree.put(201, "광주광역시");
		tree.put(701, "대구광역시");
		tree.put(702, "울산광역시");
		tree.put(703, "부산광역시");
		
		System.out.println(tree);//TreeSet이나 TreeMap은 기본적으로 내림차순 정렬이 되어있다.
		
//검색-----------------------------------------------------------------------------------
		System.out.println(tree.ceilingEntry(500));//ceilingEntry(key)
		// 지정한 키값과 같거나 가장 가까운 큰 값 키, value 반환
		System.out.println(tree.ceilingKey(701));//ceilingEntry(key)
		// 지정한 키값과 같거나 가장 가까운 큰 값 키 반환
		
		System.out.println(tree.floorEntry(204));//floorEntry(key)
		// 지정한 키값과 같거나 가장 가까운 작은값 키, value 반환
		System.out.println(tree.floorKey(300));//ceilingEntry(key)
		// 지정한 키값과 같거나 가장 가까운 큰 값 키 반환
		
		System.out.println(tree.higherEntry(701));//highterEntry(key)
		// 지정한 키값과 가장 가까운 큰 값 키, value 반환
		// higherKey() - 키만 반환
		// lowerEntrey() - 가장 가까운 작은 값 키, value 반환
		// lowerKey() - 키만 반환
		
		System.out.println(tree.firstEntry());
		// 현재 맵에서 가장 작은 키 값, value 반환
		// firstKey() - 키만 반환
		System.out.println(tree.lastEntry());
		// firstEntry()반대, lastKey() - 키만 반환
		
		System.out.println(tree.pollLastEntry());
		// 현재 맵에서 가장 큰 키값, value를 반환하고 맵에서 삭제
		System.out.println(tree.pollFirstEntry());
		// 현재 맵에서 가장 작은 키값, value를 반환하고 맵에서 삭제
		
		System.out.println(tree.headMap(406));//headMap(key)
		// 지정한 키값보다 작은 키값들, value들 반환
		System.out.println(tree.headMap(406,true));//headMap(key,true)
		// 지정한 키값과 같거나 보다 작은 키값들, value들 반환 *뒤에 작성을 안하면 기본은 false로 되어있다.
		// 반대는 tailMap()
		
		System.out.println(tree.subMap(200, 600));//subMap(a,A)
		// 지정한 키 사이값들, value들 반환
		
			Properties prop = new Properties();//문자열만 사용 가능, 컬렉션 이전에 있었던
			prop.put("월요일", "한주가 시작한다...");// 숫자도 문자열로 인식
			prop.put("금요일", "와 내일부터... 쉬는날이 아니네");
			prop.put("수요일", "수요일마다 야외수업?");
			prop.setProperty("화요일", "아직 2일 지났다");
			
			System.out.println(prop);
			
			System.out.println(prop.get("월요일"));
			System.out.println(prop.getProperty("화요일"));
			
			Enumeration em = prop.elements();
			while(em.hasMoreElements()) {
				System.out.println(em.nextElement());
			}
			
			String filename="C:\\Kang\\KangJava\\java_collection\\src\\javaMap\\router.properties";
			
			Properties router = new Properties();
			
			try(FileReader fs = new FileReader(filename)) {
				router.load(fs);
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println(router);
			
			System.out.println(router.getProperty("signup"));
	}
}
