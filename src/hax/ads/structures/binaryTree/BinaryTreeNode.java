package hax.ads.structures.binaryTree;

/**
 * Binary Tree Node Class.
 *
 * @author Fabián Montero <machetazo>
 * @version 0.1 07/11/17
 */
public class BinaryTreeNode<T> {

    private T value;
    private int key;

    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;

    /**
     * Default constructor initializes node with empty values.
     */
    public BinaryTreeNode(){
        this.value = null;
        this.key = 0;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructor initializes node without children but with a user-specified name and value.
     *
     * @param pValue value of the node
     */
    public BinaryTreeNode(T pValue , int pKey){
        this.value = pValue;
        this.key = pKey;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructor initializes node with all attributes specified by user.
     *
     * @param pValue value of the node
     * @param pLeft left child
     * @param pRight right child
     */
    public BinaryTreeNode( T pValue , int pKey , BinaryTreeNode pLeft , BinaryTreeNode pRight){
        this.value = pValue;
        this.key = pKey;
        this.left = pLeft;
        this.right = pRight;
    }

    /**
     * Returns a string representation of the value of the node
     *
     * @return a string representation of the value of the node
     */
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

    public int getKey(){
        return key;
    }

    public void setKey(int key){
        this.key = key;
    }

    public BinaryTreeNode<T> getLeft(){
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left){
        this.left = left;
    }

    public BinaryTreeNode<T> getRight(){
        return right;
    }

    public void setRight(BinaryTreeNode<T> right){
        this.right = right;
    }
}
