/**
 * 
 */
package com.ycul.yinhail.algorithm.UnitTest;

import java.util.Vector;

import junit.framework.Assert;

import com.ycul.yinhail.algorithm.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ycul.yinhail.algorithm.Graph;

/**
 * @author rlu
 *
 */
public class TestCC {
	
	private Graph _graph;
	
	private CC _cc;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		_graph = new Graph(10);
		_graph.addEdge(2,3);
		_graph.addEdge(1, 4);
		_graph.addEdge(3, 4);
		_graph.addEdge(5, 6);
		_graph.addEdge(7,8);
		_graph.addEdge(6, 9);
		
		_cc = new CC(_graph);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ycul.yinhail.algorithm.CC#CC(com.ycul.yinhail.algorithm.Graph)}.
	 */
	@Test
	public void testCC() {
		
	}

	/**
	 * Test method for {@link com.ycul.yinhail.algorithm.CC#connected(int, int)}.
	 */
	@Test
	public void testConnected() {
		Assert.assertEquals(_cc.connected(1, 2), true);
		Assert.assertEquals(_cc.connected(1, 1), true);
		Assert.assertEquals(_cc.connected(5, 6), true);
		Assert.assertEquals(_cc.connected(7, 9), false);
	}

	/**
	 * Test method for {@link com.ycul.yinhail.algorithm.CC#count()}.
	 */
	@Test
	public void testCount() {
		Assert.assertEquals(_cc.count(), 4);
	}

	/**
	 * Test method for {@link com.ycul.yinhail.algorithm.CC#id(int)}.
	 */
	@Test
	public void testId() {
		Assert.assertEquals(_cc.id(1), 1);
		Assert.assertEquals(_cc.id(2), 1);
		Assert.assertEquals(_cc.id(5), 5);
		Assert.assertEquals(_cc.id(8) != 5,  true);
		Assert.assertEquals(_cc.id(0), 0);
	}
	
	@Test
	public void testGetCC()
	{
		Vector<Integer> result = _cc.getCC();
		Assert.assertEquals(result.get(0).intValue(), 0);
		Assert.assertEquals(result.get(1).intValue(), 1);
		Assert.assertEquals(result.get(2).intValue(), 5);
		Assert.assertEquals(result.get(3).intValue(), 7);
	}
}
