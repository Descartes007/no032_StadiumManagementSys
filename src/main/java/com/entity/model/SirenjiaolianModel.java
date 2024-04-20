package com.entity.model;

import com.entity.SirenjiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 私人教练
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public class SirenjiaolianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
		
	/**
	 * 主教课程
	 */
	
	private String zhujiaokecheng;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 价格每小时
	 */
	
	private Float jiagemeixiaoshi;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 职业履历
	 */
	
	private String zhiyelvli;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：教练姓名
	 */
	 
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
				
	
	/**
	 * 设置：主教课程
	 */
	 
	public void setZhujiaokecheng(String zhujiaokecheng) {
		this.zhujiaokecheng = zhujiaokecheng;
	}
	
	/**
	 * 获取：主教课程
	 */
	public String getZhujiaokecheng() {
		return zhujiaokecheng;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：价格每小时
	 */
	 
	public void setJiagemeixiaoshi(Float jiagemeixiaoshi) {
		this.jiagemeixiaoshi = jiagemeixiaoshi;
	}
	
	/**
	 * 获取：价格每小时
	 */
	public Float getJiagemeixiaoshi() {
		return jiagemeixiaoshi;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：职业履历
	 */
	 
	public void setZhiyelvli(String zhiyelvli) {
		this.zhiyelvli = zhiyelvli;
	}
	
	/**
	 * 获取：职业履历
	 */
	public String getZhiyelvli() {
		return zhiyelvli;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
