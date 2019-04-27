package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class tester {
	public static void main(String[] args) {
		RedBlackTree tree = new RedBlackTree<>();
		/*tree.insert(16,2); 
	   tree.insert(16,3); 
	    tree.insert(17,30); 
	    tree.insert(12,77); 
	    tree.insert(3,24); 
	    tree.insert(2,5); 
	    tree.insert(1,7); */
		/*tree.insert("soso", "toto");
		//System.out.println(tree.getRoot().getValue());
		//System.out.println(tree.getRoot().getColor());
		//tree.clear();
		tree.insert("soso", "toto");
		tree.insert("toto", "toto");
	    tree.insert("fofo", "toto");
	    tree.insert("koko", "toto");
	    tree.search("koko");
	    tree.delete("fofo");
	    //tree.delete("toto");*/
	    /*tree.delete(16);
	    tree.delete(17);
	    tree.delete(12);
	    tree.delete(3);*/
	    //tree.delete(2);
	    //tree.delete(1);
	    //tree.insert(3, 55);
		tree.insert(1, 1);
		tree.insert(2, 1);
		tree.insert(3, 1);
		tree.insert(4, 1);
		tree.insert(5, 1);
		tree.insert(6, 1);
		tree.insert(7, 1);
		tree.insert(8, 1);
		tree.insert(9, 1);
		tree.insert(10, 1);
		System.out.println("root" + tree.getRoot().getKey());
		tree.delete(1);
		tree.delete(2);
		tree.delete(3);
		tree.delete(4);
		tree.delete(5);
		tree.delete(6);
		tree.delete(7);
		//tree.delete(11);
		tree.delete(8);
		tree.delete(9);
		tree.delete(10);
		
		//tree.delete(1);
		System.out.println("**************************");
		tree.inorderHelper(tree.getRoot());
		
		System.out.println("--------------------------------------------------");
		TreeMap treeMap = new TreeMap<>();
		treeMap.put(1, 2);
		treeMap.put(3, 4);
		treeMap.put(5, 3);
		treeMap.put(7, 8);
		treeMap.put(5, 10);
		System.out.println(treeMap.ceilingKey(8));
		System.out.println(treeMap.entrySet());
		System.out.println(treeMap.size());
		
		Map<Integer , Integer> map = new HashMap<>();
		map.put(10, 10);
		map.put(20, 20);
		map.put(30, 30);
		map.put(40, 40);
		treeMap.putAll(map);
		System.out.println(treeMap.size());
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.keySet());
		/*Set<Map.Entry<Integer, Integer>> map = new TreeSet<>(Map.Entry.comparingByKey());
		map.add(new AbstractMap.SimpleEntry<Integer, Integer> (3,4));
		map.add(new AbstractMap.SimpleEntry<Integer, Integer> (5,3));
		map.add(new AbstractMap.SimpleEntry<Integer, Integer> (7,8));
		map.add(new AbstractMap.SimpleEntry<Integer, Integer> (9,10));
		map.add(new AbstractMap.SimpleEntry<Integer, Integer> (1,2));*/
		//System.out.println(map);
		
		
		
	
}
}