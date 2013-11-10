package com.datastructure;

public class MyHashMap<K,V> 
{
	private MyMapEntry<K,V>[] buckets = new MyMapEntry[15];
	
	private int bucketSize;
	
	private int findBucket(K key)
	{
		return ( key.hashCode()%bucketSize);
	}
	
	public V get(K key)
	{
		int bucket = findBucket(key);
		MyMapEntry<K, V> currEntry = buckets[bucket];
		if(currEntry.getKey()!=key && currEntry.getNext()!=null  )
			currEntry = currEntry.getNext();
		
		if(currEntry.getKey()==key)
			return currEntry.getValue();
		else
			return null;
	}
	
	public void set(K key, V value)
	{
		int bucket = findBucket(key);
		MyMapEntry<K, V> currEntry = buckets[bucket];
		
		if(currEntry==null)
		{
			currEntry=new MyMapEntry(key, value);
		}
		else
		{
			while(currEntry.getKey() != key && currEntry.getNext()!=null)
			{
				currEntry=currEntry.getNext();
			}
			if(currEntry.getKey() == key)
			{
				currEntry.setValue(value);
			}
			else
			{
				currEntry.setNext(new MyMapEntry<MyHashMap.K, MyHashMap.V>(key, value));
			}
			
		}
	}
	
}
