package com.entity.model;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 招聘信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public class ZhaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 企业邮箱
	 */
	
	private String qiyeyouxiang;
		
	/**
	 * 职位名称
	 */
	
	private String zhiweimingcheng;
		
	/**
	 * 办公环境
	 */
	
	private String bangonghuanjing;
		
	/**
	 * 职位分类
	 */
	
	private String zhiweifenlei;
		
	/**
	 * 行业
	 */
	
	private String xingye;
		
	/**
	 * 招聘人数
	 */
	
	private Integer zhaopinrenshu;
		
	/**
	 * 职位信息
	 */
	
	private String zhiweixinxi;
		
	/**
	 * 任职要求
	 */
	
	private String renzhiyaoqiu;
		
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
	
	private Integer xinzidaiyu;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：企业邮箱
	 */
	 
	public void setQiyeyouxiang(String qiyeyouxiang) {
		this.qiyeyouxiang = qiyeyouxiang;
	}
	
	/**
	 * 获取：企业邮箱
	 */
	public String getQiyeyouxiang() {
		return qiyeyouxiang;
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
	 * 设置：办公环境
	 */
	 
	public void setBangonghuanjing(String bangonghuanjing) {
		this.bangonghuanjing = bangonghuanjing;
	}
	
	/**
	 * 获取：办公环境
	 */
	public String getBangonghuanjing() {
		return bangonghuanjing;
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
	 * 设置：行业
	 */
	 
	public void setXingye(String xingye) {
		this.xingye = xingye;
	}
	
	/**
	 * 获取：行业
	 */
	public String getXingye() {
		return xingye;
	}
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
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
	 * 设置：任职要求
	 */
	 
	public void setRenzhiyaoqiu(String renzhiyaoqiu) {
		this.renzhiyaoqiu = renzhiyaoqiu;
	}
	
	/**
	 * 获取：任职要求
	 */
	public String getRenzhiyaoqiu() {
		return renzhiyaoqiu;
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
	 
	public void setXinzidaiyu(Integer xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	
	/**
	 * 获取：薪资待遇
	 */
	public Integer getXinzidaiyu() {
		return xinzidaiyu;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
