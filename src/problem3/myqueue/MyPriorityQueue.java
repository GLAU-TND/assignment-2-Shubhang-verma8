/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;

public class MyPriorityQueue {
    private Node front;
    private Node back;

    public <T>void enQueue(T data,int priority){
        Node node = new Node(data,priority);
        if(isEmpty() || node.getPriority() < front.getPriority()){
            node.setNext(front);
            front = node;
        }
    }

    public boolean isEmpty(){
        return front == null;
    }

}
