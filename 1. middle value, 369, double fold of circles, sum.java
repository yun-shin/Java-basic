import java.util.Scanner;

public class class_num
{
	
	public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			
			int num;
			int num1;
			int num2;
			
			int number;
			int number1;
			int number2;
			int sum = 0;
			
			String op;
			
				System.out.println("�й��� �Է����ּ���.");
				
				int class_num = scanner.nextInt();
				class_num = class_num % 10;
				switch(class_num)
				{
				case 1:
				case 2:
					System.out.print("2�ڸ��� ���� �߷�(1-~99)>>");
					num = scanner.nextInt();
					num1 = num % 10;
					num2 = num / 10;
					
					if(num1 == num2)
						System.out.println("Yes! 10���ڸ��� 1�� �ڸ��� �����ϴ�.");
					else
						System.out.println("No! 10���ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
					break;
					
				case 3:
				case 4:
					System.out.println("���� 3�� �Է�>>");
					num = scanner.nextInt();
					num1 = scanner.nextInt();
					num2 = scanner.nextInt();
					
					if(num > num1 && num1 > num2)
						System.out.println("�߰� ����" + num1 );
					
					else if (num1 > num && num > num2)
						System.out.println("�߰� ����" + num );
					
					else if (num2 > num && num > num1)
						System.out.println("�߰� ����" + num );

					else if (num > num2 && num2 > num1)
						System.out.println("�߰� ����" + num2 );
					
					else if (num2 > num1 && num1 > num2)
						System.out.println("�߰� ����" + num1 );
					
					else 
						System.out.println("�߰� ����" + num2 );
					break;
					
				case 5:
				case 6:
					System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
					num = scanner.nextInt();
					num1 = num % 10;
					num2 = num / 10;
					
					if (num2 == 3 || num2 == 6 || num2 == 9) {
						if (num1 == 3 || num1 == 6 || num1 == 9) {
							System.out.println("�ڼ�¦¦");
							break;
							}
					}
					
					switch (num1)
					{
					case 3:
					case 6:
					case 9:
						System.out.println("�ڼ�¦");
					}
					
					switch (num2)
					{
					case 3:
					case 6:
					case 9:
						System.out.println("�ڼ�¦");
					}
					break;
					
				case 7:
				case 8:
					System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
					num = scanner.nextInt();
					num1 = scanner.nextInt();
					num2 = scanner.nextInt();
					
					System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
					number = scanner.nextInt();
					number1 = scanner.nextInt();
					number2 = scanner.nextInt();
					
					int fir_x = num + num2;
					int fir_y = num1 + num2;
					
					int sen_x = number + number2;
					int sen_y = number1 + number2;
					
					if (fir_x > sen_x || -(fir_x) < sen_x || fir_x < -(sen_x) || -(fir_x) > -(sen_x) )
						System.out.println("�� ���� ���� ��ģ��.");
					else if (fir_y > sen_y || -(fir_y) < sen_y || fir_y < -(sen_y) || -(fir_y) > -(sen_y) )
						System.out.println("�� ���� ���� ��ģ��.");
					else
						System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
					break;
					
				case 9:
					System.out.print("����>>");
					num = scanner.nextInt();
					op = scanner.next();
					num2 = scanner.nextInt();
					
					if (op.equals("+"))
						sum = num + num2;
					else if (op.equals("-"))
						sum = num - num2;
					else if (op.equals("*"))
						sum = num * num2;
					else if (op.equals("/"))
						sum = num / num2;
					
					System.out.println(num + op + num2 + "�� ��� �����" + sum);
					break;
					
				case 0:
					System.out.print("����>>");
					num = scanner.nextInt();
					op = scanner.next();
					num2 = scanner.nextInt();
					
					switch (op)
					{
					case "+":
						sum = num + num2;
						break;
					case "-":
						sum = num - num2;
						break;
					case "*":
						sum = num * num2;
						break;
					case "/":
						sum = num / num2;
						break;
					}
					System.out.println(num + op + num2 + "�� ��� �����" + sum);
					break;				
				}
				scanner.close();
				
		}
}