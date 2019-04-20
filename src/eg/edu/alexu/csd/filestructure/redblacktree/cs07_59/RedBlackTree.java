package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import eg.edu.alexu.csd.filestructure.redblacktree.INode;
import eg.edu.alexu.csd.filestructure.redblacktree.IRedBlackTree;

public class RedBlackTree <T extends Comparable<T>, V> implements IRedBlackTree<T,V>{

	@Override
	public INode<T, V> getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V search(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T key) {
		// TODO Auto-generated method stub
		return false;
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
	
	@SuppressWarnings({ "unused", "hiding" })
	private class Node <T extends Comparable<T>, V> implements INode<T, V>{

		@Override
		public void setParent(INode<T, V> parent) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public INode<T, V> getParent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setLeftChild(INode<T, V> leftChild) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public INode<T, V> getLeftChild() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setRightChild(INode<T, V> rightChild) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public INode<T, V> getRightChild() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setKey(T key) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setValue(V value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean getColor() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setColor(boolean color) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isNull() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

}
