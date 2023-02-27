package calculadoraLogica;

public class TreeNode {
    String label;
    boolean isNegated;
    TreeNode left;
    TreeNode right;
        
    public TreeNode(String label, boolean isNegated) {
        this.label = label;
        this.isNegated = isNegated;
        this.left = null;
        this.right = null;
    }
}
