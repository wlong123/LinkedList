import java.util.Iterator;
public class LinkedListRunner
{
	public static void main(String [] args)
	{
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("zero");
		l.add(1, "two");
		l.add(2, "three");
		l.add(1, "one");
		l.add("four");
		l.addLast("five");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.addFirst("zero");
		System.out.println(l);
		System.out.println("------------");
		LinkedList<String> l1 = new LinkedList<String>();
		System.out.println(l1.isEmpty());
		l1.add("first");
		l1.set(0, "one");
		System.out.println(l1.contains("one"));
		System.out.println(l1);
		l.remove("four");
		System.out.println(l.size());
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.indexOf("two"));
		System.out.println("----------");
		l.add(0, "zero");
		System.out.println(l.get(1));
		System.out.println(l);
		l.remove("zero");
		System.out.println(l);
		l.clear();
		System.out.println(l);
		System.out.println("----------");
		LinkedList<String> l2 = new LinkedList<String>(l);
		System.out.println(l);
		System.out.println(l2);
		Stack<String> s = new LinkedList<String>();
		Queue<String> q = new LinkedList<String>();
		System.out.println("----------------");
		for(String list: l)
			System.out.println(list);
		System.out.println(l);
		System.out.println("--------------");
		LinkedList<String> l3 = new LinkedList<String>(l1);
		System.out.println(l1);
		System.out.println(l3);
		
		
	}
}