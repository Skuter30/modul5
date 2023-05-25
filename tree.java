package izaaa.modul5smt4.baru;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void NewNode(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else {
            root.right = insertNode(root.right, value);
        }

        return root;
    }
    
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
}
       
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.value);
            inOrder(node.right);
        }
    }
 
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.value);
        }
    
    }
}
public class tree {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(7);
        pohon.NewNode(6);
        pohon.NewNode(3);
        pohon.NewNode(1);
        pohon.NewNode(2);
        pohon.NewNode(5);
        pohon.NewNode(9);

        
        System.out.print("\nPre Order : \n");
        pohon.preOrder(pohon.root);
        System.out.println("\nIn Order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\nPost Order : ");
        pohon.postOrder(pohon.root);
    }        
                }

