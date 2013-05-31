package com.ycul.yinhail.algorithm;

import java.util.Iterator;


public class WeightedEdgeGraph {
	public WeightedEdgeGraph(int v)
	{
		V = v;
		adjs = new EdgeBag[V];
		for (int ii = 0; ii < V; ii++)
			adjs[ii] = new EdgeBag();
	}
	
	public void AddEdge(int v, int w, int weight)
	{
		WeightedEdge e = new WeightedEdge(v, w, weight);
		adjs[v].addEdge(e);
		adjs[w].addEdge(e);
	}
	
	public int V() {
		return V;
	}
	
	public Iterator<WeightedEdge> getIterator(int v)
	{
		return adjs[v].getIterator();
	}
	
	private int V;
	private EdgeBag[] adjs;

}