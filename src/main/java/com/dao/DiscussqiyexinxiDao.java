package com.dao;

import com.entity.DiscussqiyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiyexinxiVO;
import com.entity.view.DiscussqiyexinxiView;


/**
 * 企业信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface DiscussqiyexinxiDao extends BaseMapper<DiscussqiyexinxiEntity> {
	
	List<DiscussqiyexinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);
	
	DiscussqiyexinxiVO selectVO(@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);
	
	List<DiscussqiyexinxiView> selectListView(@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);

	List<DiscussqiyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);
	
	DiscussqiyexinxiView selectView(@Param("ew") Wrapper<DiscussqiyexinxiEntity> wrapper);
	
}
