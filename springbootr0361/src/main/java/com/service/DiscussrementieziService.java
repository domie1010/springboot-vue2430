package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrementieziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrementieziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrementieziView;


/**
 * 热门帖子评论表
 *
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface DiscussrementieziService extends IService<DiscussrementieziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrementieziVO> selectListVO(Wrapper<DiscussrementieziEntity> wrapper);
   	
   	DiscussrementieziVO selectVO(@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);
   	
   	List<DiscussrementieziView> selectListView(Wrapper<DiscussrementieziEntity> wrapper);
   	
   	DiscussrementieziView selectView(@Param("ew") Wrapper<DiscussrementieziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrementieziEntity> wrapper);
   	
}

