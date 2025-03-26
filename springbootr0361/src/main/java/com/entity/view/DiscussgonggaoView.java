package com.entity.view;

import com.entity.DiscussgonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公告评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
@TableName("discussgonggao")
public class DiscussgonggaoView  extends DiscussgonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgonggaoView(){
	}
 
 	public DiscussgonggaoView(DiscussgonggaoEntity discussgonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussgonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
