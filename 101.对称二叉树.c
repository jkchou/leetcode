/*
 * @lc app=leetcode.cn id=101 lang=c
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

bool isEqual(struct TreeNode* left,struct TreeNode* right){
    if (left->val == right->val)
        return true;
    else return false;
    
} 
bool isSymmetric(struct TreeNode* root){
    if (root == NULL)
        return true;

    if(isEqual(root->left,root->right))
        return isSymmetric(root->left)&&isSymmetric(root->right);
    else return false;  
}
// @lc code=end

