package bai4_thjava;

import java.util.Scanner;

public class HonSo 
{
	private	int iNguyen;

	private int iTu;
   
	private  int iMau;
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	public HonSo() 
	{
		super();
	}

	

	public HonSo(int iNguyen, int iTu, int iMau)
	{
		super();
		this.iNguyen = iNguyen;
		this.iTu = iTu;
		this.iMau = iMau;
	}

	

	public int getiNguyen() {
		return iNguyen;
	}



	public void setiNguyen(int iNguyen) {
		this.iNguyen = iNguyen;
	}



	public int getiTu() {
		return iTu;
	}



	public void setiTu(int iTu) {
		this.iTu = iTu;
	}



	public int getiMau() {
		return iMau;
	}



	public void setiMau(int iMau) {
		this.iMau = iMau;
	}



	public Scanner getScanner() {
		return scanner;
	}



	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	

	@Override
	public String toString() {
		return "HonSo [iNguyen=" + iNguyen + ", iTu=" + iTu + ", iMau=" + iMau + ", scanner=" + scanner + "]";
	}



	public void nhap()
	{
		System.out.println("nhap phan nguyen:");
		iNguyen = scanner.nextInt();
		
		System.out.println("nhap tu:");
		iTu = scanner.nextInt();
		
		System.out.println("nhap mau:");
		iMau = scanner.nextInt();
		
	}
	
	public int UocChungLonNhat(int a, int b)
	{
	    while (a!=b)
	    {
	        if (a>b)
	            a-=b;
	        else
	            b-=a;
	    }
	    return a;
	}
	
	public HonSo RutGonHonSo(HonSo a)
	{
	    if (a.iTu > a.iMau)
	    {
	        int tam = a.iTu / a.iMau;
	        a.iNguyen += tam;
	        a.iTu -= a.iMau * tam;
	    }
	    int UCLN = UocChungLonNhat(a.iTu, a.iMau);
	    a.iTu /= UCLN;
	    a.iMau /= UCLN;
	    return a;
	}
	
	public HonSo TinhTong(HonSo a, HonSo b)
	{
	    HonSo c = new HonSo();
	    c.iNguyen = a.iNguyen + b.iNguyen;
	    c.iTu = a.iTu * b.iMau + a.iMau * b.iTu;
	    c.iMau = a.iMau * b.iMau;
	    return c;
	}
	
	
	public HonSo TinhHieu(HonSo a, HonSo b)
	{
		HonSo c = new HonSo();
	    c.iNguyen = a.iNguyen - b.iNguyen;
	    c.iTu = a.iTu * b.iMau - a.iMau * b.iTu;
	    c.iMau = a.iMau * b.iMau;
	    return c;
	}
	
	
	public HonSo TinhTich(HonSo a, HonSo b)
	{
	    a.iTu = a.iTu + a.iNguyen*a.iMau;
	    b.iTu = b.iTu + b.iNguyen*b.iMau;

	    HonSo c = new HonSo();
	    c.iNguyen = 0;
	    c.iTu = a.iTu * b.iTu;
	    c.iMau = a.iMau * b.iMau;
	    c = RutGonHonSo(c);
	    return c;
	}
	
	public HonSo TinhThuong(HonSo a, HonSo b)
	{
	    a.iTu = a.iTu + a.iNguyen*a.iMau;
	    b.iTu = b.iTu + b.iNguyen*b.iMau;

	    HonSo c = new HonSo();
	    c.iNguyen = 0;
	    c.iTu = a.iTu * b.iMau;
	    c.iMau = a.iMau * b.iTu;
	    c = RutGonHonSo(c);
	    return c;
	}
}
























