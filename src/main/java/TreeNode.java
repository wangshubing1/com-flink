

/**
 * @Author: king
 * @Date: Create in 2020/9/16
 * @Desc: TODO 翻转二叉树
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    //利用后序遍历
    private TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left =invertTree(root.left);
        TreeNode right =invertTree(root.right);
        root.left= right;
        root.right =left;
        return root;
        }

    public static void main(String[] args) {
        //TreeNode root = [4,2,7,1,3,6,9];
    }
 }

