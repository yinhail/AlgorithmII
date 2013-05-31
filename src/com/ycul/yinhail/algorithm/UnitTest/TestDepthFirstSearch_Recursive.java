package com.ycul.yinhail.algorithm.UnitTest;

import com.ycul.yinhail.algorithm.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestDepthFirstSearch_Recursive {

	private Graph _graph;
	private TopologicalSortDFSVisitor _visitor;
	
	@Before
	public void setUp() throws Exception {
		_graph = new Graph(10);
		_graph.addEdge(0,1);
		_graph.addEdge(0,2);
		_graph.addEdge(0, 5);
		_graph.addEdge(3, 4);
		_graph.addEdge(3, 2);
		_graph.addEdge(3,5);
		_graph.addEdge(3, 6);
		_graph.addEdge(5,2);
		_graph.addEdge(1,4);
		_graph.addEdge(6, 4);
		_graph.addEdge(6, 0);
		
		_visitor = new TopologicalSortDFSVisitor();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDepthFirstSearch_Recursive() {

		int[] mark = new int[7];
		for (int ii = 0; ii < 7; ii++)
			_graph.DepthFirstSearch_Recursive(ii, _visitor, mark);
		Integer[] expected = {4,1,2,5,0,6,3};
		Integer[] actuals = new Integer[7];
		_visitor.stack.toArray(actuals);
 		Assert.assertArrayEquals(expected, actuals);
	}

}
