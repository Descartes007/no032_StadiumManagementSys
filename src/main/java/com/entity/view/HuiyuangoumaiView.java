package com.entity.view;

import com.entity.HuiyuangoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("huiyuangoumai")
public class HuiyuangoumaiView  extends HuiyuangoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuangoumaiView(){
	}
 
 	public HuiyuangoumaiView(HuiyuangoumaiEntity huiyuangoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuangoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
