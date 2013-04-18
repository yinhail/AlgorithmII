/**
 * 
 */
package com.ycul.yinhail.algorithm;

/**
 * @author rlu
 *
 */
public interface IGraphVisitor {
	public void BeginVisit(int node);
	
	public void Visit(int node);
	
	public void EndVisit(int node);

}
