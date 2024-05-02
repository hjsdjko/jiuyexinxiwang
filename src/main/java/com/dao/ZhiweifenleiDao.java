package com.dao;

import com.entity.ZhiweifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiweifenleiVO;
import com.entity.view.ZhiweifenleiView;


/**
 * 职位分类
 * 
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface ZhiweifenleiDao extends BaseMapper<ZhiweifenleiEntity> {
	
	List<ZhiweifenleiVO> selectListVO(@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);
	
	ZhiweifenleiVO selectVO(@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);
	
	List<ZhiweifenleiView> selectListView(@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);

	List<ZhiweifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);
	
	ZhiweifenleiView selectView(@Param("ew") Wrapper<ZhiweifenleiEntity> wrapper);
	
}
