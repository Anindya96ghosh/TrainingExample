//The parent class whose members are passed 
abstract public class Training {

	Training(String name,int fees)
	{
		this.fees=fees;
		subject=name;
	}
	private int id;
	private String subject;
	public int fees;
	
	abstract public void call();
	
	
	
	
}
