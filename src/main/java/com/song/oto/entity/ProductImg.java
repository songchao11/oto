package com.song.oto.entity;

import java.util.Date;

/*
 * 商品图片
 */
public class ProductImg {

	private Long productImgId;
	/*
	 * 图片地址
	 */
	private String imgAddress;
	/*
	 * 图片描述
	 */
	private String imgDesc;
	/*
	 * 权重
	 */
	private Integer priority;
	private Date createTime;
	/*
	 * 所属商品
	 */
	private Long productId;
	public Long getProductImgId() {
		return productImgId;
	}
	public void setProductImgId(Long productImgId) {
		this.productImgId = productImgId;
	}
	public String getImgAddress() {
		return imgAddress;
	}
	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}
	public String getImgDesc() {
		return imgDesc;
	}
	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
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
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	
	
}
