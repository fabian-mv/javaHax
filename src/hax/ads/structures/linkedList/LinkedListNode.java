package hax.ads.structures.linkedList;


public class LinkedListNode<T> {
	private T value;
	private LinkedListNode next;
	private int index;
	
	
	public LinkedListNode(T pValue , LinkedListNode pNext) {
		this.value = pValue;
		this.next = pNext;
		this.index = 0;
	}
	
	
	public T getValue() {
		return this.value;
	}
	
	public LinkedListNode getNext() {
		return this.next;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setValue(T pValue) {
		this.value = pValue;
	}
	
	public void setNext(LinkedListNode pNext) {
		this.next = pNext;
	}
	
	public void setIndex(int pIndex) {
		this.index = pIndex;
	}
}
