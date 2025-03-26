package com.dao;

import com.entity.GonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaoVO;
import com.entity.view.GonggaoView;


/**
 * 公告
 * 
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface GonggaoDao extends BaseMapper<GonggaoEntity> {
	
	List<GonggaoVO> selectListVO(@Param("ew") Wrapper<GonggaoEntity> wrapper);
	
	GonggaoVO selectVO(@Param("ew") Wrapper<GonggaoEntity> wrapper);
	
	List<GonggaoView> selectListView(@Param("ew") Wrapper<GonggaoEntity> wrapper);

	List<GonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaoEntity> wrapper);
	
	GonggaoView selectView(@Param("ew") Wrapper<GonggaoEntity> wrapper);
	
}
