package com.ycul.yinhail.algorithm;

import java.util.HashMap;
import java.util.Vector;

final class ConnectedComponent
{
	private int _id;
	private Vector<Integer> _nodes = new Vector<Integer>();
	
	ConnectedComponent(int id)
	{
		_id = id;
	}
	
	public int Id()
	{
		return _id;
	}
	
	public int get(int index)
	{
		return _nodes.get(index);
	}
	
	public void add(int node)
	{
		_nodes.add(node);
	}
}

public class CC {
	private Vector<ConnectedComponent> _ccList = new Vector<ConnectedComponent>();
	private HashMap<Integer, Integer> _nodeIdMap = new HashMap<Integer, Integer>();
	
	private void parseGraph(Graph graph) {
		_ccList = new Vector<ConnectedComponent>();
		
		for (int node = 0; node < graph.getNodeCount(); node++)
		{
			if (id(node) >= 0)
				continue;
			
			ConnectedComponent cc = new ConnectedComponent(node);
			_ccList.add(cc);
			
			IGraphVisitor vis = new CCDFSVisitor(cc, _nodeIdMap);
			graph.DepthFirstSearch(node, vis);
		}
	}
	public CC(Graph g)
	{
		parseGraph(g);
	}
	
	public boolean connected(int v, int w)
	{
		return id(v) == id(w);
	}
	
	public int count()
	{
		return _ccList.size();
	}
	
	public int id(int node)
	{
		if (_nodeIdMap == null)
			return -1;
		 Integer id = _nodeIdMap.get(node);
		 if (id == null)
			 return -1;
		 return id;
	}
	
	public Vector<Integer> getCC()
	{
		Vector<Integer> result = new Vector<Integer>();
		for (int ii = 0; ii < _ccList.size(); ii++)
			result.add(_ccList.get(ii).Id());
		
		return result;
	}
	
	//


}
