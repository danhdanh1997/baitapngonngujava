package bai9;

public class QuanLy 
{
	private String hoten ;
	private int ngaysinh;
	private int hesoluong;
	private int soluong;
	
	public QuanLy() {
		super();
	}

	public QuanLy(String hoten, int ngaysinh, int hesoluong, int soluong) {
		super();
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.hesoluong = hesoluong;
		this.soluong = soluong;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(int ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public int getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}

	public int get() {
		return soluong;
	}

	public void set(int soluong) {
		this.soluong = soluong;
	}

	@Override
	public String toString() {
		return "QuanLy [hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", hesoluong=" + hesoluong + ", soluong=" + soluong + "]";
	}
	
	
}
