package com.company.coursera;

public class QuickUnion {

    public static void main(String[] args) {
        //Solution.isSubtree();


    }
}
 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}
class Solution{
    public static boolean isSubtree(TreeNode s, TreeNode t){
         if(s==null){
             return false;
         }
         else if(isSameTree(s,t)) {
             return true;
         }
         else{
             return isSubtree(s.left,t) || isSubtree(s.right,t);
         }
    }

    public static boolean isSameTree(TreeNode s,TreeNode t){
          if(s==null || t==null){
              return s ==null && t==null;
          }
          else if(s.val == t.val){
              return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
          }
          else{
              return false;
          }
    }
}
