package com.ycul.yinhail.algorithm;

import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World.");
		Graph g = new Graph(7);
		g.addEdge(0,1);
		g.addEdge(0, 2);
		g.addEdge(0, 5);
		g.addEdge(0, 6);
		g.addEdge(1,3);
		g.addEdge(2, 3);
		g.addEdge(2,4);
		g.addEdge(4,5);
		g.addEdge(4, 6);
		Vector<Integer> color = new Vector<Integer>();
		color.add(1);
		for (int ii = 1; ii < g.getNodeCount(); ii++)
			color.add(-1);
		BiPartiteVisitor vis = new BiPartiteVisitor(g, color);
	    g.BreadthFirstSearch(0, vis);
	    for (int ii = 0; ii < g.getNodeCount(); ii++)
	    {
	    	System.out.println(color.get(ii));
	    }
	    
	    //CC cc = new CC(g);
	    //System.out.println(cc.connected(1, 3));
	   // System.out.println(cc.connected(6,2));
	    //System.out.println(cc.id(2));
	    //System.out.println(cc.id(1));
	    
	    
	}

}
