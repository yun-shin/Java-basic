import java.util.Scanner;
public class asdf
{
		
	public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			
			int class_num;
			int i = 0;
			int money;
			int [] unit = {50000, 10000, 1000, 100, 10, 1};
			int [] share = {0, 0, 0, 0, 0, 0, 0, 0};
			int [] share1 = {};

			String input;
			String [] eng = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
							 "t", "u", "v", "w", "x", "y", "z"} ;

			
			System.out.println("�й��� �Է����ּ���.");
			class_num = scanner.nextInt();
			
			switch (class_num % 2)
			{
			case 0:
				System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�. >> ");
				input = scanner.next();
				try
				{
					while(true)
					{
						for(String list_b : eng)
						{
							System.out.print(list_b);
							
	
							if(list_b.equals(input)) 
							{
								input = eng[i-1];
								i = 0;
								break;
							}
							i++;
						}
						System.out.println();
						if(input.equals("stop"))
							break;	
					}
				}
				
				catch(ArrayIndexOutOfBoundsException e) {
					break;
				}
					
				break;
				
			case 1:
				System.out.print("�ݾ��� �Է��Ͻÿ�. >> ");
				money = scanner.nextInt();
				
				for(int a=0; a<6; a++)
				{
					share[a] = money / unit[a];
					money = money - unit[a]*share[a];
				}
				
				System.out.println("50000�� ¥�� : " + share[0] + "��");
				System.out.println("10000�� ¥�� : " + share[1] + "��");
				System.out.println("1000�� ¥�� : " + share[2] + "��");
				System.out.println("100�� ¥�� : " + share[3] + "��");
				System.out.println("10�� ¥�� : " + share[4] + "��");
				System.out.println("1�� ¥�� : " + share[5] + "��");
				break;
				
			}
		}
}