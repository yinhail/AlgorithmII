package com.ycul.yinhail.algorithm;

import java.util.Iterator;
import java.util.Vector;

enum  Color
{
	Gray,
	Black;
}
public class MST
{
	private Vector<WeightedEdge> tree = new Vector<WeightedEdge>();
	
	public MST(WeightedEdgeGraph g)
	{
		if (g.V() == 0)
			return;
		Color[] color = new Color[g.V()];
		for (int ii = 0; ii < g.V(); ii++)
			color[ii] = Color.Gray;
		
		color[0] = Color.Black;
		while(grayVertexExists(g, color))
		{
			WeightedEdge ce = findCrossEdge(g, color);
			color[ce.either()] = Color.Black;
			try {
				color[ce.other(ce.either())] = Color.Black;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tree.add(ce);
		}
	}
	
	private boolean grayVertexExists(WeightedEdgeGraph g, Color[] color) {
		for (int ii = 0; ii < g.V(); ii++)
		{
			if (color[ii] == Color.Gray)
				return true;
		}
				return false;
	}
	private WeightedEdge findCrossEdge(WeightedEdgeGraph g, Color[] color) {
		int minWeight = Integer.MAX_VALUE;
		WeightedEdge crossEdge = null;
		for (int ii = 0; ii < g.V(); ii++)
		{
			Iterator<WeightedEdge> iter= g.getIterator(ii);
			while ( iter.hasNext())
			{
				WeightedEdge e = iter.next();
				int w;
				try {
					w = e.other(ii);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					continue;
				}
				if (color[w] == color[ii])
					continue;
				if (e.getWeight() < minWeight)
				{
					crossEdge = e;
					minWeight = e.getWeight();
				}
			}
		}
		return crossEdge;
	}
	public void outputEdges()
	{
		for (int ii =0; ii < tree.size(); ii++)
		{
			int either = tree.get(ii).either();
			try {
				System.out.print(either + "  " + tree.get(ii).other(either));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
	
	public int getTotalWeight()
	{
		int total = 0;
		for (int ii = 0; ii < tree.size(); ii++)
			total += tree.get(ii).getWeight();
		return total;
	}
}