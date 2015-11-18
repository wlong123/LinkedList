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
		System.out.println(l);
	}
}