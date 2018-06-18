package com.amex.demo.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.amex.demo.queues.SimpleFIFOQueue;

public class SimpleFIFOQueueTest {

	@Test
	public void testGetQueueName() {
		// fail("Not yet implemented");
	}

	@Test
	public void testSimpleQueue() {
	}

	@Test
	public void testAdd() {
		SimpleFIFOQueue sq = new SimpleFIFOQueue();
		String testObj = "Test!";
		sq.add(testObj);
		assertTrue(sq.element().equals(testObj));
	}

	@Test
	public void testRemove() {
		SimpleFIFOQueue sq = new SimpleFIFOQueue();
		String testObj = "Test!";
		sq.add(testObj);

		assertTrue(sq.remove().equals(testObj));
		assertTrue(sq.element().equals(""));
	}

	@Test
	public void testElement() {
		SimpleFIFOQueue sq = new SimpleFIFOQueue();
		String testObj = "Test!";
		sq.add(testObj);

		assertTrue(sq.element().equals(testObj));
	}

}
