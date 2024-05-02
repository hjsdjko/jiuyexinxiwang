package com.entity.vo;

import com.entity.YingpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 应聘信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public class YingpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 职位名称
	 */
	
	private String zhiweimingcheng;
		
	/**
	 * 职位分类
	 */
	
	private String zhiweifenlei;
		
	/**
	 * 职位信息
	 */
	
	private String zhiweixinxi;
		
	/**
	 * 上班地点
	 */
	
	private String shangbandidian;
		
	/**
	 * 上班时间
	 */
	
	private String shangbanshijian;
		
	/**
	 * 薪资待遇
	 */
	
	private String xinzidaiyu;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 个人简历
	 */
	
	private String gerenjianli;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：职位名称
	 */
	 
	public void setZhiweimingcheng(String zhiweimingcheng) {
		this.zhiweimingcheng = zhiweimingcheng;
	}
	
	/**
	 * 获取：职位名称
	 */
	public String getZhiweimingcheng() {
		return zhiweimingcheng;
	}
				
	
	/**
	 * 设置：职位分类
	 */
	 
	public void setZhiweifenlei(String zhiweifenlei) {
		this.zhiweifenlei = zhiweifenlei;
	}
	
	/**
	 * 获取：职位分类
	 */
	public String getZhiweifenlei() {
		return zhiweifenlei;
	}
				
	
	/**
	 * 设置：职位信息
	 */
	 
	public void setZhiweixinxi(String zhiweixinxi) {
		this.zhiweixinxi = zhiweixinxi;
	}
	
	/**
	 * 获取：职位信息
	 */
	public String getZhiweixinxi() {
		return zhiweixinxi;
	}
				
	
	/**
	 * 设置：上班地点
	 */
	 
	public void setShangbandidian(String shangbandidian) {
		this.shangbandidian = shangbandidian;
	}
	
	/**
	 * 获取：上班地点
	 */
	public String getShangbandidian() {
		return shangbandidian;
	}
				
	
	/**
	 * 设置：上班时间
	 */
	 
	public void setShangbanshijian(String shangbanshijian) {
		this.shangbanshijian = shangbanshijian;
	}
	
	/**
	 * 获取：上班时间
	 */
	public String getShangbanshijian() {
		return shangbanshijian;
	}
				
	
	/**
	 * 设置：薪资待遇
	 */
	 
	public void setXinzidaiyu(String xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	
	/**
	 * 获取：薪资待遇
	 */
	public String getXinzidaiyu() {
		return xinzidaiyu;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
				
	
	/**
	 * 设置：个人简历
	 */
	 
	public void setGerenjianli(String gerenjianli) {
		this.gerenjianli = gerenjianli;
	}
	
	/**
	 * 获取：个人简历
	 */
	public String getGerenjianli() {
		return gerenjianli;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
