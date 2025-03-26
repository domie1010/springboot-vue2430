package com.dao;

import com.entity.GonggaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaoleixingVO;
import com.entity.view.GonggaoleixingView;


/**
 * 公告类型
 * 
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface GonggaoleixingDao extends BaseMapper<GonggaoleixingEntity> {
	
	List<GonggaoleixingVO> selectListVO(@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);
	
	GonggaoleixingVO selectVO(@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);
	
	List<GonggaoleixingView> selectListView(@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);

	List<GonggaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);
	
	GonggaoleixingView selectView(@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);
	
}
