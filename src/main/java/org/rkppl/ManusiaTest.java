package org.rkppl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManusiaTest {
	private Manusia manusia;

	@Before
	public void startTesting() {
		manusia = new Manusia();
		System.out.println("Start Testing");
	}

	@Test
	public void testNama() {
		manusia.setNama("Jayanudin");
		assertNotNull("Nilai Test :" + manusia.getNama());
	}

	@Test
	public void testNamaNull() {
		manusia.setNama("");
		assertNull("Nilai Test : " + manusia.getNama());
	}

	@After
	public void endTesting() {
		manusia = new Manusia();
		System.out.println("Testing End");

	}

}
