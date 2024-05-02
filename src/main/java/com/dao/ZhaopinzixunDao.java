package com.dao;

import com.entity.ZhaopinzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaopinzixunVO;
import com.entity.view.ZhaopinzixunView;


/**
 * 招聘资讯
 * 
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface ZhaopinzixunDao extends BaseMapper<ZhaopinzixunEntity> {
	
	List<ZhaopinzixunVO> selectListVO(@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);
	
	ZhaopinzixunVO selectVO(@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);
	
	List<ZhaopinzixunView> selectListView(@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);

	List<ZhaopinzixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);
	
	ZhaopinzixunView selectView(@Param("ew") Wrapper<ZhaopinzixunEntity> wrapper);
	
}
