package com.mym.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的遍历
 * 深度遍历：
 *      前序遍历（根左右）
 *      中序遍历（左根右）
 *      后序遍历（左右根）
 *
 * 广度遍历：
 *      层序遍历
 */
public class BinaryTree {

    /**
     * 二叉树节点定义
     */
    private static class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    /**
     * 从集合构建二叉树
     * @param list 集合
     * @return tree
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> list){
        TreeNode node = null;
        if ((list == null || list.isEmpty())) {
            return null;
        }

        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

    /**
     * 前序遍历
     * @param node tree
     */
    public static void preOrderTraveral(TreeNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.data);
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    /**
     * 中序遍历
     * @param node tree
     */
    public static void mediumOrderTraveral(TreeNode node){
        if (node == null) {
            return;
        }
        mediumOrderTraveral(node.leftChild);
        System.out.print(node.data);
        mediumOrderTraveral(node.rightChild);
    }

    /**
     * 后序遍历
     * @param node tree
     */
    public static void postOrderTraveral(TreeNode node){
        if (node == null) {
            return;
        }
        postOrderTraveral(node.leftChild);
        postOrderTraveral(node.rightChild);
        System.out.print(node.data);
    }

    /**
     * 层序遍历
     * @param node tree
     */
    public static void levelOrderTraveral(TreeNode node){
        if (node == null) {
            return;
        }
        // 使用队列（先进先出）辅助遍历。递归处理麻烦
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            System.out.print(poll.data);
            if (poll.leftChild != null) {
                queue.offer(poll.leftChild);
            }
            if (poll.rightChild != null) {
                queue.offer(poll.rightChild);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(new Integer[]{3,2,9,null,null,10,null,null,8,null,4}));
        TreeNode binaryTree = createBinaryTree(list);
        System.out.println("前序遍历： ");
        preOrderTraveral(binaryTree);
        System.out.println("中序遍历： ");
        mediumOrderTraveral(binaryTree);
        System.out.println("后序遍历： ");
        postOrderTraveral(binaryTree);
        System.out.println("层序遍历： ");
        levelOrderTraveral(binaryTree);
    }
}
