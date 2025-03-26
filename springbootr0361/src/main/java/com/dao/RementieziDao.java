package com.dao;

import com.entity.RementieziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RementieziVO;
import com.entity.view.RementieziView;


/**
 * 热门帖子
 * 
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface RementieziDao extends BaseMapper<RementieziEntity> {
	
	List<RementieziVO> selectListVO(@Param("ew") Wrapper<RementieziEntity> wrapper);
	
	RementieziVO selectVO(@Param("ew") Wrapper<RementieziEntity> wrapper);
	
	List<RementieziView> selectListView(@Param("ew") Wrapper<RementieziEntity> wrapper);

	List<RementieziView> selectListView(Pagination page,@Param("ew") Wrapper<RementieziEntity> wrapper);
	
	RementieziView selectView(@Param("ew") Wrapper<RementieziEntity> wrapper);
	
}
