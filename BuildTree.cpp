// 前序遍历和中序遍历树构造二叉树
/**
 * Definition of TreeNode:
 * class TreeNode {
 * public:
 *     int val;
 *     TreeNode *left, *right;
 *     TreeNode(int val) {
 *         this->val = val;
 *         this->left = this->right = NULL;
 *     }
 * }
 */
 

class Solution {
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
public:
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder) {
        // write your code here
        int len1 = preorder.size();  
        int len2 = inorder.size();  
        if (len1 <= 0 || len2 <= 0) {  
            return nullptr;  
        }  
        return  dp(preorder,inorder);  

    }
    TreeNode *dp(vector<int> &porder, vector<int> &iorder) {   
        int len1 = porder.size();  
        int len2 = iorder.size();  
        if (len1 <= 0 || len2 <= 0) {  
            return nullptr;  
        }  
         
     TreeNode *root = new TreeNode();  
        root->val=porder[0];  
        if (len1 ==1 || len2 ==1) {  
            return root;  
        }  
        int r=0;  
        for (int i = 0; i < len1 ; ++i) {  
            if (iorder[i] == root->val) {  
                r = i;  
                break;  
            }  
        }  
        vector<int> linorder;  
        vector<int> rinorder;  
        vector<int> rporder;  
        vector<int> lporder;  
         for (int i = 0; i < r ; ++i) {  
             linorder.push_back(iorder[i]);  
         }  
         for (int i = r+1; i < len2 ; ++i) {  
             rinorder.push_back(iorder[i]);  
         }  
          for (int i = 1; i <= r ; ++i) {  
             lporder.push_back(porder[i]);  
         }  
          for (int i = r+1; i <= len1; ++i) {  
             rporder.push_back(porder[i]);  
         }  
          
         root->left =dp(lporder,linorder);  
         root->right =dp(rporder,rinorder);  
         return root;  
    }  
};
