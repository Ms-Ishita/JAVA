import java.util.LinkedList;
import java.util.Queue;

public class tree12 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    public static int idx = -1;

    public static Node creatTree(int[] arr) {
        idx++;
        if (idx >= arr.length || arr[idx] == -1) return null;
        Node nw = new Node(arr[idx]);
        nw.left = creatTree(arr);
        nw.right = creatTree(arr);
        return nw;
    }

   public static void levelOrder(Node root) {
    if (root == null) return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    int level = 1;

    System.out.print("Level " + level + ": ");

    while (!q.isEmpty()) {
        Node currNode = q.remove();

        if (currNode == null) {
            System.out.println();
            if (q.isEmpty()) break;
            level++;
            System.out.print("Level " + level + ": ");
            q.add(null);
        } else {
            System.out.print(currNode.data + " ");
            if (currNode.left != null) q.add(currNode.left);
            if (currNode.right != null) q.add(currNode.right);
        }
    }

    System.out.println("\nTotal Levels: " + level);
}


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, -1, 4, -1, -1, 4, -1, 3, -1, 4, -1, -1};
        Node root = creatTree(arr);
        levelOrder(root);
    }
}
