package DiGraph_A5;

public class main {
	public static void main (String[] args) {
		  
	      // thorough testing is your responsibility
	      //
	      // you may wish to create methods like 
	      //    -- print
	      //    -- sort
	      //    -- random fill
	      //    -- etc.
	      // in order to convince yourself your code is producing
	      // the correct behavior
	      exTest();
	    }
	  
	    public static void exTest(){
	      DiGraph d = new DiGraph();
	      d.addNode(1, "f");
	      //System.out.println(d.addNode(1, "e"));
	      d.addNode(3, "s");
	      d.addNode(7, "t");
	      d.addNode(0, "fo");
	      d.addNode(4, "fi");
	      d.addNode(6, "si");
	      
	      
	      d.addEdge(0, "f", "s", 0, null);
	      d.addEdge(1, "f", "si", 0, null);
	      d.addEdge(1, "f", "si", 0, null);
	      d.addEdge(5, "fo", "si", 0, null);
	      d.addEdge(2, "s", "t", 0, null);
	      d.addEdge(3, "fo", "fi", 0, null);
	      d.addEdge(4, "fi", "si", 10, null);
	      //System.out.println("numEdges: "+d.numEdges());
	      //System.out.println("numNodes: "+d.numNodes());
	      System.out.println(d.getNodes().values());
	      System.out.println(d.getStartMap().values());
	      System.out.println(d.getEndMap().values());
	      //d.delNode("fa");
	      //System.out.println(d.delNode("f"));
	      d.shortestPath("f");
	    }
}
