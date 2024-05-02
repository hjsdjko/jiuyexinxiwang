package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 个人简历
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
@TableName("gerenjianli")
public class GerenjianliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GerenjianliEntity() {
		
	}
	
	public GerenjianliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
