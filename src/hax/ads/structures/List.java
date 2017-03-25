package hax.ads.structures;

public class List{

	private lNode head;
	private int size;

	public List(lNode head , int size) {
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


	public lNode getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}

	public void setHead(lNode pHead) {
		this.head = pHead;
	}
}
