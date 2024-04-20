package com.entity.view;

import com.entity.HuiyuanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("huiyuanyuyue")
public class HuiyuanyuyueView  extends HuiyuanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanyuyueView(){
	}
 
 	public HuiyuanyuyueView(HuiyuanyuyueEntity huiyuanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
