package com.datastructure.linkedlist;

public class FindMiddle 
{
	
	static MyLinkedList ml = null;
	
	public static void main(String[] args)
	{
		ml = new MyLinkedList();
		ml.addNode("first");
		ml.addNode("second");
		ml.addNode("middle");
		ml.addNode("fourth");
		ml.addNode("fifth");
		
		Node oneStep = ml.mHead;
		Node twoStep = ml.mHead;
		
		while(twoStep.getNext()!= null)
		{
			oneStep = oneStep.getNext();
			twoStep = twoStep.getNext().getNext();
		}
		
		System.out.println(oneStep.getData());
	}
	
	

}
