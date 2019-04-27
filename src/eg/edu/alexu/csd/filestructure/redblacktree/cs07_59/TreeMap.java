package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.management.RuntimeErrorException;
import eg.edu.alexu.csd.filestructure.redblacktree.INode;
import eg.edu.alexu.csd.filestructure.redblacktree.IRedBlackTree;
import eg.edu.alexu.csd.filestructure.redblacktree.ITreeMap;

public class TreeMap <T extends Comparable<T>, V> implements ITreeMap<T, V>{
	
	IRedBlackTree<T,V> tree = new RedBlackTree<T,V>();
	private int size = 0;	
	
	@Override
	public Map.Entry<T,V> ceilingEntry(T key) {
		// TODO Auto-generated method stub
		if (key == null) {
			throw new RuntimeErrorException(null);
		}
		Iterator<Map.Entry<T, V>> it = entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<T, V> entry = it.next();
			if (entry.getKey().compareTo(key) > 0 || entry.getKey().compareTo(key) == 0) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public T ceilingKey(T key) {
		// TODO Auto-generated method stub
		if (key == null) {
			throw new RuntimeErrorException(null);
		}   
		Map.Entry<T, V> entry = ceilingEntry(key);
		if (entry == null) {
			return null;
		}
        return entry.getKey();
	}

	

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		tree.clear();
		size = 0;
	}

	@Override
	public boolean containsKey(T key) {
		// TODO Auto-generated method stub
		return tree.contains(key);
	}

	@Override
    public boolean containsValue(V value) {
        // TODO Auto-generated method stub
		if (value == null) {
			throw new RuntimeErrorException(null);
		}
        Iterator<Map.Entry<T, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<T, V> entry = it.next();
            if ( entry.getValue().equals(value) ) {
                return true;
            }
        }
        return false;
    }
	@Override
	public Set<Map.Entry<T, V>> entrySet() {
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
	public Map.Entry<T, V> firstEntry() {
		// TODO Auto-generated method stub
		if (tree.isEmpty()) {
			return null;
		}
		Iterator<Map.Entry<T, V>> it = entrySet().iterator();
		Map.Entry<T, V> entry = it.next();
		return entry;
	}

	@Override
	public T firstKey() {
		// TODO Auto-generated method stub
		if (tree.isEmpty()) {
			return null;
		}
		return firstEntry().getKey();
	}

	@Override
    public Map.Entry<T, V> floorEntry(T key) {
        // TODO Auto-generated method stub
		if (key == null) {
	            throw new RuntimeErrorException(null);
	    }
		if (tree.isEmpty()) {
			return null;
		}
		
        Iterator<Map.Entry<T, V>> it = entrySet().iterator();
        Map.Entry<T, V> entry = null;
		while (it.hasNext()) {
			Map.Entry<T, V> entry2 = it.next();
			if (entry2.getKey().compareTo(key) > 0)
				break;
			entry = new AbstractMap.SimpleEntry<T, V>(entry2.getKey(), entry2.getValue());
		}
        return entry;
    }

	@Override
	public T floorKey(T key) {
		// TODO Auto-generated method stub
		if (key == null) {
			throw new RuntimeErrorException(null);
		}   
		Map.Entry<T, V> entry = floorEntry(key);
		if (entry == null) {
			return null;
		}
        return entry.getKey();
	}

	@Override
    public V get(T key) {
        // TODO Auto-generated method stub
        return tree.search(key);
    }

	@Override
	public ArrayList<Map.Entry<T, V>> headMap(T toKey) {
		// TODO Auto-generated method stub
		if (toKey == null) {
			throw new RuntimeErrorException(null);
		}
		
		ArrayList<Map.Entry<T, V>> res = new ArrayList<>();
		
		Iterator<Map.Entry<T, V>> it = entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<T, V> entry = it.next();
			if (entry.getKey().compareTo(toKey) < 0) {
				res.add(entry);
			} else {
				break;
			}
		}
		
		if (res.size() == 0)
			return null;
		
		return res;
	}

	@Override
    public ArrayList<Map.Entry<T, V>> headMap(T toKey, boolean inclusive) {
        // TODO Auto-generated method stub
        if (toKey == null) {
            throw new RuntimeErrorException(null);
        }
        
        if (!inclusive) {
        	return headMap(toKey);
        }
        ArrayList<Map.Entry<T, V>> res = new ArrayList<>();

        Iterator<Map.Entry<T, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<T, V> entry = it.next();
            if (entry.getKey().compareTo(toKey) <= 0) {
                res.add(entry);
            }else
                break;
        }

        if (res.size() == 0)
            return null;

        return res;
    }

	@Override
	public Set<T> keySet() {
		// TODO Auto-generated method stub
		if (tree.isEmpty()) {
			throw new RuntimeErrorException(null);
		}
		
		Iterator<Map.Entry<T, V>> it = entrySet().iterator();
		Set<T> set = new LinkedHashSet<>();
		while (it.hasNext()) {
			Map.Entry<T, V> entry = it.next();
			set.add(entry.getKey());
		}
		return set;
	}

	@Override
    public Map.Entry<T, V> lastEntry() {
        // TODO Auto-generated method stub
        Iterator<Map.Entry<T, V>> it = entrySet().iterator();
        Map.Entry<T, V> last = null;
        while (it.hasNext()) {
            last = it.next();

        }
        return last;

    }

	@Override
	public T lastKey() {
		// TODO Auto-generated method stub
		Map.Entry<T, V> entry = lastEntry();
		if (entry == null) {
			return null;
		}
        return entry.getKey();
	}

	@Override
	public Map.Entry<T, V> pollFirstEntry() {
		// TODO Auto-generated method stub
		Map.Entry<T, V> entry = firstEntry();
		if (entry == null) {
			return null;
		}
		remove(entry.getKey());
		return entry;
	}

	@Override
	public Map.Entry<T, V> pollLastEntry() {
		// TODO Auto-generated method stub
		Map.Entry<T, V> entry = lastEntry();
		if (entry == null) {
			return null;
		}
		remove(entry.getKey());
		return entry;
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
		if (map == null) {
			throw new RuntimeErrorException(null);
		}
		if (map.size() == 0) {
			throw new RuntimeErrorException(null);
		}
		if (map.isEmpty()) {
			throw new RuntimeErrorException(null);
		}
		for (Map.Entry<T, V> entry : map.entrySet()) {
		   put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public boolean remove(T key) {
		// TODO Auto-generated method stub
		if (key == null) {
			throw new RuntimeErrorException(null);
		}
		
		if (tree.delete(key)) {
			size--;
			return true;
		}
		
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
    public Collection<V> values() {
        // TODO Auto-generated method stub
        Collection<V> collection = new ArrayList<V>();
        Iterator<Map.Entry<T, V>> it = entrySet().iterator();
        Map.Entry<T, V> last;
        while (it.hasNext()) {
            last = it.next();
            collection.add(last.getValue());
        }
        return collection;
    }

}
