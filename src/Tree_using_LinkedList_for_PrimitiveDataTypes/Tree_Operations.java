package Tree_using_LinkedList_for_PrimitiveDataTypes;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   26-02-2020 ,  Time :-    16 : 20
 
 */
public class Tree_Operations {
    public Node CreatenewNode(int data){
        Node newnode = new Node();
        newnode.data = data;
        return newnode;
    }

    public void preOrderDisplay ( Node root ) {
        if ( root == null ){
            return;
        }else {
            System.out.print( root.data + " " );
            preOrderDisplay( root.left );
            preOrderDisplay( root.right );
        }
    }

    public void inOrderDisplay ( Node root ) {
        if ( root == null ){
            return;
        }else {
            inOrderDisplay( root.left );
            System.out.print( root.data + " ");
            inOrderDisplay( root.right );
        }
    }

    public void postOrderDisplay ( Node root ) {
        if ( root == null ){
            return;
        }else {
            postOrderDisplay( root.left );
            postOrderDisplay( root.right );
            System.out.print( root.data + " " );
        }
    }
}
