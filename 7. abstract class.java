package homework2;

interface Mammal
{
	String reproduction();
}

abstract class Fish
{
	abstract protected String motion();
	
	public void fishMotion()
	{
		System.out.println(motion());
	}
}

class whale extends Fish implements Mammal
{
	protected String motion()
	{
		return "�ɰ��� ���ġ�� �����Դϴ�.";
	}
	
	public String reproduction()
	{
		return "������ �����ϴ�.";
	}
	
	public String species ()
	{
		return "��";
	}
}


public class result
{

	public static void main(String[] args) {
		whale whale = new whale();
		
		System.out.println(whale.motion());
		System.out.println(whale.species() + "�� " + whale.reproduction());

	}

}
