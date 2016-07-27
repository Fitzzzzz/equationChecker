package binaryTree;

import expressions.ExpAbstract;

public class Node {

	private ExpAbstract value;
	
	public ExpAbstract getValue() {
		return value;
	}

	public void setValue(ExpAbstract value) {
		this.value = value;
	}
	
	private Node father;
	
	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	private Node left;
	
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	private Node right;
	
	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	
	public Node(ExpAbstract value) {
		this.setValue(value);
		this.left = null;
		this.right = null;
		this.father = null;
	}
	
	public Node(Node father) {
		this.father = father;
	}
	
	public Node(ExpAbstract value, Node father) {
		this.value = value;
		this.father = father;
	}

	public Node(Node father, Node left, Node right) {
		this.father = father;
		this.left = left;
		this.right = right;
	}

	public Node(ExpAbstract value, Node left, Node right) {
		this.setValue(value);
		this.left = left;
		this.right = right;
	}

	public Node(ExpAbstract value, Node father, Node left, Node right) {
		super();
		this.value = value;
		this.father = father;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return this.getValue().toString();
	}
	
	
	 
	
}
