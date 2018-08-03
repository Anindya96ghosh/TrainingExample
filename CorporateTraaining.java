// The child class which inherits from class Training 
public class CorporateTraaining extends Training{
	
	public CorporateTraaining(String name,int fees, int days)
	{
		 super(name,fees);
		this.name=name;
		this.days=days;
		
	}
	private int days;
	private int cost;
	private String name;
	public int getOrderValue()
	{
		this.cost=days*fees;
		return cost;
	}
	public void call()
	{
		System.out.println("the cost of training for "+name+" course Corporate is "+getOrderValue());
	}

}
