package top.xeonwang.tmxk.domain;

public class OrderPrice
{
	private int OrderId;
	private String OrderTime;
	private int OrderPrice;
	
	public int getOrderId()
	{
		return this.OrderId;
	}
	public void setOrderId(int id)
	{
		this.OrderId = id;
	}
	public String getOrderTime()
	{
		return this.OrderTime;
	}
	public void setOrderTime(String time)
	{
		this.OrderTime = time;
	}
	public int getOrderPrice()
	{
		return this.OrderPrice;
	}
	public void setOrderPrice(int p)
	{
		this.OrderPrice = p;
	}
}
