package com.entity.view;

import com.entity.DiscussrementieziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门帖子评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
@TableName("discussrementiezi")
public class DiscussrementieziView  extends DiscussrementieziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussrementieziView(){
	}
 
 	public DiscussrementieziView(DiscussrementieziEntity discussrementieziEntity){
 	try {
			BeanUtils.copyProperties(this, discussrementieziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
