package com.entity.view;

import com.entity.GonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 21:14:54
 */
@TableName("gonggao")
public class GonggaoView  extends GonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonggaoView(){
	}
 
 	public GonggaoView(GonggaoEntity gonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, gonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
