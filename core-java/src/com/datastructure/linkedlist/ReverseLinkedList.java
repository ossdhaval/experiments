package com.datastructure.linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList 
{
	public static MyLinkedList ml = new MyLinkedList();
	public static void main(String[] args)
	{
		ml.addNode("first");
		ml.addNode("second");
		ml.addNode("third");
		ml.addNode("fourth");
		ml.addNode("fifth");
		
		Node curr = ml.mHead;
		while(curr !=null)
		{
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
				
		System.out.println("=======================");
		reverseIt(ml.mHead, ml.mHead.getNext());
		
		Node rev = ml.mHead;
		while(rev !=null)
		{
			System.out.println(rev.getData());
			rev = rev.getNext();
		}
		
		
	}
	
	public static void reverseIt(Node aPrevEle, Node aCurrEle)
	{
		Node prevEle = aPrevEle;
		prevEle.setNext(null); // this will help set next pointer of last node to null when list is reversed
		
		Node currEle = aCurrEle;
		if(currEle.getNext() != null)
		{
			reverseIt(currEle, currEle.getNext());
		}
		else
		{
			ml.mHead = currEle;
		}
		
		currEle.setNext(prevEle);
	}
}
