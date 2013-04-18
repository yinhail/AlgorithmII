package com.ycul.yinhail.algorithm;

import java.util.Vector;

import org.junit.Assert;

public class BiPartiteVisitor implements IGraphVisitor {
	Graph _graph;
	
	private Vector<Integer> _color;
	
	BiPartiteVisitor(Graph g, Vector<Integer> color)
	{
		_graph = g;
		Assert.assertEquals(_graph.getNodeCount()> 0, true);
		_color = color;
	}
	@Override
	public void BeginVisit(int node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Visit(int node) {
		if (node == 0)
			return;
		// TODO Auto-generated method stub
		int candidateColor = -1;
		for (int ii = 0; ii < _graph.getNodeCount(); ii++)
		{
			if (_graph.hasEdge(ii, node) && isColored(ii))
			{
				if (candidateColor == -1)
					candidateColor = getReverseColor(_color.get(ii));
				else if (isColored(ii) && candidateColor != getReverseColor(_color.get(ii)))
				{
					candidateColor = -1;
					break;
				}
			}
		}
		_color.set(node, candidateColor);
		
	}
	private int getReverseColor(int color) {
		if (color == 0)
			return 1;
		if (color == 1)
			return 0;
		else
			return -1;
	}
	private boolean isColored(int node) {
		return _color.get(node) != -1;
	}

	@Override
	public void EndVisit(int node) {
		// TODO Auto-generated method stub
		
	}

}
