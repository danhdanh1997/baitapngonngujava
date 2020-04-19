

package bai7;

import java.util.Scanner;

public class DvDienThoai extends DV
{
	Scanner scanner = new Scanner(System.in);
	private int sophutgoi;
	

	public DvDienThoai()
	{
		
	}
	public DvDienThoai(long dongia, int sophutgoi) {
		super(dongia);
		this.sophutgoi = sophutgoi;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public int getSophutgoi() {
		return sophutgoi;
	}

	public void setSophutgoi(int sophutgoi) {
		this.sophutgoi = sophutgoi;
	}
	
	public long tinhtienDT()
	{
		 if(sophutgoi*dongia >300)
		 {
			 return 300+(sophutgoi*dongia - 300)*80/100;
		 }
		 else 
		 {
			 return sophutgoi*dongia;
		 }
	}
	
	
	public void nhapthongtindt()
	{
		System.out.println("Nhap vao don gia:");
		dongia = scanner.nextLong();
		
		System.out.println("Nhap vao so phut goi:");
		sophutgoi = scanner.nextInt();
	}
	
}
























