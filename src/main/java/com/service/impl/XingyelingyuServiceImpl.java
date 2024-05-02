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


import com.dao.XingyelingyuDao;
import com.entity.XingyelingyuEntity;
import com.service.XingyelingyuService;
import com.entity.vo.XingyelingyuVO;
import com.entity.view.XingyelingyuView;

@Service("xingyelingyuService")
public class XingyelingyuServiceImpl extends ServiceImpl<XingyelingyuDao, XingyelingyuEntity> implements XingyelingyuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingyelingyuEntity> page = this.selectPage(
                new Query<XingyelingyuEntity>(params).getPage(),
                new EntityWrapper<XingyelingyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingyelingyuEntity> wrapper) {
		  Page<XingyelingyuView> page =new Query<XingyelingyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingyelingyuVO> selectListVO(Wrapper<XingyelingyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingyelingyuVO selectVO(Wrapper<XingyelingyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingyelingyuView> selectListView(Wrapper<XingyelingyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingyelingyuView selectView(Wrapper<XingyelingyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
