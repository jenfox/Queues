package com.amex.demo.queues;

import javax.jms.JMSException;
import javax.jms.Queue;

/**
 * FIFO Queue
 */
public class SimpleFIFOQueue implements Queue {

	private final int DEFAULT_SIZE = 10;
	private String[] queue;
	private int tail;

	@Override
	public String getQueueName() throws JMSException {
		return null;
	}

	public SimpleFIFOQueue() {
		super();
		this.queue = new String[DEFAULT_SIZE];
		tail = 0;
	}

	public void add(String e) {
		ensureSize();
		queue[tail++] = e;
	}

	public String remove() {
		if (tail > 0)
			return queue[--tail];
		else
			throw new IllegalStateException("Nothing to remove from queue");
	}

	public String element() {
		if (tail > 0)
			return queue[tail - 1];
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
