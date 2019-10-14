package com.sundi.senior2.week2.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 
    * @ClassName: GoodsController
    * @Description: 控制层
    * @author sundi
    * @date 2019年10月14日
    *
 */
@Controller
public class GoodsController {

	@Autowired
	RedisTemplate redisTemplate;
	/**
	 * 
	    * @Title: getList
	    * @Description: List
	    * @param @param m
	    * @param @param page
	    * @param @param pageSize
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("findList")
	public String getList(Model m,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "10")Integer pageSize) {
		List list = redisTemplate.opsForList().range("goods_list", page, pageSize);
		m.addAttribute("goods", list);
		if(page-1>1) {
			m.addAttribute("pageNum", page-1);
		}
		if(pageSize+1<10) {
			m.addAttribute("pageSize", pageSize+1);
		}
		return "list";
		
	}
	/**
	 * 
	    * @Title: getZset
	    * @Description: ZSet
	    * @param @param m
	    * @param @param page
	    * @param @param pageSize
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("findZset")
	public String getZset(Model m,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "10")Integer pageSize) {
		Set set = redisTemplate.opsForZSet().range("goods_zset", page, pageSize);
		m.addAttribute("goods", set);
		if(page-1>1) {
			m.addAttribute("pageNum", page-1);
		}
		if(pageSize+1<10) {
			m.addAttribute("pageSize", pageSize+1);
		}
		return "zset";
		
	}
}
