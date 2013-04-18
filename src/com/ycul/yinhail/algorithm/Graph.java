package com.ycul.yinhail.algorithm;

import java.util.*;

public class Graph {
	private VertexNode[] _nodeList;
	private int _vCnt;
	
	public Graph(int v)
	{
		_vCnt = v;
		_nodeList = new VertexNode[v];
		for (int ii = 0; ii < _vCnt; ii++)
			_nodeList[ii] = new VertexNode();
	}
	
	public void addEdge(int v, int w)
	{
		_nodeList[v].adj.add(w);
		_nodeList[w].adj.add(v);
	}
	
	public boolean hasEdge(int v, int w)
	{
		if (v >= getNodeCount() || v < 0)
			return false;
		
		if (w >= getNodeCount() || w < 0)
			return false;
		
		for (int ii = 0; ii < _nodeList[v].adj.size(); ii++)
			if (_nodeList[v].adj.get(ii) == w)
				return true;
		return false;
	}
	
	public void DepthFirstSearch(int s, IGraphVisitor vis)
	{
		Stack<Integer> nodeStack = new Stack<Integer>();
		nodeStack.push(s);
		int[] mark = new int[getNodeCount()];
		
		dfs(vis, mark, nodeStack);
	}
	private void dfs(IGraphVisitor vis, int []mark, Stack<Integer> stack )
	{
		while(!stack.empty())
		{
			int s = stack.pop();
			mark[s]= 1;
			vis.Visit(s);
			for (int ii = 0; ii < _nodeList[s].adj.size(); ii++)
			{
				int connectedNode = _nodeList[s].adj.get(ii);
				if (!visited(mark, connectedNode))
					stack.push(connectedNode);
			}
		}
	}

	public void BreadthFirstSearch(int s, IGraphVisitor vis)
	{
		Deque<Integer> nodeQueue = new ArrayDeque<Integer>();
		nodeQueue.add(s);
		int[] mark = new int[getNodeCount()];
		
		bfs(vis, mark, nodeQueue);		
	}
	
	private void bfs(IGraphVisitor vis, int[] mark, Deque<Integer> queue)
	{
		while(!queue.isEmpty())
		{
			int s = queue.poll();
			mark[s]= 1;
			vis.Visit(s);
			for (int ii = 0; ii < _nodeList[s].adj.size(); ii++)
			{
				int connectedNode = _nodeList[s].adj.get(ii);
				if (!visited(mark, connectedNode))
					queue.addLast(connectedNode);
			}
		}
	}
	
	private boolean visited(int[] mark, int ii) {
		return mark[ii] == 1;
	}

	public int getNodeCount() {
		return _vCnt;
	}
	
	public boolean isBiPartite()
	{
		return false;
	}
}
