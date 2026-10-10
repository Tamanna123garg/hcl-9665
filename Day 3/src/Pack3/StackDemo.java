
package Pack3;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original Stack: " + stack);

        System.out.println("Size: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed element: " + stack.pop());
        System.out.println("After pop(): " + stack);


        System.out.println("Position of 20: " + stack.search(20));
        System.out.println("Position of 100: " + stack.search(100));


        System.out.println("Is stack empty? " + stack.empty());


        System.out.println("Contains 30? " + stack.contains(30));


        System.out.println("Final Stack: " + stack);

        stack.clear();
        System.out.println("After clear(): " + stack);
        System.out.println("Is stack empty now? " + stack.empty());
    }
}