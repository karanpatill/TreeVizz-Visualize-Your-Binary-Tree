import org.w3c.dom.Node;

public class Visualizetree {
    static class Node{
        int data;
        Node left ,right ;

        public Node(int data){   // cpnstructor
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   public static void visualizeTree(Node root) {
        printTree(root, 0);
    }

    // Helper method to print the tree
    private static void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
  
        // Print the right subtree
        printTree(node.right, level + 1);

        // Print the current node with indentation
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + node.data);
        } else {
            System.out.println(node.data);
        }

        // Print the left subtree
        printTree(node.left, level + 1);
    }
   public static void main(String[] args){
       Node root = new Node(50);
        
        // Manually inserting nodes into the tree
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        
        visualizeTree( root);
   }
}



