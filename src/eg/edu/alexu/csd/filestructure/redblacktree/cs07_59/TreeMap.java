package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.management.RuntimeErrorException;
import eg.edu.alexu.csd.filestructure.redblacktree.INode;
import eg.edu.alexu.csd.filestructure.redblacktree.IRedBlackTree;
import eg.edu.alexu.csd.filestructure.redblacktree.ITreeMap;

public class TreeMap <T extends Comparable<T>, V> implements ITreeMap<T, V>{
	IRedBlackTree<T,V> tree = new RedBlackTree<T,V>();
	private int size = 0;
	

	
	@Override
	public Entry<T, V> ceilingEntry(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T ceilingKey(T key) {
		// TODO Auto-generated method stub
		
		if (key == null) {
			throw new RuntimeErrorException(null);
		}
		INode<T, V> ceil = ceilingKey(tree.getRoot(), key);
		
        if (ceil == null) {
        	return null;
        }
            
        return ceil.getKey();
	}

	private INode<T, V> ceilingKey(INode<T, V> root, T key) {
		// TODO Auto-generated method stub
		
		 if (root.isNull())
	            return null;

	        if (key.compareTo(root.getKey()) == 0) {
	            return root;
	        } else if (key.compareTo(root.getKey()) > 0) {
	            return ceilingKey(root.getRightChild(), key);
	        }
	        
	        
	        INode<T, V> t = ceilingKey(root.getLeftChild(), key);
	        
	        if (t != null)
	            return t;
	        
	        return root;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		tree.clear();
	}

	@Override
	public boolean containsKey(T key) {
		// TODO Auto-generated method stub
		return tree.contains(key);
	}

	@Override
	public boolean containsValue(V value) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public Set<Entry<T, V>> entrySet() {
		// TODO Auto-generated method stub
	   Set<Map.Entry<T, V>> result = new LinkedHashSet<Map.Entry<T, V>>();
		
		inorderHelper(tree.getRoot() , result);
		
		return result;
	}
	
	private void inorderHelper(INode<T,V> root, Set<Map.Entry<T, V>> result) 
	{ 
	    if (root.isNull()) 
	        return; 
	    inorderHelper(root.getLeftChild(), result); 
	    result.add(new AbstractMap.SimpleEntry<T,V>(root.getKey(), root.getValue()) ); 
	    inorderHelper(root.getRightChild(), result); 
	} 

	@Override
	public Entry<T, V> firstEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T firstKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry<T, V> floorEntry(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T floorKey(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entry<T, V>> headMap(T toKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entry<T, V>> headMap(T toKey, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<T> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry<T, V> lastEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T lastKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry<T, V> pollFirstEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry<T, V> pollLastEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(T key, V value) {
		// TODO Auto-generated method stub
		
		if (key == null || value == null) {
			throw new RuntimeErrorException(null);
		}
		
		if (!tree.contains(key)) {
			size++;
		}
		
		tree.insert(key, value);
		
	}

	@Override
	public void putAll(Map<T, V> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(T key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
