/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import com.sun.source.tree.Tree;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.element.Element;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {
    private Element front;
    private Element back;
    private MyBinarySearchTree tree;

    public MyQueue(MyBinarySearchTree tree){
        this.tree = tree;
    }

    public <T>void add(Element ele){
        if(isEmpty()){
            front = ele;
            back = ele;
        }
        else {
            back.setNext(ele);
            back = ele;
        }
    }

    public void addAllPreOrderSuccessor(){
        TreeNode current = tree.getRoot();
        List l = new LinkedList();
        l.add(current);
    }

    public boolean isEmpty(){
        return front == null;
    }
}
