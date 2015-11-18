public class LinkedList<E>
{
	//singly linked list
	//head pointer and tail pointer
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean add(E item)
	{
		ListNode<E> toAdd = new ListNode<E>(item);
		if(head == null)
		{
			head = toAdd;
			tail = toAdd;
		}
		else
		{
			tail.setNext(toAdd);
			tail = toAdd;
		}
		size++;
		return true;
	}
	
	public void add(int index, E item)
	{
		ListNode<E> toAdd = new ListNode<E>(item);
		if(head == null)
		{
			head = toAdd;
			tail = toAdd;
		}	
		else if(index == 0)
		{
			toAdd.setNext(head);
			head = toAdd;
		}
		else if(index == size)
		{
			tail.setNext(toAdd);
			tail = toAdd;
		}
		else
		{
			int count = 0;
			for(ListNode<E> curr = head; count < size; curr = curr.getNext())
			{
				if(count == index - 1)
				{
					ListNode<E> temp = curr.getNext();
					curr.setNext(toAdd);
					toAdd.setNext(temp);
					count += size;
				}
				count++;
			}
		}
		size++;
	}
	
	public String toString()
	{
		String s = "";
		for(ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			s += curr.toString() + ", ";
		}
		return s;
	}
}