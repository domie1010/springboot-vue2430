package com.dao;

import com.entity.DiscussrementieziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrementieziVO;
import com.entity.view.DiscussrementieziView;


/**
 * 热门帖子评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface DiscussrementieziDao extends BaseMapper<DiscussrementieziEntity> {
	
	List<DiscussrementieziVO> selectListVO(@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);
	
	DiscussrementieziVO selectVO(@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);
	
	List<DiscussrementieziView> selectListView(@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);

	List<DiscussrementieziView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);
	
	DiscussrementieziView selectView(@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);
	
}
