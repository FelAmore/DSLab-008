import java.util.Scanner;

public class Main {
//    the nodes of binary tree
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

//    the root of binary tree
    public Node root;

    public Main(){
        root = null;
    }

//    to calculate the sum of all nodes in the binary tree
    public int calculateSum(Node x){
        int sum, sumL, sumR;
        sum = sumR = sumL = 0;

//        check if the tree is empty
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
//            calculate the sum of nodes in the left subtree
            if(x.left != null)
                sumL = calculateSum(x.left);

//            calculate the sum of nodes in the right subtree
            if(x.right != null)
                sumR = calculateSum(x.right);

//            calculate the sum of all nodes
            sum = x.val + sumL + sumR;
            return sum;
        }
    }
    public static void main(String[] args) {
        Main tree = new Main();
//        Add nodes manually
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(13);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.right = new Node(14);
        tree.root.left.right.left.right = new Node(5);
        tree.root.right.right.left.right = new Node(12);


//        Print output
        System.out.println("The sum of all keys in the binary tree is " + tree.calculateSum(tree.root));
    }
}