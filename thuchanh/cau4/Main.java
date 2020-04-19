package bai4_thjava;

public class Main 
{
	public static void main(String[] args)
	{
		HonSo aHonSo = new HonSo(1,2,3);
		HonSo bHonSo = new HonSo(2,3,4);
		
		aHonSo.TinhTong(aHonSo,bHonSo);
		
		aHonSo.TinhHieu(aHonSo, bHonSo);
		
		aHonSo.TinhTich(aHonSo, bHonSo);
		
		aHonSo.TinhThuong(aHonSo, bHonSo);
	}
}
