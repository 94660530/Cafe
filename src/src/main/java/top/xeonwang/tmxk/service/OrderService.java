package top.xeonwang.tmxk.service;

import top.xeonwang.tmxk.domain.OrderPrice;

public interface OrderService
{
	// 增加订单
	public void AddOrder(String OrderId);

	// 更新订单状态
	public void UpdateStatus(String OrderId, String OrderStatus);

	// 删除订单
	public void DropOrder(String OrderId);

	// 获取订单状态
	public String GetStatus(String OrderId);

	// 获取订单时间
	public String GetTime(String OrderId);

	// 查询订单id,时间,金额
	public OrderPrice GetPrice(String OrderId);
}
