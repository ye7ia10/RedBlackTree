package eg.edu.alexu.csd.filestructure.redblacktree.cs07_59;

public class tester {
	public static void main(String[] args) {
		RedBlackTree tree = new RedBlackTree<>();
		/*tree.insert(7,2); 
	    tree.insert(6,3); 
	    tree.insert(5,3); 
	    tree.insert(4,3); 
	    tree.insert(3,2); 
	    tree.insert(2,5); 
	    tree.insert(1,7); */
		tree.insert("soso", "toto");
		//System.out.println(tree.getRoot().getValue());
		//System.out.println(tree.getRoot().getColor());
		tree.clear();
		tree.insert("soso", "toto");
		tree.insert("toto", "toto");
	    tree.insert("fofo", "toto");
	    tree.insert("koko", "toto");
		System.out.println(tree.getRoot().getColor());
	}
}
