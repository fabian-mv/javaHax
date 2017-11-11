package hax.ads.structures.binaryTree;

import java.sql.Ref;

/**
 * javaHax
 *
 * @author Fabián Montero <machetazo>
 * @version 0.1 07/11/17
 */
public class BinaryTree<T> {

    private BinaryTreeNode<T> root;

    /**
     * Default constructor initializes empty tree.
     */
    public BinaryTree(){
        this.root = null;
    }

    /**
     * Constructor initializes tree with a user-specified root.
     *
     * @param pRoot the root of the tree
     */
    public BinaryTree(BinaryTreeNode pRoot){
        this.root = pRoot;
    }

    /**
     * Adds a node to the tree
     *
     * @param pValue value of the node
     * @param pKey key of the node to be added
     */
    public void add(T pValue , int pKey){
        BinaryTreeNode<T> temp = new BinaryTreeNode<T>(pValue , pKey);
        add(temp);
    }

    /**
     * Adds a node to the tree
     *
     * @param pNode node to be added
     */
    public void add(BinaryTreeNode pNode){
        if(this.isEmpty()){
            this.root = pNode;
        } else {
            BinaryTreeNode<T> ref = this.root;
            BinaryTreeNode<T> parent;

            while(true){
                parent = ref;

                if(pNode.getKey() < ref.getKey()){
                    ref = ref.getLeft();

                    if(ref == null){
                        parent.setLeft(pNode);
                        return;
                    }
                } else {
                    ref = ref.getRight();

                    if(ref == null){
                        parent.setRight(pNode);
                        return;
                    }
                }
            }
        }
    }


    public void print(String pOrder , BinaryTreeNode pRef){
        if(pOrder.equals("inorder")){
            if(pRef != null){
                print("inorder" , pRef.getLeft());

                System.out.println(pRef.toString());

                print("inorder" , pRef.getRight());
            }
        } else if(pOrder.equals("preorder")){
            if(pRef != null){
                System.out.println(pRef.toString());
                print("preorder" , pRef.getLeft());
                print("preorder" , pRef.getRight());
            }
        } else if(pOrder.equals("postorder")){
            if(pRef != null){
                print("postorder" , pRef.getLeft());
                print("postorder" , pRef.getRight());

                System.out.println(pRef.toString());
            }
        } else {
            print("inorder" , pRef);
        }
    }

    public BinaryTreeNode search(int pKey){
        BinaryTreeNode<T> ref = this.root;

        while(ref.getKey() != pKey){
            if(pKey < ref.getKey()){
                ref = ref.getLeft();
            } else {
                ref = ref.getRight();
            }

            if(ref == null){
                return null;
            }
        }
        return ref;
    }

    public boolean isEmpty(){
        return (this.root == null);
    }
}