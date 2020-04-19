package bai4_java;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap n so luong hinh chu nhat:");
		int n = scanner.nextInt();
		
		Shape [] a = new Rectangle[n];
		int demhcn=0;
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = new Rectangle();
			a[i].nhapthongtin();
			if(a[i].tinhdientich()!=0)
			{
				demhcn++;
			}
			
		}
		System.out.println("co "+demhcn+"hinh chu nhat");
		
		System.out.println("nhap n so luong hinh tron:");
		int m = scanner.nextInt();
		Shape [] b = new Circle[m];
		int demht=0;
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = new Circle();
			a[i].nhapthongtin();
			if(a[i].tinhdientich()!=0)
			{
				demht++;
			}
			
		}
		System.out.println("co "+demht+"hinh tron");
		
		
		Rectangle hcn = new Rectangle(2,5);
		hcn.tinhdientich();
		
		Circle ht = new Circle(4);
		ht.tinhdientich();
		
		double result = hcn.tinhdientich() - ht.tinhdientich();
		if(result > 0)
		{
			System.out.println("dien tich lon nhat la hcn");
		}
		System.out.println("dien tich lon nhat la hinh tron:");
	}
}















