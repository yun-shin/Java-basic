
import java.util.Scanner;

abstract class Converter {
	abstract protected double convert (double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >> ");
		
		double val = scanner.nextDouble();
		double res = convert(val);
		
		System.out.println("��ȯ��� : " + res + getDestString() + "�Դϴ�.");
		
		scanner.close();
	}
}

class Won2Dollar extends Converter {
	private int dollar;
	
	public Won2Dollar (int dollar) {
		this.dollar = dollar;
	}
	
	protected String getSrcString() {
		return "��";
	}
	
	protected String getDestString() {
		return "�޷�";
	}
	
	protected double convert (double src) {
		src = src / dollar;
		return src;
	}
}

public class number3 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
