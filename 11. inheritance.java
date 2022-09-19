
interface Countable
{
	void count();
}

class Bird implements Countable
{
	String name;
	Bird(String name) { this.name = name; }
	public void fly() {
		System.out.println("���ư���.");
	}
	
	public void count() {
		System.out.println("2���� �ִ�.");
	}
	
}

class Tree implements Countable
{
	String name;
	Tree(String name) { this.name = name; }
	
	public void ripen() {
		System.out.println("���Ű� �� �;���.");
	}
	
	public void count() {
		System.out.println("5�׷� �ִ�.");
	}
}


public class number3
{
	public static void main(String[] args) {
		Bird cuckoo = new Bird("���ٱ�");
		Bird eagle = new Bird("������");
		Tree apple = new Tree("��� ����");
		Tree peach = new Tree("������ ����");
		
		System.out.print(cuckoo.name + "�� ");
		cuckoo.count();
		
		System.out.print(eagle.name + "�� ");
		eagle.count();
		
		System.out.print(apple.name + "�� ");
		apple.count();
		
		System.out.print(peach.name + "�� ");
		peach.count();

	}
}
