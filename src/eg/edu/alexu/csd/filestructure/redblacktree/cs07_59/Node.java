package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import eg.edu.alexu.csd.filestructure.redblacktree.INode;

public class Node <T extends Comparable<T>, V> implements INode<T, V>{
    private boolean color = true;
    private INode <T , V> parent = null;
    private INode <T , V> leftChild = null;
    private INode <T , V> rightChild = null;
    private T key = null;
    private V value = null;
	@Override
	public void setParent(INode<T, V> parent) {
		// TODO Auto-generated method stub
		this.parent = parent;
	}

	@Override
	public INode<T, V> getParent() {
		// TODO Auto-generated method stub
		return parent;
		
	}

	@Override
	public void setLeftChild(INode<T, V> leftChild) {
		// TODO Auto-generated method stub
		this.leftChild = leftChild;
	}

	@Override
	public INode<T, V> getLeftChild() {
		// TODO Auto-generated method stub
		return leftChild;
	}

	@Override
	public void setRightChild(INode<T, V> rightChild) {
		// TODO Auto-generated method stub
		this.rightChild = rightChild;
	}

	@Override
	public INode<T, V> getRightChild() {
		// TODO Auto-generated method stub
		return rightChild;
	}

	@Override
	public T getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(T key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void setValue(V value) {
		// TODO Auto-generated method stub
		this.value = value;
	}

	@Override
	public boolean getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(boolean color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		if (key == null) {
			return true;
		}
		return false;
	}
	


}
