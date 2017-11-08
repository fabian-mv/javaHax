package hax.ads.structures.doublyLinkedList;

/**
 * Doubly Linked List node class.
 *
 * @author Fabian Montero <machetazo>
 * @param <T> dataype of the value of the node
 * @version alpha as fuck
 */
public class DoublyLinkedListNode<T>{
	
	private T value;
	private DoublyLinkedListNode<T> next;
	private DoublyLinkedListNode<T> previous;
	
	/**
	 * Constructor takes all arguments and initializes.
	 *
	 * @param pValue value of the node
	 * @param pNext reference to next node
	 * @param pPrevious reference to previous node
	 */
	public DoublyLinkedListNode(T pValue, DoublyLinkedListNode<T> pNext, DoublyLinkedListNode<T> pPrevious){
		this.value = pValue;
		this.next = pNext;
		this.previous = pPrevious;
	}
	
	/**
	 * Constructor doesn't take the value argument and sets that field to default value (null)
	 *
	 * @param pNext reference to next node
	 * @param pPrevious reference to previous node
	 */
	public DoublyLinkedListNode(DoublyLinkedListNode<T> pNext, DoublyLinkedListNode<T> pPrevious){
		this.value = null;
		this.next = pNext;
		this.previous = pPrevious;
	}

	/**
	 * Returns a string representation of the node.
	 *
	 * @return string representation of the value
	 */
	@Override
	public String toString(){
		return this.value.toString();
	}

	
	/** getters and setters */
	
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T value){
		this.value = value;
	}
	
	public DoublyLinkedListNode<T> getNext(){
		return next;
	}
	
	public void setNext(DoublyLinkedListNode<T> next){
		this.next = next;
	}
	
	public DoublyLinkedListNode<T> getPrevious(){
		return previous;
	}
	
	public void setPrevious(DoublyLinkedListNode<T> previous){
		this.previous = previous;
	}
}
