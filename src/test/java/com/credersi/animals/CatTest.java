package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test
	public void feedCat() {
		Cat cat = new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	@Test
	public void runCat() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	@Test
	public void feedCatThenRunCat() {
		Cat cat = new Cat();
		cat.feeds();
		cat.runs();
		assertEquals(cat.howHungry(), 60);
	}
	@Test
	public void catDiedOnce() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assert(cat.isAlive() == true);
	}
	@Test
	public void deadCat() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		//dead count 1
		cat.runs();
		cat.runs();
		//dead count 2
		cat.runs();
		cat.runs();
		//dead count 3
		cat.runs();
		cat.runs();
		//dead count 4
		cat.runs();
		cat.runs();
		//dead count 5
		cat.runs();
		cat.runs();
		//dead count 6
		cat.runs();
		cat.runs();
		//dead count 7
		cat.runs();
		cat.runs();
		//dead count 8
		cat.runs();
		cat.runs();	
		//dead count 9
		assert(cat.isAlive() == false);
	}
}