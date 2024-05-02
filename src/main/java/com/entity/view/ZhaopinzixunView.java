package com.entity.view;

import com.entity.ZhaopinzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招聘资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
@TableName("zhaopinzixun")
public class ZhaopinzixunView  extends ZhaopinzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaopinzixunView(){
	}
 
 	public ZhaopinzixunView(ZhaopinzixunEntity zhaopinzixunEntity){
 	try {
			BeanUtils.copyProperties(this, zhaopinzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
