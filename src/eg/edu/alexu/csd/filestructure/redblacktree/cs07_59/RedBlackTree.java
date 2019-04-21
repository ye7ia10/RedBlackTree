package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import eg.edu.alexu.csd.filestructure.redblacktree.INode;
import eg.edu.alexu.csd.filestructure.redblacktree.IRedBlackTree;

public class RedBlackTree <T extends Comparable<T>, V> implements IRedBlackTree<T,V>{
	
	private INode <T, V> root = null;
	@Override
	public INode<T, V> getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (root == null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		clearTree(root);
	}

	@Override
	public V search(T key) {
		// TODO Auto-generated method stub
		INode<T, V> node = root;
		while (node != null) {
			if (node.getKey().compareTo(key) == 0) {
				return node.getValue();
			}
		    if (key.compareTo(node.getKey()) > 0) {
				node = node.getRightChild();
			} else {
				node = node.getLeftChild();
			}
		}
		return null;
	}

	@Override
	public boolean contains(T key) {
		// TODO Auto-generated method stub	
		return (search(key) != null);
	}

	@Override
	public void insert(T key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(T key) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void clearTree(INode<T,V> node) {
		if(node.isNull())
			return;
		node.setKey(null);
		clearTree(node.getLeftChild());
		clearTree(node.getRightChild());
	}
	
	private void rotateRight(INode<T, V> node) {
		INode<T, V> y = node.getLeftChild();
	}
	
	
	
	@SuppressWarnings({ "unused", "hiding" })
	private class Node <T extends Comparable<T>, V> implements INode<T, V>{
		
		static final boolean RED   = true;
	    static final boolean BLACK = false;
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

}
