package bai9;

import java.util.Scanner;

public class NhanVien
{
	Scanner scanner = new Scanner(System.in);
	private String hoten ;
	private String ngaysinh;
	private int hesoluong;
	private String phongban;
	
	public NhanVien() {
		super();
	}

	public NhanVien(String hoten, String ngaysinh, int hesoluong, String phongban) {
		super();
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.hesoluong = hesoluong;
		this.phongban = phongban;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public int getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}

	public String getPhongban() {
		return phongban;
	}

	public void setPhongban(String phongban) {
		this.phongban = phongban;
	}

	@Override
	public String toString() {
		return "NhanVien [hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", hesoluong=" + hesoluong + ", phongban="
				+ phongban + "]";
	}
	
	public void nhapthongtin()
	{
		System.out.println("Nhap ho ten:");
		hoten = scanner.nextLine();
		
		System.out.println("Nhap ngay sinh:");
		ngaysinh = scanner.nextLine();
		
		System.out.println("Nhap he so luong:");
		hesoluong = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhap vao ten phong ban:");
		phongban = scanner.nextLine();
	}
	
	public int tinhluong()
	{
		return this.getHesoluong()*1200000;
	}
	
	 public boolean timNhanVienTheoTen(String tenNV)
	 {
	        String[] thongTinNV = this.getHoten().split("\t");
	        if (thongTinNV[0].equalsIgnoreCase(tenNV)) {
	           return true;
	        } 
	        return false;
	 }
	 
	 
	 public String timnhanvientheothangsinh()
	 {
		String thangsinh = this.getNgaysinh().substring(2, 4);
		return thangsinh;
	 }
}















