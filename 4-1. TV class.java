class TV
{
	private int size;
	
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
	
	public void printProperty() {
		System.out.println(inch + "인치" + " " + color + "컬러" );
	}
}

public class number1 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
