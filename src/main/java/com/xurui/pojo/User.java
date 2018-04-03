package com.xurui.pojo;

public class User {
      private int    id;                 //用户id 自动增长
      private String name;               //用户姓名
      private String telephone;          //用户手机号码
      private int    area_id;            //用户归属区域
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	
	
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param telephone
	 * @param area_id
	 */
	public User(int id, String name, String telephone, int area_id) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.area_id = area_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", telephone=" + telephone
				+ ", area_id=" + area_id + "]";
	}
      
	
	
      
 
}
