package bai7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator; 


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		
		while(true)
		{
			int choose;
			System.out.println("===============MENU======================"+"\n");
			System.out.println("1.Nhap vao thong tin cac dich vu:");
			System.out.println("2.Dich vu co so tien cao nhat:");
			System.out.println("3.Tong tien phai tra cho ca 3 dich vu:");
			System.out.println("4.Thoat chuong trinh:");
			System.out.println("===============ENDMENU======================"+"\n");
			System.out.println("Xin moi ban nhap vao su lua chon:");
			
			choose = scanner.nextInt();
			
			switch(choose)
			{
				case 1:
				{
					System.out.println("1.Dich vu thue xe:");
					System.out.println("2.Dich vu dien thoai:");
					System.out.println("3.Dich vu tang hoa:");
					break;
				}
				
				case 2:
				{
					DVThueXe dv1 = new DVThueXe(1000,8,2);
					
					long result1=dv1.tinhtienthuenhieuxe();
					
					DvDienThoai dv2 = new DvDienThoai(2000, 100);
					long result2=dv2.tinhtienDT();
					
					DVTangHoa dv3 = new DVTangHoa(3000, 10);
					long result3 = dv3.tinhtienHoa();
					
					List<Long> kq = new ArrayList<Long>();
					
					kq.add(result1);
					kq.add(result2);
					kq.add(result3);
					
					
					long max =kq.get(0); 
					
					for (long i = 1; i < kq.size(); i++)
					{
				        
				        if (kq.get((int) i).compareTo(max) > 0) 
				        {
				            max = kq.get((int) i);
				        }
				    }
					System.out.println("dich vu co so tien lon nhat la:"+max);
					break;
					
				}
				
				case 3:
				{
					DVThueXe dv1 = new DVThueXe();
					dv1.nhapthongtinxe();
					long result1=dv1.tinhtienthuenhieuxe();
					
					DvDienThoai dv2 = new DvDienThoai();
					dv2.nhapthongtindt();
					long result2=dv2.tinhtienDT();
					
					DVTangHoa dv3 = new DVTangHoa();
					dv3.nhapthongtinhoa();
					long result3 = dv3.tinhtienHoa();
					
					long tong=0;
					tong+=result1+result2+result3;
					System.out.println("Tong tien la:"+tong);
				}
				
				case 4:
				{
					return;
				}
				
			}
		}
	}
}



















