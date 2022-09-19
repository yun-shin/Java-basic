package all;

class Pet
{
	int age;
	public void move() {
		System.out.println("애완동물이 움직입니다.");
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
			System.out.println("날 수 있습니다.");
		else
			System.out.println("날 수 없습니다.");
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
		System.out.println("몸무게는 " + weight + "Kg입니다.");
	}
}

public class asdf
{

	public static void main(String[] args) {

		Dog dog = new Dog("누렁이", 10);
		Bird bird = new Bird("앵무새", 'Y');
		
		System.out.print("강아지의 이름은 "+ dog.name + "고, ");
		dog.getWeight();
		
		
		System.out.print("새의 종류는 " + bird.type + "고, ");
		bird.getFlight();
	
	}

}