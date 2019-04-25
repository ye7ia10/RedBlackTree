package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

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
	
}
}