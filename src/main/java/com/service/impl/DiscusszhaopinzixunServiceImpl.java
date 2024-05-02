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


import com.dao.DiscusszhaopinzixunDao;
import com.entity.DiscusszhaopinzixunEntity;
import com.service.DiscusszhaopinzixunService;
import com.entity.vo.DiscusszhaopinzixunVO;
import com.entity.view.DiscusszhaopinzixunView;

@Service("discusszhaopinzixunService")
public class DiscusszhaopinzixunServiceImpl extends ServiceImpl<DiscusszhaopinzixunDao, DiscusszhaopinzixunEntity> implements DiscusszhaopinzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhaopinzixunEntity> page = this.selectPage(
                new Query<DiscusszhaopinzixunEntity>(params).getPage(),
                new EntityWrapper<DiscusszhaopinzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhaopinzixunEntity> wrapper) {
		  Page<DiscusszhaopinzixunView> page =new Query<DiscusszhaopinzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhaopinzixunVO> selectListVO(Wrapper<DiscusszhaopinzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhaopinzixunVO selectVO(Wrapper<DiscusszhaopinzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhaopinzixunView> selectListView(Wrapper<DiscusszhaopinzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhaopinzixunView selectView(Wrapper<DiscusszhaopinzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
