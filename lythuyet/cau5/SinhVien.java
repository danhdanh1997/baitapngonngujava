package bai5_java;


import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable
{
	private String ten;
	private int diemtb;
	
	Scanner scanner = new Scanner(System.in);
	public SinhVien() 
	{
		super();
	}

	public SinhVien(String ten, int diemtb)
	{
		super();
		this.ten = ten;
		this.diemtb = diemtb;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getDiemtb() {
		return diemtb;
	}

	public void setDiemtb(int diemtb) {
		this.diemtb = diemtb;
	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", diemtb=" + diemtb + "]";
	}
	
	public void nhapthongtin()
	{
		System.out.println("nhap ten sv:");
		ten = scanner.nextLine();
		
		System.out.println("nhap diem tb:");
		diemtb = scanner.nextInt();
		
	}
	
	
	public boolean timkiem(String ten) 
	{
		if(this.getTen().equalsIgnoreCase(ten))
		{
			return true;
		}
		return false;
	}
	
	
}















