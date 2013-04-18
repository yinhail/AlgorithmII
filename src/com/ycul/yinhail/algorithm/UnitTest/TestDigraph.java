/**
 * 
 */
package com.ycul.yinhail.algorithm.UnitTest;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ycul.yinhail.algorithm.Digraph;

/**
 * @author rlu
 *
 */
public class TestDigraph {

	private InputStream in; 
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		in = new FileInputStream("c:\\tt.txt");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCtor() {
		
		Digraph G = new Digraph(in);
		for (int v = 0; v < G.V(); v++)
			for (int w : G.adj(v))
				System.out.println(v + "->" + w);
		
	}

}
