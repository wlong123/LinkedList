public class ListNode<E>
{
	private E item;
	private ListNode next;
		
	public ListNode(E i)
	{
		item = i;
		next = null;
	}
	
	public ListNode(E i, ListNode n)
	{
		item = i;
		next = n;
	}
	
	public E getItem()
	{
		return item;
	}
	
	public ListNode getNext()
	{
		return next;
	}
	
	public void setItem(E i)
	{
		item = i;
	}
	
	public void setNext(ListNode n)
	{
		next = n;
	}
	
	public String toString()
	{
		String s = "";
		s += item;
		return s;
	}
}