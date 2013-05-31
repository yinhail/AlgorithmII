package com.ycul.yinhail.algorithm;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;

public class EdgeBag
{
	private Vector<WeightedEdge> edges = new Vector<WeightedEdge>();
	
	public WeightedEdge getEdge(int v) throws NoSuchElementException
	{
		for (int ii = 0; ii < edges.size(); ii++)
		{
			WeightedEdge e = edges.get(ii);
			try {
				if (e.either() == v || e.other(e.either()) == v)
					return e;
			} catch (Exception exception) {
				
			}
		}
		throw new NoSuchElementException("There is no edge with vertex as v");
	}
	
	public void addEdge(WeightedEdge e)
	{
		edges.add(e);
	}
	
	public Iterator<WeightedEdge> getIterator()
	{
		return edges.iterator();
	}
	
}