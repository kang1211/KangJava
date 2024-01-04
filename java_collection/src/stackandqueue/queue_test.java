package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_test {
	public static void main(String[] args) {
		// 선행 큐
		// 일반적인 큐:가장 오래된 값부터 내보내는 선행 큐

		Queue<String> q = new LinkedList<String>();
		q.add("김민수");//데이터 추가
		q.offer("노재홍");//데이터 추가
		q.offer("서종우");
		q.offer("박종권");
		
		System.out.println(q);
		System.out.println(q.remove());//가장 먼저입력된 값 꺼내오기
		System.out.println(q.poll());//가장 먼저입력된 값 꺼내오기
		// remove는 큐에서 꺼낼 값이 없는경우 오류
		// poll은 큐에서 꺼낼 값이 없는 경우 null값 출력
		System.out.println(q.peek());//값을 꺼내지는 않고서 보여주기만 하는 코드
		System.out.println(q.isEmpty());//큐가 비어있는지 확인
		
		// 우선순위 큐
		// 사전적 순서가 낮은 것부터 내보내는 우선순위 큐 *문자열은 영어가 가장 낮음
		Queue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(20);
		pq.add(5);
		pq.offer(1);
		pq.add(11);
		pq.offer(8);
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		Queue<String> pqs = new PriorityQueue<String>();
		
		pqs.offer("라디오");
		pqs.offer("하마");
		pqs.offer("나비");
		pqs.offer("Boy");
		pqs.offer("가방");
		
		System.out.println(pqs);
		System.out.println(pqs.poll());
		System.out.println(pqs.poll());

		//Deque - 이중 큐 (입출이 이중으로 되어있는 큐
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addFirst(10);
		dq.offerFirst(20);
		
		dq.addLast(5); //add 메서드실행과 동일
		dq.offerLast(11);// offer 메서드 실행과 동일
		
		// removefirst, pollFirst, removeLast, pollLast
		
		// deque를 스택으로 사용한다면
		// push, pop 메서드 사용가능
		dq.push(111);
		
	}
}

// 큐 - 선입선출, FIFO(처음 들어온 값이 첫번째로 출력된다.)
// Queue 종류 : 선형Queue, 우선순위 Queue, D Queue