package com.datastructure;

public class MyMapEntry<K,V>
{
	private K key;
	private V value;
	private MyMapEntry<K, V> next;
	
	public MyMapEntry(K aKey, V aValue)
	{
		key = aKey;
		value = aValue;
		next=null;
	}
	/**
	 * @return the next
	 */
	public MyMapEntry<K, V> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(MyMapEntry<K, V> next) {
		this.next = next;
	}
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	
}
