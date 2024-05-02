package com.dao;

import com.entity.DiscusszhaopinzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhaopinzixunVO;
import com.entity.view.DiscusszhaopinzixunView;


/**
 * 招聘资讯评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface DiscusszhaopinzixunDao extends BaseMapper<DiscusszhaopinzixunEntity> {
	
	List<DiscusszhaopinzixunVO> selectListVO(@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);
	
	DiscusszhaopinzixunVO selectVO(@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);
	
	List<DiscusszhaopinzixunView> selectListView(@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);

	List<DiscusszhaopinzixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);
	
	DiscusszhaopinzixunView selectView(@Param("ew") Wrapper<DiscusszhaopinzixunEntity> wrapper);
	
}
