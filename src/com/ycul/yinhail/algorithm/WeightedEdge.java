package com.ycul.yinhail.algorithm;

public class WeightedEdge
{
	private	int v;
	private int w;
	private int weight;
	public WeightedEdge(int v, int w, int weight)
	{
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	public int either() { return v;}
	public int other(int vv) throws Exception
	{
		if (vv == v)
			return w;
		else if (vv == w)
			return v;
		throw new Exception("the input is not a vertex of the edge");
	}
	
	public int getWeight()
	{
		return weight;
	}
	
}