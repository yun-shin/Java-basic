import java.util.Scanner;
public class first_exam {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num[] = new int [4];
		int sum = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(i+1 + "��° ���ڸ� �Է��ϼ��� : ");
			num[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < num.length; i++)
			sum += num[i];
		
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		scanner.close();
	}

}
