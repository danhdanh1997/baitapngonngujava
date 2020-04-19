package bai2;

import java.util.Scanner;



public class Time {
	private int gio;
	private int phut;
	private int giay;
	public Time(int gio, int phut, int giay) {
		super();
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
	}
	public Time() {
		super();
	}
	public int getGio() {
		return gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
	}
	public int getPhut() {
		return phut;
	}
	public void setPhut(int phut) {
		this.phut = phut;
	}
	public int getGiay() {
		return giay;
	}
	public void setGiay(int giay) {
		this.giay = giay;
	}
	
	private void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gio:");
		gio = scanner.nextInt();
		
		System.out.println("Nhap phut:");
		phut = scanner.nextInt();
		
		System.out.println("Nhap giay:");
		giay = scanner.nextInt();
	}
	
	@SuppressWarnings("unused")
	private void xuly() {
		if(phut>60) {
			gio++;
			phut-=60;
		}
	    if(giay>60) {
			phut++;
			giay-=60;
		}
	}
	
	@SuppressWarnings("unused")
	private void tang1giay() {
		giay++;
		if(giay>60) {
			phut++;
			giay-=60;
			if(phut>60) {
				gio++;
				phut-=60;
			}
		}
	}
	
	@SuppressWarnings("unused")
	private void sosanh(Time t) {
		if(((this.gio - t.gio)>=0) && ((this.phut - t.phut)>=0) && ((this.giay - t.giay)>=0)) {
			System.out.println("t1>=t2");
		}
		else {
			System.out.println("t1 be hoac bang t2");
		}
	}
	private void xuat() {
		System.out.println(gio+":gio "+phut+":phut "+giay+":giay");
	}
	
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		
		t1.nhap();
		t2.nhap();
		
		t1.sosanh(t2);
		t1.tang1giay();
		t1.xuly();
		t1.xuat();
		
		t2.xuly();
		t2.xuat();
	}
}

















