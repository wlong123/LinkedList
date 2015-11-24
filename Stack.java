/**
	Stack interface
	@version 11/24/15
	@author Will Long
*/
public interface Stack<E>
{
	/**adds an item to the top of the stack*/
	void push(E item); 
	
	/**removes the top item of the stack*/
	E pop(); 
	
	/**returns the top item of the stack*/
	E peek(); 
	
	/**returns whether the stack is empty of not*/
	boolean isEmpty(); 
}