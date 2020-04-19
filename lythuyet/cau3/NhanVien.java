package bai3_java;

public class NhanVien extends Person
{
	private long luongcb;
	private int hesoluong;
	
	public NhanVien()
	{
		super();
	}

	public NhanVien(String hoten, int tuoi, String diachi,long luongcb, int hesoluong)
	{
		super(hoten,tuoi,diachi);
		this.luongcb = luongcb;
		this.hesoluong = hesoluong;
	}

	public long getLuongcb() {
		return luongcb;
	}

	public void setLuongcb(long luongcb) {
		this.luongcb = luongcb;
	}

	public int getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}

	@Override
	public String toString() {
		return "NhanVien [luongcb=" + luongcb + ", hesoluong=" + hesoluong + "]";
	}
	
	public long tinhluong()
	{
		return this.getLuongcb()*this.getHesoluong();
	}
	
	@Override
	public void nhapthongtin()
	{
		super.nhapthongtin();
		System.out.println("nhap luong cb:");
		luongcb = scanner.nextLong();
		
		System.out.println("nhap he so luong :");
		hesoluong = scanner.nextInt();
	}
}


























