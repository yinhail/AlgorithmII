/**
 * 
 */
package com.ycul.yinhail.algorithm;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/**
 * @author rlu
 *
 */
public class Digraph {
	
	private int V = 0;
	
	public Digraph(int V){
		V = 0;
	}
	
	public Digraph(InputStream in) 
	{
		byte[] buffer = new byte[10];
		try {
			in.read(buffer, 0, 10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		V = Integer.parseInt(buffer.toString());
	}
	
	public void addEdge(int v, int w){}
	
	public int V()
	{
		return 0;
	}
	
	public int E()
	{
		return 0;
	}
	
	public Vector<Integer> adj(int v)
	{
		return null;
	}
	
	public void reverse()
	{
	}
	
	public String toString()
	{
		return "";
	}
	

}
