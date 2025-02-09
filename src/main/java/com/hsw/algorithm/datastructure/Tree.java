package com.hsw.algorithm.datastructure;

import java.util.Queue;

/**
 * Tree
 *
 */
public class Tree {
  static BinaryTree<Integer> DummyBinaryTree() {
    BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
    BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
    BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);
    BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
    BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
    BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6);
    BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);
    BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);

    node1.setLeft(node2);
    node1.setRight(node3);
    node2.setLeft(node4);
    node2.setRight(node5);
    node3.setLeft(node6);
    node3.setRight(node7);
    node4.setLeft(node8);

    BinaryTree<Integer> bt = new BinaryTree<>();
    bt.setRoot(node1);

    return bt;
  }

  public static void main(String[] args) {
    BinaryTree<Integer> bt = DummyBinaryTree();
    System.out.println("run preOrder");
    bt.preOrder(bt.getRoot());
    System.out.println("-----");
    System.out.println("run inOrder");
    bt.inOrder(bt.getRoot());
    System.out.println("-----");
    System.out.println("run postOrder");
    bt.postOrder(bt.getRoot());
    System.out.println("-----");
    System.out.println("run levelOrder");
    bt.levelOrder(bt.getRoot());
    System.out.println("-----");
  }
}

class BinaryTree<T extends Comparable<T>> {
  BinaryTreeNode<T> root;

  public void setRoot(BinaryTreeNode<T> node) {
    this.root = node;
  }

  public BinaryTreeNode<T> getRoot() {
    return this.root;
  }

  public void preOrder(BinaryTreeNode<T> node) {
    if (node == null) {
      return;
    }
    System.out.println(node.data);
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder(BinaryTreeNode<T> node) {
    if (node == null) return;

    inOrder(node.left);
    System.out.println(node.data);
    inOrder(node.right);
  }

  public void postOrder(BinaryTreeNode<T> node) {
    if (node == null) return;

    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.data);
  }

  public void levelOrder(BinaryTreeNode<T> node) {
    Queue<BinaryTreeNode> queue = new java.util.LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {
      BinaryTreeNode n = queue.poll();
      System.out.println(n.data);

      if (n.left != null) {
        queue.add(n.left);
      }

      if (n.right != null) {
        queue.add(n.right);
      }
    }
  }
}

class BinaryTreeNode<T extends Comparable<T>> {
  T data;
  BinaryTreeNode<T> left;
  BinaryTreeNode<T> right;

  public BinaryTreeNode(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public void setLeft(BinaryTreeNode<T> left) {
    this.left = left;
  }

  public void setRight(BinaryTreeNode<T> right) {
    this.right = right;
  }
}
