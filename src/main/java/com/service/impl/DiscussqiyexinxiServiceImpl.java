package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussqiyexinxiDao;
import com.entity.DiscussqiyexinxiEntity;
import com.service.DiscussqiyexinxiService;
import com.entity.vo.DiscussqiyexinxiVO;
import com.entity.view.DiscussqiyexinxiView;

@Service("discussqiyexinxiService")
public class DiscussqiyexinxiServiceImpl extends ServiceImpl<DiscussqiyexinxiDao, DiscussqiyexinxiEntity> implements DiscussqiyexinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiyexinxiEntity> page = this.selectPage(
                new Query<DiscussqiyexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqiyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiyexinxiEntity> wrapper) {
		  Page<DiscussqiyexinxiView> page =new Query<DiscussqiyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiyexinxiVO> selectListVO(Wrapper<DiscussqiyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiyexinxiVO selectVO(Wrapper<DiscussqiyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiyexinxiView> selectListView(Wrapper<DiscussqiyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiyexinxiView selectView(Wrapper<DiscussqiyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
