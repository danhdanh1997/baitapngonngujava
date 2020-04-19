package bai3_java;

import java.util.Scanner;



public class Person
{
	Scanner scanner = new Scanner(System.in);
	protected String hoten;
	protected int tuoi;
	protected String diachi;
	
	public Person() {
		super();
	}

	public Person(String hoten, int tuoi, String diachi) 
	
	{
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.diachi = diachi;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		return "Person [hoten=" + hoten + ", tuoi=" + tuoi + ", diachi=" + diachi + "]";
	}
	
	public void nhapthongtin()
	{
		System.out.println("nhap ho ten:");
		hoten = scanner.nextLine();
		
		System.out.println("nhap tuoi:");
		tuoi = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("nhap dia chi:");
		diachi = scanner.nextLine();
	}
}






















