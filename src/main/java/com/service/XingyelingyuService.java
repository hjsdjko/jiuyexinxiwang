package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingyelingyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingyelingyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingyelingyuView;


/**
 * 行业领域
 *
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface XingyelingyuService extends IService<XingyelingyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingyelingyuVO> selectListVO(Wrapper<XingyelingyuEntity> wrapper);
   	
   	XingyelingyuVO selectVO(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
   	
   	List<XingyelingyuView> selectListView(Wrapper<XingyelingyuEntity> wrapper);
   	
   	XingyelingyuView selectView(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingyelingyuEntity> wrapper);
   	
}

