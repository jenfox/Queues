package com.amex.demo.queues;

import javax.jms.JMSException;
import javax.jms.Queue;

/**
 * LIFO Queue
 */
public class SimpleLIFOQueue implements Queue {

	private final int DEFAULT_SIZE = 10;
	private String[] queue;
	// Tail points to next available spot
	private int tail;

	@Override
	public String getQueueName() throws JMSException {
		return null;
	}

	public SimpleLIFOQueue() {
		super();
		this.queue = new String[DEFAULT_SIZE];
		tail = 0;
	}

	public void add(String e) {
		ensureSize();
		queue[tail++] = e;
	}

	public String remove() {
		if (tail > 0) {

			String tmp = queue[0];

			// shift all the elements down
			for (int i = 0; i < tail; i++) {
				queue[i] = queue[i + 1];
			}
			tail--;
			return tmp;

		} else
			throw new IllegalStateException("Nothing to remove from queue");
	}

	public String element() {
		if (tail > 0)
			return queue[0];
		else
			return "";
	}

	private void ensureSize() {

		// queue full
		if (tail == queue.length - 1) {

			// replace with logging
			System.out.println("Doubling Queue Size");

			String[] tempQ = new String[queue.length * 2];

			// copy into new array 2X size
			for (int i = 0; i < queue.length; i++)
				tempQ[i] = queue[i];
			queue = tempQ;

			// gently request some Java Garbage Collection on old array
			System.gc();
		}
	}
}
