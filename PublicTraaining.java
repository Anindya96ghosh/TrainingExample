// The child class which inherits from class Training 
public class PublicTraaining extends Training{

	 public PublicTraaining(String name,int fees, int participants)
	{
		 super(name,fees);
		this.name=name;
		this.participants=participants;
		
	}
	 private String name;
	private int participants;
	private int cost;
	public int getOrderValue()
	{
		this.cost=participants*fees;
		return cost;
	}
	public void call()
	{
		System.out.println("the cost of training for "+name+" course Public is "+getOrderValue());
	}
}
