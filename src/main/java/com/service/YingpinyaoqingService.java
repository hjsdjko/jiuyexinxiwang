package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpinyaoqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpinyaoqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpinyaoqingView;


/**
 * 通知面试
 *
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface YingpinyaoqingService extends IService<YingpinyaoqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpinyaoqingVO> selectListVO(Wrapper<YingpinyaoqingEntity> wrapper);
   	
   	YingpinyaoqingVO selectVO(@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);
   	
   	List<YingpinyaoqingView> selectListView(Wrapper<YingpinyaoqingEntity> wrapper);
   	
   	YingpinyaoqingView selectView(@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpinyaoqingEntity> wrapper);
   	
}

