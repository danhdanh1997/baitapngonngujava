
package bai7;

import java.util.Scanner;

public class DVTangHoa extends DV
{
	Scanner scanner = new Scanner(System.in);
	private int soluong;
	
	
	public DVTangHoa()
	{
		
	}
	public DVTangHoa(long dongia, int soluong) {
		super(dongia);
		this.soluong = soluong;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public long tinhtienHoa()
	{
		return dongia*soluong;
	}
	
	public void nhapthongtinhoa()
	{
		System.out.println("nhap vao don gia:");
		dongia = scanner.nextLong();
		
		System.out.println("Nhap vao so luong hoa:");
		soluong = scanner.nextInt();
	}
}




























