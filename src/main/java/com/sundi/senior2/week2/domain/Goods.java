package com.sundi.senior2.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
    * @ClassName: Goods
    * @Description: 商品类
    * @author sundi
    * @date 2019年10月14日
    *
 */
public class Goods implements Serializable{

	private Integer id; //ID，
	private String name;//商品名称，
	private Integer price;//商品价格，
	private String baifen;//已售百分比
	
	public Goods(Integer id, String name, Integer price, String baifen) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.baifen = baifen;
	}
	public Goods() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBaifen() {
		return baifen;
	}
	public void setBaifen(String baifen) {
		this.baifen = baifen;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", baifen=" + baifen + "]";
	}
	
	
}
