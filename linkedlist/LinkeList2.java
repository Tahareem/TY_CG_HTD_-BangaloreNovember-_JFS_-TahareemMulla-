import java.util.LinkedList;

public class LinkeList2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(45);
		l1.add(44);
		System.out.println(l1);
		
		
		System.out.println("====addfist and addLast==============");
		l1.addFirst(11);
		l1.addLast(33);
		System.out.println(l1);
		
		System.out.println("========remove()=============");
		l1.remove();
		System.out.println(l1);
		
		System.out.println("============removeFirst() and removeLast()===============");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		
		System.out.println("==========removeFirstOccurence() and removeLastOccurence()==========");
		LinkedList l2=new LinkedList();
		l2.add(66);
		l2.add(77);
		l2.add(88);
		l2.add(66);
		l2.add(99);
		l2.add(66);
		System.out.println(l2);
		l2.removeFirstOccurrence(66);
		l2.removeLastOccurrence(66);
		System.out.println(l2);
		
		
		System.out.println("=======getFirst() and getLast()=============");
		l2.getFirst();
		l2.getLast();
		System.out.println(l2);
		
	}
}
