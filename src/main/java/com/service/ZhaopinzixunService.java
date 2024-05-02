package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaopinzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinzixunView;


/**
 * 招聘资讯
 *
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface ZhaopinzixunService extends IService<ZhaopinzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinzixunVO> selectListVO(Wrapper<ZhaopinzixunEntity> wrapper);
   	
   	ZhaopinzixunVO selectVO(@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);
   	
   	List<ZhaopinzixunView> selectListView(Wrapper<ZhaopinzixunEntity> wrapper);
   	
   	ZhaopinzixunView selectView(@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinzixunEntity> wrapper);
   	
}

