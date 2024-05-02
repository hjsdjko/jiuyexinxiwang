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


import com.dao.ZhaopinzixunDao;
import com.entity.ZhaopinzixunEntity;
import com.service.ZhaopinzixunService;
import com.entity.vo.ZhaopinzixunVO;
import com.entity.view.ZhaopinzixunView;

@Service("zhaopinzixunService")
public class ZhaopinzixunServiceImpl extends ServiceImpl<ZhaopinzixunDao, ZhaopinzixunEntity> implements ZhaopinzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaopinzixunEntity> page = this.selectPage(
                new Query<ZhaopinzixunEntity>(params).getPage(),
                new EntityWrapper<ZhaopinzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaopinzixunEntity> wrapper) {
		  Page<ZhaopinzixunView> page =new Query<ZhaopinzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaopinzixunVO> selectListVO(Wrapper<ZhaopinzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaopinzixunVO selectVO(Wrapper<ZhaopinzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaopinzixunView> selectListView(Wrapper<ZhaopinzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaopinzixunView selectView(Wrapper<ZhaopinzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
