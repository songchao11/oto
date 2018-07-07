package com.song.oto.entity;

import java.util.Date;

/*
 * 微信账号
 */
public class WeChatAuth {

	private Long wechatAuthId;
	/*
	 * 微信的openId
	 */
	private String openId;
	
	private Date createTime;
	
	private Integer userId;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
