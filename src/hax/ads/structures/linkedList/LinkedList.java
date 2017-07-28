package hax.ads.structures.linkedList;

public class LinkedList {
	
	private LinkedListNode head;
	private int size;
	
	public LinkedList(LinkedListNode head , int size) {
		this.head = head;
		this.size = size;
	}
	
	
	public boolean isEmpty(){
		return (this.head == null);
	}

	/*
	public lNode getNode(int pIndex){
		;

	}
	*/
	
	
	public LinkedListNode getHead() {
		return head;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setHead(LinkedListNode pHead) {
		this.head = pHead;
	}
}

