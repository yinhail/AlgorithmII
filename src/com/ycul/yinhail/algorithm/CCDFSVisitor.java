package com.ycul.yinhail.algorithm;

import java.util.HashMap;

final class CCDFSVisitor implements IGraphVisitor
{

	private ConnectedComponent _cc;
	
	private HashMap<Integer, Integer> _nodeIdMap;
	
	public CCDFSVisitor(ConnectedComponent cc, HashMap<Integer, Integer> nodeIdMap) {
		super();
		_cc = cc;
		_nodeIdMap = nodeIdMap;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BeginVisit(int node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Visit(int node) {
		// TODO Auto-generated method stub
		_cc.add(node);
		_nodeIdMap.put(node, _cc.Id());	
	}

	@Override
	public void EndVisit(int node) {
		// TODO Auto-generated method stub
		
	}
	
}