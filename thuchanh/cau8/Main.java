package bai8;

public class Main 
{
	public static void main(String[] args) 
	{
		MachDien md = new MachDien(1,2,3);
		
		md.MachNoiTiep();
		System.out.println("Tong tro cua mach phuc hop:"+md.MachNoiTiep());
	}
}
