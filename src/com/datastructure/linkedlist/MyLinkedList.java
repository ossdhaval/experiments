package com.datastructure.linkedlist;

public class MyLinkedList 
{
	Node mHead = null;
	Node mTail = null;
	
	public void addNode(String aData)
	{
		
		if(mHead == null)
		{
			mHead = new Node(aData);
			mTail = mHead;
		}
		else
		{
			mTail.setNext(new Node(aData));
			mTail = mTail.getNext();
		}
	}
}
