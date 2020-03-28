/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.element.Element;

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

    public boolean isEmpty(){
        return front == null;
    }
}
