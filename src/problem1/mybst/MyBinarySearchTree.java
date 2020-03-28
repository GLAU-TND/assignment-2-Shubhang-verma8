/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
import problem1.node.TreeNode;


public class MyBinarySearchTree {
    private TreeNode root;

    // To insert a new Node in Tree.
    public void insert(int value){
        TreeNode node = new TreeNode(value);
        if(root == null){
            root = node;
            //System.out.println("root Node inserted");
        }
        else {
            //insertHelper(root,value);
        }
    }
}
