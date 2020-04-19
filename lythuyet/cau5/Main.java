package bai5_java;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String arrThongTin[];
		System.out.println("nhap n sinh vien:");
		int n = scanner.nextInt();
		
		SinhVien [] sv = new SinhVien[n];
		
		List<SinhVien> sinhViens = new ArrayList<SinhVien>();
		for(int i = 0; i < sv.length;i++)
		{
			sv[i] = new SinhVien();
			sv[i].nhapthongtin();
			sinhViens.add(sv[i]);
			System.out.println("thong tin sinh vien:"+sv[i].toString());
		}
		
		Collections.sort(sinhViens, new SapXep()); 
		
		
		 System.out.println("Nhập tên sinh viên cần tìm: ");
		 String search = scanner.nextLine();
		 
		 SinhVien sVien = new SinhVien();
		 if(sVien.timkiem(search))
		 {
			 System.out.println("tim thay sinh vien ten "+search);
		 }
		 
		 
	}
}



















