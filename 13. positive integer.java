import java.util.Scanner;

public class second_exam 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int num, result, count = 1;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		num = scanner.nextInt();
		
		System.out.println(num + "�� ����� ������ �����ϴ�.");
		
		for(int i=1; i<=num; i++)
		{
			result = num % i;
			
			if(result == 0)
				System.out.print(i + " ");
		}
		
		scanner.close();
	}
}
