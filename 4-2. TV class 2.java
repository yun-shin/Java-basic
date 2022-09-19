package 곂침방지;
class TV {
	private int size;
	
	public TV () {	}
	
	public TV(int size) { 
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV
{
	private int inch, color;
	
	public ColorTV (int size, int color) {
		super(size);
		this.inch = getSize();
		this.color = color;
	}
	
	protected int getInch() {
		return inch;
	}
	
	protected int getColor() {
		return color;
	}
}

class IPTV extends ColorTV {
	private String address;
	private int inch, color;
	
	public IPTV (String address, int size, int color) {
		super(size, color);
		this.address = address;	
		this.inch = getInch();
		this.color = getColor();
	}
	
	public void printProperty() {
		System.out.println("나의"+ " " + "IPTV는" + " " + address + " " + "주소의" + " " + inch + "인치" + " " + color + "컬러" );
	}
}

public class number2 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
