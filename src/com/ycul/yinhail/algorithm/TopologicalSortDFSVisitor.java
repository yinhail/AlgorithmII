package com.ycul.yinhail.algorithm;

import java.util.Deque;
import java.util.Vector;

public class TopologicalSortDFSVisitor  implements IGraphVisitor {

	public Vector<Integer> stack;
	
	public TopologicalSortDFSVisitor()
	{
		stack = new Vector<Integer>();
	}
	
	@Override
	public void BeginVisit(int node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void Visit(int node) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void EndVisit(int node) {
		// TODO Auto-generated method stub
		stack.add(node);		
	}

	@Override
	public void Output() {
		// TODO Auto-generated method stub
		for(int ii = stack.size()-1; ii >=0; ii--)
		{
			System.out.print(stack.toArray());
		}
		
	}

}
