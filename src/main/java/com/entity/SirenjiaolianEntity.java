package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 私人教练
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("sirenjiaolian")
public class SirenjiaolianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SirenjiaolianEntity() {
		
	}
	
	public SirenjiaolianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教练工号
	 */
					
	private String jiaoliangonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教练工号
	 */
	public void setJiaoliangonghao(String jiaoliangonghao) {
		this.jiaoliangonghao = jiaoliangonghao;
	}
	/**
	 * 获取：教练工号
	 */
	public String getJiaoliangonghao() {
		return jiaoliangonghao;
	}
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
