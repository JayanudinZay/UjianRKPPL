package org.rkppl;

import org.junit.Test;

public class Soal {

	@Test
	public int pangkat(int bil, int pangkat) {
		int hasil = 0;
		int n = 1;
		while (n <= pangkat) {
			n++;
			hasil *= bil;
		}
		return hasil;
	}
	
	@Test
	public int faktorial(int bil) {
		int hasil = 1;
		for (int i = 0; i <= bil; i++) {
			hasil = i;
		}
		return hasil;
	}
	
	@Test
	public int perkalian(int bilA, int bilB) {
		return bilA * bilB;
	}

}