package com.entity.view;

import com.entity.DiscusssirenjiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 私人教练评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("discusssirenjiaolian")
public class DiscusssirenjiaolianView  extends DiscusssirenjiaolianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssirenjiaolianView(){
	}
 
 	public DiscusssirenjiaolianView(DiscusssirenjiaolianEntity discusssirenjiaolianEntity){
 	try {
			BeanUtils.copyProperties(this, discusssirenjiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
