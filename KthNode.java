/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.Stack;
public class Solution {
    int count=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        //中序遍历二叉树，得到从小到大的序列，压入栈，出栈得到第k大结点
        //判空
        if(count>k||pRoot==null){
            return null;
        }
        
        TreeNode p=pRoot;
        //实例化栈
        Stack<TreeNode> LDRStack=new Stack<TreeNode>();
        //初始化结果结点
        TreeNode kthNode=null;
        while(p!=null||!LDRStack.isEmpty()){
            while(p!=null){
                //压入栈，遍历左子树
                LDRStack.push(p);
                p=p.left;
            }
            //结点出栈
            TreeNode node=LDRStack.pop();
            System.out.print(node.val+",");
            //计数
            count++;
            if(count==k){
                kthNode=node;
            }
            //遍历右子树
            p=node.right;
        }
        return kthNode;
        
    }


}
