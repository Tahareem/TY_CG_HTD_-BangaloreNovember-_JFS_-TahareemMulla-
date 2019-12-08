import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(22);
		l1.add(32);
		System.out.println(l1);//[12, 22, 32]
		
		//push the ele to the first index
		l1.push(66);
		System.out.println(l1);//[66, 12, 22, 32]
		
		//remove the ele from first index
		l1.pop();
		System.out.println(l1);//[12, 22, 32]
		
		//gives the first ele
		System.out.println(l1.element());//12
		
		System.out.println(l1);//[12, 22, 32]
	}
}
