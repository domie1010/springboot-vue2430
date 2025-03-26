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


import com.dao.DiscussrementieziDao;
import com.entity.DiscussrementieziEntity;
import com.service.DiscussrementieziService;
import com.entity.vo.DiscussrementieziVO;
import com.entity.view.DiscussrementieziView;

@Service("discussrementieziService")
public class DiscussrementieziServiceImpl extends ServiceImpl<DiscussrementieziDao, DiscussrementieziEntity> implements DiscussrementieziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrementieziEntity> page = this.selectPage(
                new Query<DiscussrementieziEntity>(params).getPage(),
                new EntityWrapper<DiscussrementieziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrementieziEntity> wrapper) {
		  Page<DiscussrementieziView> page =new Query<DiscussrementieziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrementieziVO> selectListVO(Wrapper<DiscussrementieziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrementieziVO selectVO(Wrapper<DiscussrementieziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrementieziView> selectListView(Wrapper<DiscussrementieziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrementieziView selectView(Wrapper<DiscussrementieziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
