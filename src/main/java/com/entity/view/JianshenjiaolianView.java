package com.entity.view;

import com.entity.JianshenjiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身教练
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
@TableName("jianshenjiaolian")
public class JianshenjiaolianView  extends JianshenjiaolianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenjiaolianView(){
	}
 
 	public JianshenjiaolianView(JianshenjiaolianEntity jianshenjiaolianEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenjiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
