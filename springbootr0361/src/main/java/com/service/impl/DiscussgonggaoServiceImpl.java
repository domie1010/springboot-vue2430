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


import com.dao.DiscussgonggaoDao;
import com.entity.DiscussgonggaoEntity;
import com.service.DiscussgonggaoService;
import com.entity.vo.DiscussgonggaoVO;
import com.entity.view.DiscussgonggaoView;

@Service("discussgonggaoService")
public class DiscussgonggaoServiceImpl extends ServiceImpl<DiscussgonggaoDao, DiscussgonggaoEntity> implements DiscussgonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgonggaoEntity> page = this.selectPage(
                new Query<DiscussgonggaoEntity>(params).getPage(),
                new EntityWrapper<DiscussgonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgonggaoEntity> wrapper) {
		  Page<DiscussgonggaoView> page =new Query<DiscussgonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgonggaoVO> selectListVO(Wrapper<DiscussgonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgonggaoVO selectVO(Wrapper<DiscussgonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgonggaoView> selectListView(Wrapper<DiscussgonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgonggaoView selectView(Wrapper<DiscussgonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
