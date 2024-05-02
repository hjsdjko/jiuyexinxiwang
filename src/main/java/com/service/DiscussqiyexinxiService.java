package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiyexinxiView;


/**
 * 企业信息评论表
 *
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface DiscussqiyexinxiService extends IService<DiscussqiyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiyexinxiVO> selectListVO(Wrapper<DiscussqiyexinxiEntity> wrapper);
   	
   	DiscussqiyexinxiVO selectVO(@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);
   	
   	List<DiscussqiyexinxiView> selectListView(Wrapper<DiscussqiyexinxiEntity> wrapper);
   	
   	DiscussqiyexinxiView selectView(@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiyexinxiEntity> wrapper);
   	
}

