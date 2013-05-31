package com.ycul.yinhail.algorithm.UnitTest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ycul.yinhail.algorithm.MST;
import com.ycul.yinhail.algorithm.WeightedEdgeGraph;

public class TestMST {

	private MST mst;
	WeightedEdgeGraph g;
	@Before
	public void setUp() throws Exception {
		g = new WeightedEdgeGraph(4);
		g.AddEdge(0, 1, 8);
		g.AddEdge(0, 2, 4);
		g.AddEdge(1, 3, 2);
		g.AddEdge(2, 3, 1);
	}

	@After
	public void tearDown() throws Exception {
		g = null;
		mst = null;
	}

	@Test
	public void testMST() {
		mst = new MST(g);
		
		Assert.assertEquals(7, mst.getTotalWeight());
	}

	@Test
	public void testOutputEdges() {
		mst.outputEdges();
	}

}
