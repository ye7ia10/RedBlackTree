package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import javax.management.RuntimeErrorException;

import eg.edu.alexu.csd.filestructure.redblacktree.INode;
import eg.edu.alexu.csd.filestructure.redblacktree.IRedBlackTree;

public class RedBlackTree <T extends Comparable<T>, V> implements IRedBlackTree<T,V>{
	
	
	private INode <T, V> nil = null;
	private INode <T, V> root = nil;
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
		if (key == null) {
			throw new RuntimeErrorException(null);
		}
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
		if (key == null) {
			throw new RuntimeErrorException(null);
		}
		return (search(key) != null);
	}

	@Override
	public void insert(T key, V value) {
		// TODO Auto-generated method stub
		if (key == null) {
			throw new RuntimeErrorException(null);
		}
		if (value == null) {
			throw new RuntimeErrorException(null);
		}
		
		INode <T, V> node = new Node<T, V>();
		node.setKey(key);
		node.setValue(value);
		INode<T,V> x = root;
		INode<T,V> y = nil;
		while (x != nil) {
			y = x;
			if (key.compareTo(x.getKey()) > 0) {
				x = x.getRightChild();
			} else if (key.compareTo(x.getKey()) < 0) {
				x = x.getLeftChild();
			} else {
				x.setValue(value);
				return;
			}
		}
		
		node.setParent(y);
		if (y == nil) {
			root = node;
		}
		else if (key.compareTo(y.getKey()) < 0) {
			y.setLeftChild(node);
		} else {
			y.setRightChild(node);
		}
		
		node.setColor(true);
		node.setLeftChild(nil);
		node.setRightChild(nil);
		
		fixColors(node);
		
	}
	
	//helper do not forget to delete.
	public void pub() {
		// TODO Auto-generated method stub
		inorderHelper(root);
	}
	
	void inorderHelper(INode<T,V> root) 
	{ 
	    if (root == nil) 
	        return; 
	  
	    inorderHelper(root.getLeftChild()); 
	    System.out.println(root.getKey()); 
	    inorderHelper(root.getRightChild()); 
	} 

	private void fixColors(INode<T, V> node) {
		// TODO Auto-generated method stub
		INode<T, V> parent = null;
		INode<T, V> grand_parent = null;
		
		while ((node != root) && (node.getColor() != false ) &&
				 ( node.getParent().getColor() == true) ) {
			parent = node.getParent();
			grand_parent = node.getParent().getParent();
			
			if (parent == parent.getParent().getLeftChild()) {
				
				INode<T, V> uncle = parent.getParent().getRightChild();
				
				//case one : uncle is red
				if (uncle != nil && uncle.getColor() == true) {
					grand_parent.setColor(true);
					parent.setColor(false);
					uncle.setColor(false);
					node = grand_parent;
				}
				
				
				else {
					//left right case
					if (node == parent.getRightChild()) {
						rotateLeft(parent);
						node = parent;
						parent = node.getParent();
					}
					
					//left left case 
					rotateRight(grand_parent);
					boolean temp = parent.getColor();
					parent.setColor(grand_parent.getColor());
					grand_parent.setColor(temp);
					node = parent;
					
				}
			}
			else {
				
				INode<T, V> uncle = parent.getParent().getLeftChild();
				
				//case one : uncle is red
				if (uncle != nil && uncle.getColor() == true) {
					grand_parent.setColor(true);
					parent.setColor(false);
					uncle.setColor(false);
					node = grand_parent;
				}
				
				
				else {
					//right left case
					if (node == parent.getLeftChild()) {
						rotateRight(parent);
						node = parent;
						parent = node.getParent();
					}
					
					//Right Right case 
					rotateLeft(grand_parent);
					boolean temp = parent.getColor();
					parent.setColor(grand_parent.getColor());
					grand_parent.setColor(temp);
					node = parent;
					
				}
				
				
			}
			
			
			
		}
		root.setColor(false);
	}

	@Override
	public boolean delete(T key) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void clearTree(INode<T,V> node) {
		if(node == nil) {
			root = nil;
			return;
		}
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
