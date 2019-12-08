import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		System.out.println("------peek() and peekFirst() and peekLast()---------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		
		System.out.println("-------poll() and pollFirst() and pollLast()---------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		
		System.out.println("======offer() and offerFirst() and offerLast()=========");
		LinkedList l2=new LinkedList();
		l2.add(31);
		l2.add(32);
		l2.add(34);
		l2.add(35);
		System.out.println(l2);
		System.out.println(l2.offer(78));
		System.out.println(l2.offerLast(12));
		System.out.println(l2.offerFirst(99));
		System.out.println(l2);
		
		
	}
}
