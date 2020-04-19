package bai8;

public class MachDien 
{
	private int R1;
	private int R2;
	private int R3;
	
	public MachDien() 
	{
		
	}
	public MachDien(int r1, int r2, int r3) {
		super();
		R1 = r1;
		R2 = r2;
		R3 = r3;
	}

	public int getR1() {
		return R1;
	}

	public void setR1(int r1) {
		R1 = r1;
	}

	public int getR2() {
		return R2;
	}

	public void setR2(int r2) {
		R2 = r2;
	}

	public int getR3() {
		return R3;
	}

	public void setR3(int r3) {
		R3 = r3;
	}
	
	public int MachSongSong()
	{
		return R3+R2;
	}
	
	public int MachNoiTiep()
	{
		return R1*this.MachSongSong()/R1+this.MachSongSong();
	}
	
}

















