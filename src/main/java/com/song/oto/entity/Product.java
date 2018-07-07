package com.song.oto.entity;

import java.util.Date;

/*
 * 商品类
 */
public class Product {

	private Long productId;
	/*
	 * 商品名称
	 */
	private String productName;
	/*
	 * 商品描述
	 */
	private String productDesc;
	/*
	 * 简略图
	 */
	private String imgAddress;
	/*
	 * 正常价格
	 */
	private String normalPrice;
	/*
	 * 促销价格
	 */
	private String promotionPrice;
	/*
	 * 权重
	 */
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	/*
	 * 是否有效(0:下架  1:有效)
	 */
	private Integer enableStatus;
	/*
	 * 商店id
	 */
	private Long shopId;
	/*
	 * 商品类别id
	 */
	private Long productCategoryId;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getImgAddress() {
		return imgAddress;
	}
	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}
	public String getNormalPrice() {
		return normalPrice;
	}
	public void setNormalPrice(String normalPrice) {
		this.normalPrice = normalPrice;
	}
	public String getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
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
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	
}
