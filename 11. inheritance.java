
interface Countable
{
	void count();
}

class Bird implements Countable
{
	String name;
	Bird(String name) { this.name = name; }
	public void fly() {
		System.out.println("날아간다.");
	}
	
	public void count() {
		System.out.println("2마리 있다.");
	}
	
}

class Tree implements Countable
{
	String name;
	Tree(String name) { this.name = name; }
	
	public void ripen() {
		System.out.println("열매가 잘 익었다.");
	}
	
	public void count() {
		System.out.println("5그루 있다.");
	}
}


public class number3
{
	public static void main(String[] args) {
		Bird cuckoo = new Bird("뻐꾸기");
		Bird eagle = new Bird("독수리");
		Tree apple = new Tree("사과 나무");
		Tree peach = new Tree("복숭아 나무");
		
		System.out.print(cuckoo.name + "가 ");
		cuckoo.count();
		
		System.out.print(eagle.name + "가 ");
		eagle.count();
		
		System.out.print(apple.name + "가 ");
		apple.count();
		
		System.out.print(peach.name + "가 ");
		peach.count();

	}
}
