import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class two_dimensional 
{
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);

			
			int class_num;
			int n [] [] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2} };
			int random_num [][] = new int [4][4];;
			int choice;
			int sum = 0;
	
			System.out.println("�й��� �Է����ּ���.");
			class_num = scanner.nextInt();
			
			if(class_num % 2 == 0) 
			{
				System.out.println("�������ּ���.");
				System.out.println("1. �ʱ�ȭ�� �迭");
				System.out.println("2. �������� �迭");
				choice = scanner.nextInt();
				
				switch(choice) 
				{
				case 1:
					arrangement (n);
					break;
					
				case 2:
					RANDOM_arrangement (random_num);
					for(int i=0; i<4; i++)
					{
						for(int k=0; k<4; k++)
						{
							System.out.print(random_num[i][k] + "  ");
						}
						System.out.println();
					}
				
					break;
				}
			}
			
			if(class_num % 2 == 1)
			{
				System.out.println("�������ּ���.");
				System.out.println("1. �������� ��");
				System.out.println("2. ���� �̸�����");
			}
			
			choice = scanner.nextInt();
			
			switch(choice) 
			{
			case 1:
				String cout;
				
					for(int i=0; i<args.length; i++)
					{						
						try 
						{
						sum += Integer.parseInt(args[i]);
						}
						catch (NumberFormatException e)
						{
							args[i] = null;
						}

					}
					
				System.out.println("sum = " + sum);
				break;
				
			case 2:
				String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
				String subject;
				
				int score [] = {95, 88, 76, 62, 55};
				for(;;)
				{
					System.out.print("���� �̸� >> ");
					subject = scanner.next();
					
					for(int i=0; i<5; i++)
					{
						if (subject.equals(course[i]))
							System.out.println(course[i] + "�� ������ " + score[i]);
	
						else if("�׸�".equals(subject))
							System.exit(0);
						
						else
							continue;

					}
				}
			}
			scanner.close();
		}
		
		
		public static void arrangement (int[][] a)
		{
			System.out.println(a[0][0]);
			System.out.println(a[1][0] + "" + a[1][1] + "" + a[1][2]);
			System.out.println(a[2][0]);
			System.out.println(a[3][0] + "" + a[3][1] + "" + a[3][2] + "" + a[3][3]);
			System.out.println(a[4][0] + "" + a[4][1]);
		}
		
		
		public static int[][] RANDOM_arrangement (int b[][])
		{
			Random random = new Random();
			
			int num;
			int cout = 0;
			
			for(int i= 0; i<4; i++)
			{
				for(int n = 0; n<4; n++)
				{
					num  = random.nextInt(4);
					if (cout < 10 && b[i][num] == 0)
					{
							b[i][num] = random.nextInt(10);
							
							if(b[i][num] > 0) { cout++; }
					}	
				}
				if(i == 3 && cout < 10 )
				{
					i=-1;
				}
			}
			
			return b;
		}	

}

