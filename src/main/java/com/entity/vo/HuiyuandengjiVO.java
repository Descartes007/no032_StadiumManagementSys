package com.entity.vo;

import com.entity.HuiyuandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员等级
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public class HuiyuandengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 折扣
	 */
	
	private Float zhekou;
				
	
	/**
	 * 设置：折扣
	 */
	 
	public void setZhekou(Float zhekou) {
		this.zhekou = zhekou;
	}
	
	/**
	 * 获取：折扣
	 */
	public Float getZhekou() {
		return zhekou;
	}
			
}
