import java.util.ArrayList;

public class Tree {
    private Integer root;
    private ArrayList<Tree> subtrees;

    public Tree(Integer root, ArrayList<Tree> subtrees) {
        this.root = root;
        if (subtrees.isEmpty()){
            subtrees = null;
        }
        else {
            this.subtrees = subtrees;
        }
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    private int len() {
        if (this.root == null) {
            return 0;
        }
        else {
            int size = 1;
            for (Tree subtree : subtrees) {
                size += subtree.len();
            }
            return size;
        }
    }

    public int count(Integer item) {
        if (this.root == null) {
            return 0;
        }
        else {
            int num = 0;
            if (this.root.equals(item)) {
                num += 1;
            }
            for (Tree subtree : subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }

}
