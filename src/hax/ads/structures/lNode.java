package hax.ads.structures;

public class lNode<T>{

	private T value;
	private lNode next;
	private int index;


	public lNode(T pValue , lNode pNext) {
		this.value = pValue;
		this.next = pNext;
		this.index = 0;
	}


	public T getValue() {
		return this.value;
	}

	public lNode getNext() {
		return this.next;
	}

	public int getIndex() {
		return this.index;
	}

	public void setValue(T pValue) {
		this.value = pValue;
	}

	public void setNext(lNode pNext) {
		this.next = pNext;
	}

	public void setIndex(int pIndex) {
		this.index = pIndex;
	}
}
