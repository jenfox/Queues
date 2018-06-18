package com.amex.demo.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.amex.demo.queues.SimpleLIFOQueue;

public class SimpleLIFOQueueTest {

	@Test
	public void testGetQueueName() {
		// fail("Not yet implemented");
	}

	@Test
	public void testSimpleQueue() {
	}

	@Test
	public void testAdd() {
		SimpleLIFOQueue sq = new SimpleLIFOQueue();
		String testObj = "Test!";
		sq.add(testObj);
		assertTrue(sq.element().equals(testObj));
	}

	@Test
	public void testRemove() {
		SimpleLIFOQueue sq = new SimpleLIFOQueue();
		String testObj = "Test!";
		sq.add(testObj);

		assertTrue(sq.remove().equals(testObj));
		assertTrue("".equals(sq.element()));
	}

	@Test
	public void testElement() {
		SimpleLIFOQueue sq = new SimpleLIFOQueue();
		String testObj = "Test!";
		sq.add(testObj);

		assertTrue(sq.element().equals(testObj));
	}

}
