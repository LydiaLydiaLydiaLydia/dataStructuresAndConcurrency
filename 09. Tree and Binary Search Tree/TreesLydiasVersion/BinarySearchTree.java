package TreesLydiasVersion;

public class BinarySearchTree<E extends Comparable<E>> {
    private class Node {
        public E  data;
        public Node left;
        public Node right;
    }
    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
            root = newNode;
        else insertSub(newNode, root);
    }

    //Lab 6_1 Question 2
    public void insertIterative(E element){
        Node newNode = new Node();
        if(root == null){
            root = newNode;
        }else {
            //create a variable to hold the current node you're looking at
            //while current isn't null
            //compare the element to the current node:
            //  if it's less than 0 go right
            //  and assign current =
            //  if it's greater than 0 go left
        }
    }

    private void insertSub(Node newNode, Node node) {
        int result = newNode.data.compareTo(node.data);
        // duplicates go to the right
        if (result >= 0) {
            //go right
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertSub(newNode, node.right);
            }
        } else {
            // go left
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertSub(newNode, node.left);
            }
        }
    }

    public void print(){
        if (root != null)
            printSub(root);
    }

    private void printSub(Node node) {
        //inorder traversal
        if (node != null){
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }
}
