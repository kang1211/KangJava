package javaSet;

import java.util.TreeSet;

public class set_study2 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		do {
			int num = (int)(Math.random()*50+1);
			tree.add(num);
//			System.out.println(num);
		}while(tree.size()<10);
		
		System.out.println(tree);
		
		// 검색
		System.out.println(tree.floor(30));
		// 지정한 값과 일치하는 값을 우선적으로 출력 / 하고 없다면 근접하는 작은값을 출력
		System.out.println(tree.headSet(25));
		// 지정한 값보다 작은 값의 범위를 출력 / 일치값은 안가져온다
		System.out.println(tree.tailSet(27));
		// 지정한 값보다 큰 값의 범위를 출력 / 일치값은 안가져온다
		System.out.println(tree.higher(40));
		// 지정한 값과 근접한 큰 값을 출력  / 일치값은 안가져온다
		System.out.println(tree.lower(1));
		// 지정한 값과 근접한 작은 값을 출력 / 일치값은 안가져온다
		System.out.println(tree.subSet(10, 30));
		// 작은값 포함부터 큰값 전까지의 수를 출력 / subSet(A이상, B미만)
		
		
//		System.out.println(tree.size());
		
	}
}
