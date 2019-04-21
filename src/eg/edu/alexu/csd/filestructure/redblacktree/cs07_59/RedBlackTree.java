package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import eg.edu.alexu.csd.filestructure.redblacktree.INode;
import eg.edu.alexu.csd.filestructure.redblacktree.IRedBlackTree;

public class RedBlackTree <T extends Comparable<T>, V> implements IRedBlackTree<T,V>{
	
	private INode <T, V> root = null;
	private INode <T, V> nil = null;

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
	
	public void rotateRight(INode<T, V> node) {
		
		INode<T, V> y = node.getLeftChild();
		node.setLeftChild(y.getRightChild());
		if (y.getRightChild() != nil) {
			y.getRightChild().setParent(node);	
		}
		y.setParent(node.getParent());
		if (node.getParent() == nil) {
			root = y;
		} else if (node == node.getParent().getLeftChild()) {
			node.getParent().setLeftChild(y);
		} else {
			node.getParent().setRightChild(y);
		}
		
		y.setRightChild(node);
		node.setParent(y);
	
	}
	
   public void rotateLeft(INode<T, V> node) {
		
		INode<T, V> y = node.getRightChild();
		node.setRightChild(y.getLeftChild());
		if (y.getLeftChild() != nil) {
			y.getLeftChild().setParent(node);	
		}
		y.setParent(node.getParent());
		if (node.getParent() == nil) {
			root = y;
		} else if (node == node.getParent().getLeftChild()) {
			node.getParent().setLeftChild(y);
		} else {
			node.getParent().setRightChild(y);
		}
		
		y.setLeftChild(node);
		node.setParent(y);
	
	}
	

}
