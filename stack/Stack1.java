import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(33);
		s1.add(78);
		s1.add(67);
		
		s1.push(100);
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		System.out.println(s1.peek());
		System.out.println(s1);
		
		System.out.println(s1.search(33));//search in reverse order
		System.out.println(s1);
	}
}
