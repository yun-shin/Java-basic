import java.util.Scanner;

public class second_exam 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int num, result, count = 1;
		
		System.out.print("양의 정수를 입력하세요 : ");
		num = scanner.nextInt();
		
		System.out.println(num + "의 양수는 다음과 같습니다.");
		
		for(int i=1; i<=num; i++)
		{
			result = num % i;
			
			if(result == 0)
				System.out.print(i + " ");
		}
		
		scanner.close();
	}
}
