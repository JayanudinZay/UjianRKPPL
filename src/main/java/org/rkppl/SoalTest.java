package org.rkppl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoalTest {

	private Soal soal;

	public SoalTest() {
		soal = new Soal();
	}

	@Before
	public void awalTest() {
		soal = new Soal();
		System.out.println("Awal testing");
	}

	@Test
	public void test1() {
		assertSame("Seharusnya 4 : ", 4, soal.pangkat(2, 2));
	}

	@Test
	public void test2() {
		assertSame("Seharusnya 4 : ", 4, soal.perkalian(2, 2));
	}

	@Test
	public void test3() {
		assertSame("Seharusnya 2", 2, soal.faktorial(2));

	}
	
	@Test
	public void test4() {
		assertNotSame("Seharusnya 6", 6, soal.pangkat(2, 3));
	}
	
	@Test
	public void test5() {
		assertNotSame("seharusnya 6", 6, soal.perkalian(3, 3));
	}
	@Test
	public void test6() {
		assertNotSame("seharusnya 24", 6, soal.faktorial(4));
	}

	@After
	public void endTest() {
		soal = new Soal();
		System.out.println("Akhir Testing");
	}

}
