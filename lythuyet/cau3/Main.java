package bai3_java;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap vao so luong  n nhan vien:");
		int n = scanner.nextInt();
		
		NhanVien [] a = new NhanVien[n];
		
		long tongluong=0;
		long max=0;
		for(int i=0;i<a.length;i++)
		{
			a[i] = new NhanVien();
			a[i].nhapthongtin();
			tongluong+=a[i].tinhluong();
			
			if(a[i].tinhluong() > max)
			{
				max = a[i].tinhluong();
			}
			
			
		}
		System.out.println("tong luong ="+tongluong);
		
		System.out.println("Nhan vien co luong cao nhat la" +max );
	}
}


























