package top.xeonwang.tmxk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import top.xeonwang.tmxk.domain.Food;
@Repository
public interface FoodMapper
{
	//增加菜单
	public void AddFood(@Param("FoodName") String FoodName,@Param("FoodType") String FoodType,
			@Param("FoodStock") long FoodStock,@Param("FoodUnit") String FoodUnit,
			@Param("FoodImg") String FoodImg,@Param("FoodPrice") double FoodPrice);
	/***
	 * 修改菜单
	 * 
	 * 
	 */
	public void UpdateName(@Param("FoodId") Integer FoodId,@Param("FoodName") String FoodName);
	public void UpdateType(@Param("FoodId") Integer FoodId,@Param("FoodType") String FoodType);	
	//为减少对应id的foodstock	
	public void UpdateStore(@Param("FoodId") Integer FoodId,@Param("FoodStock") long FoodStock);
	public void UpdateUnit(@Param("FoodId") Integer FoodId,@Param("FoodUnit") String FoodUnit);
	public void UpdateImg(@Param("FoodId") Integer FoodId,@Param("FoodImg") String FoodImg);
	public void UpdatePrice(@Param("FoodId") Integer FoodId,@Param("FoodPrice") double foodPrice);
	//根据名字查找id
	public String FindByName(@Param("FoodName") String FoodName);
	//根据id查找库存
	public int GetStock(@Param("FoodId") Integer FoodId);
	//删除菜单
	public void DropFood(@Param("FoodId") Integer FoodId);
	//获取全部菜品
	public List<Food> GetAll();
	
}
