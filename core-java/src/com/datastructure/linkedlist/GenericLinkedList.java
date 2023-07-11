package com.datastructure.linkedlist;

import com.datastructure.linkedlist.GenericNode;

public class GenericLinkedList<T>
{
	
	GenericNode<T> head = null;
	GenericNode<T> tail = null;

	public boolean add(GenericNode<T> newNode)
	{
		if( head == null )
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			head.next = newNode;
			head = newNode;
		}
		return true;
	}
	
}
