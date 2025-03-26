package com.dao;

import com.entity.DiscussgonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgonggaoVO;
import com.entity.view.DiscussgonggaoView;


/**
 * 公告评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface DiscussgonggaoDao extends BaseMapper<DiscussgonggaoEntity> {
	
	List<DiscussgonggaoVO> selectListVO(@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);
	
	DiscussgonggaoVO selectVO(@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);
	
	List<DiscussgonggaoView> selectListView(@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);

	List<DiscussgonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);
	
	DiscussgonggaoView selectView(@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);
	
}
