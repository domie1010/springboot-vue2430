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


import com.dao.RementieziDao;
import com.entity.RementieziEntity;
import com.service.RementieziService;
import com.entity.vo.RementieziVO;
import com.entity.view.RementieziView;

@Service("rementieziService")
public class RementieziServiceImpl extends ServiceImpl<RementieziDao, RementieziEntity> implements RementieziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RementieziEntity> page = this.selectPage(
                new Query<RementieziEntity>(params).getPage(),
                new EntityWrapper<RementieziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RementieziEntity> wrapper) {
		  Page<RementieziView> page =new Query<RementieziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RementieziVO> selectListVO(Wrapper<RementieziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RementieziVO selectVO(Wrapper<RementieziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RementieziView> selectListView(Wrapper<RementieziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RementieziView selectView(Wrapper<RementieziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
