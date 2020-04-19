package bai9;

public class GiamDoc 
{
	private String hoten ;
	private int ngaysinh;
	private int hesoluong;
	private int hesochucvu;
	
	
	public GiamDoc() {
		super();
	}


	public GiamDoc(String hoten, int ngaysinh, int hesoluong, int hesochucvu) {
		super();
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.hesoluong = hesoluong;
		this.hesochucvu = hesochucvu;
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


	public int getHesochucvu() {
		return hesochucvu;
	}


	public void setHesochucvu(int hesochucvu) {
		this.hesochucvu = hesochucvu;
	}


	@Override
	public String toString() {
		return "GiamDoc [hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", hesoluong=" + hesoluong + ", hesochucvu="
				+ hesochucvu + "]";
	}
	
	
	
}
