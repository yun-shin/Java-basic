package all;

class Pet
{
	int age;
	public void move() {
		System.out.println("�ֿϵ����� �����Դϴ�.");
	}
}

class Bird extends Pet 
{
	String type;
	char flightYN;
	
	Bird(String type, char flightYN){
		super.move();
		
		this.type = type;
		this.flightYN = flightYN;
	}
	
	public void getFlight() {
		if(flightYN == 'Y')
			System.out.println("�� �� �ֽ��ϴ�.");
		else
			System.out.println("�� �� �����ϴ�.");
	}
	
}

class Dog extends Pet
{
	String name;
	int weight;
	
	Dog(String name, int weight){
		super.move();
		
		this.name = name;
		this.weight = weight;
	}
	
	public void getWeight() {
		System.out.println("�����Դ� " + weight + "Kg�Դϴ�.");
	}
}

public class asdf
{

	public static void main(String[] args) {

		Dog dog = new Dog("������", 10);
		Bird bird = new Bird("�޹���", 'Y');
		
		System.out.print("�������� �̸��� "+ dog.name + "��, ");
		dog.getWeight();
		
		
		System.out.print("���� ������ " + bird.type + "��, ");
		bird.getFlight();
	
	}

}