package com.java4u.ds.linkedhashmap;

public class CustomLinkedHashMap<K, V> {
	private int capacity = 4;
	private Entry<K, V>[] table;
	private Entry<K, V> header;
	private Entry<K, V> last;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before;
		Entry<K, V> after;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public CustomLinkedHashMap() {
		table = new Entry[capacity];
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(K newKey, V data) {
		if (newKey == null) {
			return;
		}
	}

	public boolean remove(K deletedKey) {
		if (deletedKey == null) {
			return false;
		}
		return false;
	}

	public V get(K key) {
		return null;
	}

	public void display() {

	}
}
