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
		return "믈고기는 헤엄치며 움직입니다.";
	}
	
	public String reproduction()
	{
		return "새끼를 낳습니다.";
	}
	
	public String species ()
	{
		return "고래";
	}
}


public class result
{

	public static void main(String[] args) {
		whale whale = new whale();
		
		System.out.println(whale.motion());
		System.out.println(whale.species() + "는 " + whale.reproduction());

	}

}
