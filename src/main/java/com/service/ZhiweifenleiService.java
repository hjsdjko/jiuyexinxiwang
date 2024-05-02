package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiweifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiweifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiweifenleiView;


/**
 * 职位分类
 *
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface ZhiweifenleiService extends IService<ZhiweifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiweifenleiVO> selectListVO(Wrapper<ZhiweifenleiEntity> wrapper);
   	
   	ZhiweifenleiVO selectVO(@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);
   	
   	List<ZhiweifenleiView> selectListView(Wrapper<ZhiweifenleiEntity> wrapper);
   	
   	ZhiweifenleiView selectView(@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiweifenleiEntity> wrapper);
   	
}

