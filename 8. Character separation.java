import java.util.Scanner;

public class iloveyou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
				
		String str = scanner.nextLine();
		String a, b;
		
		for(int i=0; i<str.length() + 1; i++)
		{		
			System.out.println(str);
			
			a = str.substring(0, 1);
			b = str.substring(1);
			
			str = b + a;			
		}		
		scanner.close();
	}
}
