package top.xeonwang.tmxk.domain;

public class OrderInf
{
	private int OrderId;
	private String OrderTime;
	private String OrderStatus;
	
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
	public String getOrderStatus()
	{
		return this.OrderStatus;
	}
	public void setOrderStatus(String status)
	{
		this.OrderStatus = status;
	}
	
}
