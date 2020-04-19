package bai4_java;

public class Circle extends Shape
{

	private double R;
	@Override
	public double tinhdientich() 
	{
		return 3.14*R*R;
	}
	public Circle(double r) 
	{
		super();
		R = r;
	}
	public Circle() 
	{
		super();
	}
	public double getR() {
		return R;
	}
	public void setR(double r) {
		R = r;
	}
	@Override
	public String toString() {
		return "Circle [R=" + R + "]";
	}
	@Override
	public void nhapthongtin() 
	{
		System.out.println("nhap vao ban kinh r:");
		R = scanner.nextDouble();
	}
	
	
}













