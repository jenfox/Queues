package com.amex.demo.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * LIFO Queue Implementation
 * 
 * @param <T>
 */
public class MyQueue<T> implements Queue<T> {

	private T[] items;
	private int tail;
	private final int INITIAL_CAPACITY = 10;

	@SuppressWarnings("unchecked")
	public MyQueue() {
		super();
		tail = 0;
		items = (T[]) new Object[INITIAL_CAPACITY];
	}

	@SuppressWarnings("unchecked")
	private void doubleCapacity() {
		System.out.println("Doubling capacity from " + items.length + " -> " + (int) (items.length * 1.5));

		T[] tempArray = (T[]) new Object[(int) (items.length * 1.5)];
		for (int i = 0; i < items.length; i++) {
			tempArray[i] = items[i];
		}
		items = tempArray;
	}

	private boolean checkCapacity(T[] adding) {
		return adding.length < items.length - tail;
	}

	private void ensureCapacity(T[] adding) {
		while (!checkCapacity(adding)) {
			doubleCapacity();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(Collection<? extends T> c) {
		ensureCapacity(c.toArray((T[]) new Object[0]));

		for (T item : c) {
			items[++tail] = item;
		}
		return true;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
