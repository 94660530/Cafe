package top.xeonwang.tmxk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import top.xeonwang.tmxk.domain.Food;
import top.xeonwang.tmxk.domain.User;
import top.xeonwang.tmxk.service.FoodService;
import top.xeonwang.tmxk.service.UserService;
import top.xeonwang.tmxk.util.myUtil;

@Controller
public class updateController
{
	@Resource
	private FoodService foodservice;
	@Resource
	private UserService userservice;
	
	@RequestMapping("/updateFood")
	@ResponseBody
	public String UpdateFood(HttpServletRequest request) throws JsonMappingException, JsonProcessingException
	{
		String text=myUtil.readData(request);
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> re = new HashMap<String, Object>();
		re.put("ok","false");
		
		List<Food> listObjectFour = JSONArray.parseArray(text,Food.class);
		
		if(listObjectFour == null)
			return om.writeValueAsString(re);
		
		for(int i = 0;i < listObjectFour.size();i++)
		{
			foodservice.UpdateName(listObjectFour.get(i).getFoodId(),listObjectFour.get(i).getFoodName());
			foodservice.UpdateStore(listObjectFour.get(i).getFoodId(),listObjectFour.get(i).getFoodStock());
			foodservice.UpdateImg(listObjectFour.get(i).getFoodId(),listObjectFour.get(i).getFoodImg());
			foodservice.UpdatePrice(listObjectFour.get(i).getFoodId(),listObjectFour.get(i).getFoodPrice());
			foodservice.UpdateType(listObjectFour.get(i).getFoodId(),listObjectFour.get(i).getFoodType());
			foodservice.UpdateUnit(listObjectFour.get(i).getFoodId(),listObjectFour.get(i).getFoodUnit());
		}
		
		re.put("ok", "true");
		return om.writeValueAsString(re);
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public String UpdateUser(HttpServletRequest request) throws JsonProcessingException
	{
		String text=myUtil.readData(request);
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> re = new HashMap<String, Object>();
		re.put("ok","false");
		
		List<User> listObjectFour = JSONArray.parseArray(text,User.class);
				
		if(listObjectFour == null)
			return om.writeValueAsString(re);
		
		System.out.println(listObjectFour.get(0));
		
		for(int i = 0;i < listObjectFour.size();i++)
		{
			userservice.UpdateBirthday(listObjectFour.get(i).getUserId(),listObjectFour.get(i).getUserBirthday());
			userservice.UpdateEmail(listObjectFour.get(i).getUserId(),listObjectFour.get(i).getUserEmail());
			userservice.UpdateGender(listObjectFour.get(i).getUserId(),listObjectFour.get(i).getUserGender());
			userservice.UpdateName(listObjectFour.get(i).getUserId(),listObjectFour.get(i).getUserName());
			userservice.UpdatePhone(listObjectFour.get(i).getUserId(),listObjectFour.get(i).getUserPhone());
			userservice.UpdatePwd(listObjectFour.get(i).getUserId(),listObjectFour.get(i).getUserPwd());
		}
		
		re.put("ok", "true");
		return om.writeValueAsString(re);
	}
	
	
}
