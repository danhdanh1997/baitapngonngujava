package bai9;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Nhap vao n so nhan vien:");
		int n;
		n = scanner.nextInt();
		NhanVien []a = new NhanVien[n];
		
	    int max=0;
		for(int i=0;i<a.length;i++)
		{
			a[i] = new NhanVien();
			a[i].nhapthongtin();
			System.out.println("thong tin cua cac nhan vien:"+a[i].toString());
			
			if(a[i].tinhluong() > max)
			{
				max = a[i].tinhluong();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].tinhluong() == max)
			{
				System.out.println("thong tin nhan vien co luong cao nhat la:"+a[i].toString());
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getPhongban().equalsIgnoreCase("ke toan"))
			{
				System.out.println("thong tin nhan vien thuoc phong ke toan la:"+a[i].toString());
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].timNhanVienTheoTen("An"))
			{
				System.out.println("tim thay nhan vien An ");
			}
			else 
			{
				System.out.println("khong tim thay nhan vien co ten An");
			}
			
			if(a[i].timnhanvientheothangsinh().equalsIgnoreCase("02"))
			{
				System.out.println("thong tin nhan nhan vien sinh trong thang 2:"+a[i].toString());
			}
		}
		
		
	}
}















