


package bai7;

import java.util.Scanner;

public class DVThueXe extends DV
{
	Scanner scanner = new Scanner(System.in);
	private int sogiothue;
	private int soxethue;
	
	public DVThueXe()
	{
		
	}

	public DVThueXe(long dongia, int sogiothue,int soxethue) {
		super(dongia);
		this.soxethue = soxethue;
		this.sogiothue = sogiothue;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public int getSogiothue() {
		return sogiothue;
	}

	public void setSogiothue(int sogiothue) {
		this.sogiothue = sogiothue;
	}
	
	public int getSoxethue() {
		return soxethue;
	}

	public void setSoxethue(int soxethue) {
		this.soxethue = soxethue;
	}
	
	public long tinhtienthue1xe() 
	{
		if(sogiothue>6)
		{
			return dongia*sogiothue*95/100;
		}
		else
		{
			return dongia*sogiothue;
		}
	}
	
	public long tinhtienthuenhieuxe()
	{
		if(soxethue*sogiothue>72)
		{
			return soxethue*tinhtienthue1xe()*2/100;
		}
		else 
		{
			return soxethue*tinhtienthue1xe();
		}
	}
	
	public void nhapthongtinxe()
	{
		System.out.println("Nhap vao don gia:");
		dongia = scanner.nextLong();
		
		System.out.println("Nhap vao so gio thue:");
		sogiothue = scanner.nextInt();
		
		System.out.println("Nhap vao so xe thue:");
		soxethue = scanner.nextInt();
		
	}

}











