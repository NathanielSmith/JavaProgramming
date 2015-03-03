//Nathaniel Smith
//11-15-14
import java.util.*;
public class stacks {
	public static void main(String[] args){
		
		Stack<String> stack = new Stack<String>();
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		stack.push("fourth");
		printStack(stack);
		
		
		System.out.println(stack.peek());
		System.out.println(stack);
		//stack.peek();
		//printStack(stack);
		//stack.peek();
		//printStack(stack);
		//stack.peek();
		//printStack(stack);
		
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}
	
	private static void printStack(Stack<String> s){
		if(s.isEmpty())
			System.out.println("You have nothing in your stack");
		else
			System.out.printf("%s TOP\n", s);
	}
}
