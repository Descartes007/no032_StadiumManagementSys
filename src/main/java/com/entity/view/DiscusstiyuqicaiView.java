package com.entity.view;

import com.entity.DiscusstiyuqicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体育器材评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("discusstiyuqicai")
public class DiscusstiyuqicaiView  extends DiscusstiyuqicaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstiyuqicaiView(){
	}
 
 	public DiscusstiyuqicaiView(DiscusstiyuqicaiEntity discusstiyuqicaiEntity){
 	try {
			BeanUtils.copyProperties(this, discusstiyuqicaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
