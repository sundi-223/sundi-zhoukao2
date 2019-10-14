package com.sundi.test;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sundi.senior2.week2.domain.Goods;
import com.sundi.utils.FileUtils;
import com.sundi.utils.StringUtils;
/**
 * 
    * @ClassName: FileTest
    * @Description: 测试类
    * @author sundi
    * @date 2019年10月14日
    *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class FileTest {

	@Autowired
	RedisTemplate redisTemplate;
	
	/**
	 * 
	    * @Title: testList
	    * @Description: List
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testList() {
		for (int i=1; i <=106; i++) {
			Goods go = new Goods();
			go.setId(i);				
			go.setName("商品"+i);
			go.setPrice(5000+i);
			go.setBaifen("60%");
			redisTemplate.opsForList().leftPush("goods_list", go);
		}
		
	}
	/**
	 * 
	    * @Title: testZset
	    * @Description: ZSet
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testZset() {
		for (int i=1; i <=106; i++) {
			Goods go = new Goods();
			go.setId(i);				
			go.setName("商品"+i);
			go.setPrice(5000+i);
			go.setBaifen("60%");
			redisTemplate.opsForZSet().reverseRank("goods_zset",go);
		}
		
	}
}
