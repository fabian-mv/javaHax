package hax.ads.structures.doublyLinkedCircularList;

/**
 * Doubly linked circular list node class.
 *
 * @author Fabián Montero <machetazo>
 * @param <T> value type of the list
 * @version alpha as fuck
 */
public class DoublyLinkedCircularListNode<T> {

    private T value;
    private DoublyLinkedCircularListNode<T> next;
    private DoublyLinkedCircularListNode<T> previous;

    /**
     * Constructor takes all arguments and initializes.
     *
     * @param pValue value of the node
     * @param pNext reference to next node
     * @param pPrevious reference to previous node
     */
    public DoublyLinkedCircularListNode(T pValue, DoublyLinkedCircularListNode<T> pNext, DoublyLinkedCircularListNode<T> pPrevious){
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
    public DoublyLinkedCircularListNode(DoublyLinkedCircularListNode<T> pNext, DoublyLinkedCircularListNode<T> pPrevious){
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

    public DoublyLinkedCircularListNode<T> getNext(){
        return next;
    }

    public void setNext(DoublyLinkedCircularListNode<T> next){
        this.next = next;
    }

    public DoublyLinkedCircularListNode<T> getPrevious(){
        return previous;
    }

    public void setPrevious(DoublyLinkedCircularListNode<T> previous){
        this.previous = previous;
    }
}
