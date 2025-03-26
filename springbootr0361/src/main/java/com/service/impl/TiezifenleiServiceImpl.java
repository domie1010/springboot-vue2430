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


import com.dao.TiezifenleiDao;
import com.entity.TiezifenleiEntity;
import com.service.TiezifenleiService;
import com.entity.vo.TiezifenleiVO;
import com.entity.view.TiezifenleiView;

@Service("tiezifenleiService")
public class TiezifenleiServiceImpl extends ServiceImpl<TiezifenleiDao, TiezifenleiEntity> implements TiezifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiezifenleiEntity> page = this.selectPage(
                new Query<TiezifenleiEntity>(params).getPage(),
                new EntityWrapper<TiezifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiezifenleiEntity> wrapper) {
		  Page<TiezifenleiView> page =new Query<TiezifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiezifenleiVO> selectListVO(Wrapper<TiezifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiezifenleiVO selectVO(Wrapper<TiezifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiezifenleiView> selectListView(Wrapper<TiezifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiezifenleiView selectView(Wrapper<TiezifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
