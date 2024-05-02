package com.entity.model;

import com.entity.GerenjianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 个人简历
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public class GerenjianliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 教育经历
	 */
	
	private String jiaoyujingli;
		
	/**
	 * 工作经历
	 */
	
	private String gongzuojingli;
		
	/**
	 * 工作业绩
	 */
	
	private String gongzuoyeji;
		
	/**
	 * 技能
	 */
	
	private String jineng;
		
	/**
	 * 自我介绍
	 */
	
	private String ziwojieshao;
				
	
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：教育经历
	 */
	 
	public void setJiaoyujingli(String jiaoyujingli) {
		this.jiaoyujingli = jiaoyujingli;
	}
	
	/**
	 * 获取：教育经历
	 */
	public String getJiaoyujingli() {
		return jiaoyujingli;
	}
				
	
	/**
	 * 设置：工作经历
	 */
	 
	public void setGongzuojingli(String gongzuojingli) {
		this.gongzuojingli = gongzuojingli;
	}
	
	/**
	 * 获取：工作经历
	 */
	public String getGongzuojingli() {
		return gongzuojingli;
	}
				
	
	/**
	 * 设置：工作业绩
	 */
	 
	public void setGongzuoyeji(String gongzuoyeji) {
		this.gongzuoyeji = gongzuoyeji;
	}
	
	/**
	 * 获取：工作业绩
	 */
	public String getGongzuoyeji() {
		return gongzuoyeji;
	}
				
	
	/**
	 * 设置：技能
	 */
	 
	public void setJineng(String jineng) {
		this.jineng = jineng;
	}
	
	/**
	 * 获取：技能
	 */
	public String getJineng() {
		return jineng;
	}
				
	
	/**
	 * 设置：自我介绍
	 */
	 
	public void setZiwojieshao(String ziwojieshao) {
		this.ziwojieshao = ziwojieshao;
	}
	
	/**
	 * 获取：自我介绍
	 */
	public String getZiwojieshao() {
		return ziwojieshao;
	}
			
}
