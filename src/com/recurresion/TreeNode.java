package com.recurresion;

public class TreeNode {

	private Integer value;
	private TreeNode leftNode;
	private TreeNode rightNode;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public static String findMaxPath(TreeNode node){
		if(node == null){
			return "";
		}else{
			if(findMaxValue(node.leftNode) >= findMaxValue(node.rightNode)){
				return node.value.toString() + findMaxPath(node.leftNode);
			}else{
				return node.value.toString() + findMaxPath(node.rightNode);
			}
		}
	}
	
	public static Integer findMaxValue(TreeNode node){
		if(node == null){
			return 0;
		}else{
			if(findMaxValue(node.leftNode) >= findMaxValue(node.rightNode)){
				return node.value + findMaxValue(node.leftNode);
			}else{
				return node.value + findMaxValue(node.rightNode);
			}
		}
	}
}
