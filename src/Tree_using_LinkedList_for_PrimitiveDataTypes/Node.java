package Tree_using_LinkedList_for_PrimitiveDataTypes;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   26-02-2020 ,  Time :-    16 : 18
 
 */
public class Node {
    int data;
    Node left;
    Node right;

//    public Node(int data , Node left , Node right) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
