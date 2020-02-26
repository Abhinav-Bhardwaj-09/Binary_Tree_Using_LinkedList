package Tree_using_LinkedList_for_PrimitiveDataTypes;

import java.util.Scanner;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   26-02-2020 ,  Time :-    16 : 23
 
 */
public class Main {
    public static void main(String[] args) {
        Node root;
        Tree_Operations obj = new Tree_Operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root element :  ");
        int n = sc.nextInt();
        root = obj.CreatenewNode(n);
        Node Root = root;
        System.out.print("Enter the left child of root element :  ");
        n = sc.nextInt();
        root.left = obj.CreatenewNode(n);
        System.out.print("Enter the right child of root element :  ");
        n = sc.nextInt();
        root.right = obj.CreatenewNode(n);
        System.out.print("Enter the left child of left child of root element :  ");
        n = sc.nextInt();
        root.left.left = obj.CreatenewNode(n);
        System.out.print("Enter the right child of left child of root element :  ");
        n = sc.nextInt();
        root.left.right = obj.CreatenewNode(n);
        System.out.println();
        System.out.print("View in pre-order display traversal of tree :  ");
        obj.preOrderDisplay(Root);
        System.out.println();
        System.out.print("View in in-order display traversal of tree :  ");
        obj.inOrderDisplay(Root);
        System.out.println();
        System.out.print("View in post-order display traversal of tree :  ");
        obj.postOrderDisplay(Root);
    }
}
