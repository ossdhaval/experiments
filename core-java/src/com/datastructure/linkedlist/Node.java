package com.datastructure.linkedlist;

public class Node 
{
	Node next = null;
	String data = null;
	/**
	 * @return the next
	 */
	
	public Node(String aData)
	{
		this.setData(aData);
	}
	
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
}
