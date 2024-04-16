package collection_examples;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		  
		LinkedList<Integer> li = new LinkedList();
		li.add(12);
		li.add(21);
		li.add(321);
		li.add(22);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());
		li.addFirst(11);
		System.out.println(li);
		System.out.println(li.getFirst());
		li.add(222);
		System.out.println(li);
		
		System.out.println(li.offerFirst(111));
		System.out.println(li.offerLast(1111));
		System.out.println("Poll First" +li.pollFirst());
		System.out.println("Poll First" +li.pollLast());
		
		System.out.println(li.removeFirst());
		System.out.println(li);

	}

}
