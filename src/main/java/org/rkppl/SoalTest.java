package org.rkppl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoalTest {
	
	private Soal soal;
	
	@Before
	public  void awalTest(){
		soal = new Soal();
		System.out.println("Awal testing");
	}
	
	@Test
	public void test1(){
		System.out.println(soal.pangkat(8, 2));
		assertSame("Seharusnya 64 : ", soal.pangkat(2, 2));
	}
	
	@Test
	public void test2(){
		System.out.println(soal.perkalian(2, 2));
		assertSame("Seharusnya 4 : ", soal.perkalian(2, 2));
	}
	
	@Test
	public void test3(){
		System.out.println(soal.faktorial(16));
		assertSame("Seharusnya 4", soal.faktorial(16));
		
	}
	
	public void endTest(){
		soal = new Soal();
		System.out.println("Akhir Testing");
	}

}
