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


import com.dao.ZhiweifenleiDao;
import com.entity.ZhiweifenleiEntity;
import com.service.ZhiweifenleiService;
import com.entity.vo.ZhiweifenleiVO;
import com.entity.view.ZhiweifenleiView;

@Service("zhiweifenleiService")
public class ZhiweifenleiServiceImpl extends ServiceImpl<ZhiweifenleiDao, ZhiweifenleiEntity> implements ZhiweifenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiweifenleiEntity> page = this.selectPage(
                new Query<ZhiweifenleiEntity>(params).getPage(),
                new EntityWrapper<ZhiweifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiweifenleiEntity> wrapper) {
		  Page<ZhiweifenleiView> page =new Query<ZhiweifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiweifenleiVO> selectListVO(Wrapper<ZhiweifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiweifenleiVO selectVO(Wrapper<ZhiweifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiweifenleiView> selectListView(Wrapper<ZhiweifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiweifenleiView selectView(Wrapper<ZhiweifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
