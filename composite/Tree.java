/**
 * Tree
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("a");
        TreeNode nodeB = new TreeNode("b");
        TreeNode nodeC = new TreeNode("c");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree");
    }
}