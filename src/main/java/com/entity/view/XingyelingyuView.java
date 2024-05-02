package com.entity.view;

import com.entity.XingyelingyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 行业领域
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
@TableName("xingyelingyu")
public class XingyelingyuView  extends XingyelingyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XingyelingyuView(){
	}
 
 	public XingyelingyuView(XingyelingyuEntity xingyelingyuEntity){
 	try {
			BeanUtils.copyProperties(this, xingyelingyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
