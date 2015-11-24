/**
	Queue interface
	@version 11/24/15
	@author Will Long
*/
public interface Queue<E>
{
	/**adds item to queue*/
	void offer(E item); 
	
	/**removes first item in queue*/
	E poll();
	
	/**returns first item in queue*/
	E peek(); 
	
	/**returns whether or not the queue is empty*/
	boolean isEmpty();
}