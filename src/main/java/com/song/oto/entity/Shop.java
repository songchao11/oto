package com.song.oto.entity;

import java.util.Date;

/*
 * 店铺
 */
public class Shop {

	private Long shopId;
	/*
	 * 店铺名
	 */
	private String shopName;
	/*
	 * 店铺描述
	 */
	private String shopDesc;
	/*
	 * 店铺地址
	 */
	private String shopAddress;
	/*
	 * 店铺电话
	 */
	private String phone;
	/*
	 * 店铺图片
	 */
	private String shopImg;
	/*
	 * 权重
	 */
	private Integer priority;
	/*
	 * 是否有效   (-1:不可用  0:审核中  1:可用)
	 */
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;
	/*
	 * 超级管理员给店铺的建议
	 */
	private String advice;
	/*
	 * 所处区域
	 */
	private Long areaId;
	/*
	 * 店铺店主
	 */
	private Long userId;
	/*
	 * 店铺类别
	 */
	private Long shopCategoryId;
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopDesc() {
		return shopDesc;
	}
	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getShopCategoryId() {
		return shopCategoryId;
	}
	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}
	
	
}
