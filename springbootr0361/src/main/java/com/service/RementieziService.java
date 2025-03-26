package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RementieziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RementieziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RementieziView;


/**
 * 热门帖子
 *
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface RementieziService extends IService<RementieziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RementieziVO> selectListVO(Wrapper<RementieziEntity> wrapper);
   	
   	RementieziVO selectVO(@Param("ew") Wrapper<RementieziEntity> wrapper);
   	
   	List<RementieziView> selectListView(Wrapper<RementieziEntity> wrapper);
   	
   	RementieziView selectView(@Param("ew") Wrapper<RementieziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RementieziEntity> wrapper);
   	
}

