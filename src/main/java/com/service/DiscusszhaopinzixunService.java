package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhaopinzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhaopinzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhaopinzixunView;


/**
 * 招聘资讯评论表
 *
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface DiscusszhaopinzixunService extends IService<DiscusszhaopinzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhaopinzixunVO> selectListVO(Wrapper<DiscusszhaopinzixunEntity> wrapper);
   	
   	DiscusszhaopinzixunVO selectVO(@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);
   	
   	List<DiscusszhaopinzixunView> selectListView(Wrapper<DiscusszhaopinzixunEntity> wrapper);
   	
   	DiscusszhaopinzixunView selectView(@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhaopinzixunEntity> wrapper);
   	
}

