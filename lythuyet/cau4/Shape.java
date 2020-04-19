package bai4_java;

import java.util.Scanner;

public abstract class Shape
{
	protected String tenhinh;
	
	

	public String getTenhinh() {
		return tenhinh;
	}

	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}
	Scanner scanner = new Scanner(System.in);
	@Override
	public String toString() {
		return "Shape [tenhinh=" + tenhinh + "]";
	}
	
	public abstract double tinhdientich();
	public abstract void nhapthongtin();
}
