package com.entity.view;

import com.entity.HuiyuantuidingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员退订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("huiyuantuiding")
public class HuiyuantuidingView  extends HuiyuantuidingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuantuidingView(){
	}
 
 	public HuiyuantuidingView(HuiyuantuidingEntity huiyuantuidingEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuantuidingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
