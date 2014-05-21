package org.rkppl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoalTest {
	
	private Soal soal;
	
	public SoalTest(){
		soal = new Soal();
	}
	
	@Before
	public  void awalTest(){
		soal = new Soal();
		System.out.println("Awal testing");
	}
	
	@Test
	public void test1(){
		System.out.println("8 pangkat 2 : "+soal.pangkat(2, 2));
		assertSame("Seharusnya 4 : ",4, soal.pangkat(2, 2));
	}
	
	@Test
	public void test2(){
		System.out.println("2 dikali 2 : "+soal.perkalian(2, 2));
		assertSame("Seharusnya 4 : ",4, soal.perkalian(2, 2));
	}
	
	@Test
	public void test3(){
		System.out.println("faktorial 2 : "+soal.faktorial(2));
		assertSame("Seharusnya 2",2, soal.faktorial(2));
		
	}
	
	@After
	public void endTest(){
		soal = new Soal();
		System.out.println("Akhir Testing");
	}

}
