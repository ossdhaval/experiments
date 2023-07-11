package com.datastructure.linkedlist;

import com.datastructure.linkedlist.GenericNode;
import com.datastructure.linkedlist.GenericLinkedList;

public class UseGenericLinkedList 
{
	public static GenericLinkedList<String> gll = new GenericLinkedList<String>();
	public static GenericNode<String> gn = new GenericNode<String>("first");
	public static GenericNode<String> gn2 = new GenericNode<String>("second");
	
	public static GenericLinkedList<Integer> glli = new GenericLinkedList<Integer>();
	public static GenericNode<Integer> gni = new GenericNode<Integer>(Integer.valueOf(1));
	public static GenericNode<Integer> gni2 = new GenericNode<Integer>(Integer.valueOf(2));
	
	public static void main(String[] args)
	{
		gll.add(gn);
		gll.add(gn2);
		
		glli.add(gni);
		glli.add(gni2);
		
		
		System.out.println(gll.tail.val);
		System.out.println(gll.tail.next.val);
		
		System.out.println(glli.tail.val);
		System.out.println(glli.tail.next.val);
	}
}
