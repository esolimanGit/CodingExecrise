import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BSTree {
        private Node root;
        class Node {
            public int value;
            public Node left;
            public Node right;

            Node(int value) {
                this.value = value;
            }
        }

        public Node getRoot() {
            return root;
        }

        public boolean insert(int value){
            if (root == null) {
                Node node = new Node(value);
                this.root = node;
            } else {
                Node node = root;
                while (true){
                    if(value == node.value) return false;
                    if(node.value > value)
                        if(node.right == null) {
                            node.right = new Node(value);
                            return true;
                        } else {
                            node = node.right;
                        }
                    if(node.value < value)
                        if(node.left == null) {
                            node.left = new Node(value);
                            return true;
                        } else{
                            node = node.left;
                        }
                }
            }
            return false;
        }
}
