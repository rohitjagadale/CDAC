

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



class BinarySearchTree {
	static class Node {
		// Node fields
		private int data;
		private Node left, right;
		// Node methods
		public Node() {
			data = 0;
			left = null;
			right = null;
		}
		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
		public int getData() {
			return data;
		}
	}
	
	// Tree fields
	private Node root;
	
	// Tree methods
	public BinarySearchTree() {
		root = null;
	}
	
	public void add(int val) {
		Node newNode = new Node(val);
		if(root == null)
			root = newNode;
		else {
			Node trav = root;
			while(true) {
				if(val < trav.data) {
					if(trav.left != null)
						trav = trav.left;
					else { // no child in left
						trav.left = newNode;
						break;
					}
				}
				else { // if(val >= trav.data) 
					if(trav.right != null)
						trav = trav.right;
					else { // no child in right
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}
	
	private void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(trav.data + ", ");
		preorder(trav.left);
		preorder(trav.right);
	}
	public void preorder() {
		System.out.print("PRE : ");
		preorder(root);
		System.out.println();
	}
	
	private void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.print(trav.data + ", ");
		inorder(trav.right);
	}
	public void inorder() {
		System.out.print("IN  : ");
		inorder(root);
		System.out.println();
	}
	
	private void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + ", ");
	}
	public void postorder() {
		System.out.print("POST: ");
		postorder(root);
		System.out.println();
	}
	
	public void preorderNonRecursive() {
		System.out.print("PRE : ");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while(trav != null || !s.empty()) {
			while(trav != null) {
				System.out.print(trav.data + ", ");
				if(trav.right != null)
					s.push(trav.right);
				trav = trav.left;
			}
			if(!s.empty())
				trav = s.pop();
		}
		System.out.println();
	}
	
	public void inorderNonRecursive() {
		System.out.print("IN  : ");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while(trav != null || !s.empty()) {
			while(trav != null) {
				s.push(trav);
				trav = trav.left;
			}
			if(!s.empty()) {
				trav = s.pop();
				System.out.print(trav.data + ", ");
				trav = trav.right;
			}
		}
		System.out.println();
	}
	
	// PostOrder traversal
	private void deleteAll(Node trav) {
		if(trav == null)
			return;
		deleteAll(trav.left);
		deleteAll(trav.right);
		trav.left = null;
		trav.right = null;
		trav = null;
	}
	public void deleteAll() {
		deleteAll(root);
		root = null;
	}
	
	public int height(Node trav) {
		if(trav == null)
			return -1;
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = hl > hr ? hl : hr;
		return max + 1;
	}
	public int height() {
		return height(root);
	}
	
	public Node bfs(int key) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node trav = q.poll();
			if(key == trav.data)
				return trav;
			if(trav.left != null)
				q.offer(trav.left);
			if(trav.right != null)
				q.offer(trav.right);
		}
		return null;
	}
	public Node dfs(int key) {
		Stack<Node> s = new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			Node trav = s.pop();
			if(key == trav.data)
				return trav;
			if(trav.right != null)
				s.push(trav.right);
			if(trav.left != null)
				s.push(trav.left);
		}
		return null;
	}
	
	public Node binSearch(int key) {
		Node trav = root;
		while(trav != null) {
			if(key == trav.data)
				return trav;
			if(key < trav.data)
				trav = trav.left;
			else // (key > trav.data)
				trav = trav.right;
		}
		return null;
	}
	
	public Node[] binSearchWithParent(int key) {
		Node trav = root, parent = null;
		while(trav != null) {
			if(key == trav.data)
				return new Node[] { trav, parent };
			parent = trav;
			if(key < trav.data)
				trav = trav.left;
			else // (key > trav.data)
				trav = trav.right;
		}
		return new Node[] { null, null };
	}
	
	public void delete(int val) {
		Node trav, parent;
		// find the node to be deleted along with its parent
		Node[] arr = binSearchWithParent(val);
		trav = arr[0];
		parent = arr[1];
		// if node is not found, throw the exception
		if(trav == null)
			throw new RuntimeException("Node not found.");
		// if node has left as well as right child
		if(trav.left != null && trav.right != null) {
			// find its successor with its parent
			parent = trav;
			Node succ = trav.right;
			while(succ.left != null) {
				parent = succ;
				succ = succ.left;
			}
			// overwrite data of node with successor data
			trav.data = succ.data;
			// mark successor node to be deleted
			trav = succ;
		}
		// if node has right child (or node doesn't have left child)
		if(trav.left == null) {
			if(trav == root)
				root = trav.right;
			else if(trav == parent.left)
				parent.left = trav.right;
			else
				parent.right = trav.right;
		}
		// if node has left child (or node doesn't have right child)
		else if(trav.right == null) {
			if(trav == root)
				root = trav.left;
			else if(trav == parent.left)
				parent.left = trav.left;
			else
				parent.right = trav.left;			
		}
	}
}

public class BSTreeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree t = new BinarySearchTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);
		t.preorder();
		t.preorderNonRecursive();
		t.inorder();
		t.inorderNonRecursive();
		t.postorder();
		System.out.println("Height: " + t.height());
		
		/*
		System.out.print("Enter element to find: ");
		int val = sc.nextInt();
		
		Node temp = t.bfs(val);
		if(temp == null)
			System.out.println("BFS: Not found.");
		else
			System.out.println("BFS: Found: " + temp.getData());
		temp = t.dfs(val);
		if(temp == null)
			System.out.println("DFS: Not found.");
		else
			System.out.println("DFS: Found: " + temp.getData());
		temp = t.binSearch(val);
		if(temp == null)
			System.out.println("BS: Not found.");
		else
			System.out.println("BS: Found: " + temp.getData());
		
		Node[] arr = t.binSearchWithParent(val);
		if(arr[0] == null)
			System.out.println("BS: Not found.");
		else if(arr[1] == null) // root node found
			System.out.println("BS: Found: " + arr[0].getData() + " with Parent: " + arr[1]);
		else // node found with parent
			System.out.println("BS: Found: " + arr[0].getData() + " with Parent: " + arr[1].getData());
		*/
		
		t.inorder();
		
		try {
			System.out.print("Enter element to delete: ");
			int val = sc.nextInt();
			t.delete(val);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		t.inorder();
		
//		t.deleteAll();
//		t.inorder();
//		System.out.println("Height: " + t.height());
	}
}
