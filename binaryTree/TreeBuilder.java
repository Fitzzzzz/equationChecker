package binaryTree;

import java.util.LinkedList;

import equationHandler.Operand;
import equationHandler.Token;


public class TreeBuilder {

	public TreeBuilder(LinkedList<Token> list) {
		

		System.out.println(list);
		this.tree = new Node();
		constructTree(list, tree);
		System.out.println(list);
		System.out.println("result = " + postOrderEvaluation(tree));
		
	}

	
	private Node tree;
	public Node getTree() {
		return tree;
	}
	public void setTree(Node tree) {
		this.tree = tree;
	}


	public static void constructTree(LinkedList<Token> list, Node top) {
		
		top.setValue(list.removeLast());
		Node tmp = top;
		
		while (!list.isEmpty()) {
	
			System.out.println(list.peekLast().toString());
			
			if (tmp.getValue().getType() == 1) {
				tmp.setLeftSon(new Node(tmp, list.removeLast()));
				tmp = tmp.getLeftSon();
			}
			else if (tmp.getValue().getType() == 0) {
				tmp = tmp.getFather();
				while (tmp.getRightSon() != null) {
					tmp = tmp.getFather();
				}
				tmp.setRightSon(new Node(tmp, list.removeLast()));
				tmp = tmp.getRightSon();
			}
			
		}
		
	}
	
	/**
	 * Is actually a reverse post-order evaluation...
	 * @param top
	 */
	public static int postOrderEvaluation(Node node) {
		
		System.out.print(node.getValue().getOpString());
		
		if (node.getValue().getType() == 0) {
			return ((Operand) (node.getValue())).getValue();
		}
		int rightValue = postOrderEvaluation(node.getRightSon());
		int leftValue = postOrderEvaluation(node.getLeftSon());
		switch (node.getValue().getOpString()) {
		case "+": 
			return rightValue + leftValue;
			
		case "-":
			return rightValue - leftValue;
			
		case "/":
			return rightValue / leftValue;
			
		case "*":
			return rightValue * leftValue;
			
		default:
			System.out.println(node.getValue().getOpString() + " wasn't recognized");
			return 0;
				
		}
		
	}
}
