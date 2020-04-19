package bai4_java;

public class Rectangle extends Shape 
{

	private double chieudai;
	private double chieurong;
	@Override
	public double tinhdientich() 
	{
		return this.getChieudai()*this.getChieurong() ;
	}
	public Rectangle() 
	{
		super();
	}
	public Rectangle(double chieudai, double chieurong)
	{
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	@Override
	public String toString() {
		return "Rectangle [chieudai=" + chieudai + ", chieurong=" + chieurong + "]";
	}
	@Override
	public void nhapthongtin()
	{
		System.out.println("nhap chieu dai:");
		chieudai = scanner.nextDouble();
		
		System.out.println("nhap chieu rong:");
		chieurong = scanner.nextDouble();
	}

}








