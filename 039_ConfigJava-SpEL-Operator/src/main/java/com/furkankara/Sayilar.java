package com.furkankara;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sayilarBean")
public class Sayilar {
	
	@Value("10")
	private int sayi1;
	
	private int sayi2;
	private int sayi3;
	private int sayi4;
	private int sayi5;
	
	public int getSayi5() {
		return sayi5;
	}
	public void setSayi5(int sayi5) {
		this.sayi5 = sayi5;
	}
	public int getSayi1() {
		return sayi1;
	}
	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}
	public int getSayi2() {
		return sayi2;
	}
	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}
	public int getSayi3() {
		return sayi3;
	}
	public void setSayi3(int sayi3) {
		this.sayi3 = sayi3;
	}
	public int getSayi4() {
		return sayi4;
	}
	public void setSayi4(int sayi4) {
		this.sayi4 = sayi4;
	}
	
}
