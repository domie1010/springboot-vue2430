package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgonggaoView;


/**
 * 公告评论表
 *
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
public interface DiscussgonggaoService extends IService<DiscussgonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgonggaoVO> selectListVO(Wrapper<DiscussgonggaoEntity> wrapper);
   	
   	DiscussgonggaoVO selectVO(@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);
   	
   	List<DiscussgonggaoView> selectListView(Wrapper<DiscussgonggaoEntity> wrapper);
   	
   	DiscussgonggaoView selectView(@Param("ew") Wrapper<DiscussgonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgonggaoEntity> wrapper);
   	
}

