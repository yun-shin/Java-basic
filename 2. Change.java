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

			
			System.out.println("학번을 입력해주세요.");
			class_num = scanner.nextInt();
			
			switch (class_num % 2)
			{
			case 0:
				System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
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
				System.out.print("금액을 입력하시오. >> ");
				money = scanner.nextInt();
				
				for(int a=0; a<6; a++)
				{
					share[a] = money / unit[a];
					money = money - unit[a]*share[a];
				}
				
				System.out.println("50000원 짜리 : " + share[0] + "개");
				System.out.println("10000원 짜리 : " + share[1] + "개");
				System.out.println("1000원 짜리 : " + share[2] + "개");
				System.out.println("100원 짜리 : " + share[3] + "개");
				System.out.println("10원 짜리 : " + share[4] + "개");
				System.out.println("1원 짜리 : " + share[5] + "개");
				break;
				
			}
		}
}