package com.dao;

import com.entity.XingyelingyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingyelingyuVO;
import com.entity.view.XingyelingyuView;


/**
 * 行业领域
 * 
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface XingyelingyuDao extends BaseMapper<XingyelingyuEntity> {
	
	List<XingyelingyuVO> selectListVO(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
	XingyelingyuVO selectVO(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
	List<XingyelingyuView> selectListView(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);

	List<XingyelingyuView> selectListView(Pagination page,@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
	XingyelingyuView selectView(@Param("ew") Wrapper<XingyelingyuEntity> wrapper);
	
}
