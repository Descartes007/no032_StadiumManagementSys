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
 * 会员退款
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("huiyuantuikuan")
public class HuiyuantuikuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuantuikuanEntity() {
		
	}
	
	public HuiyuantuikuanEntity(T t) {
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
	 * 订单单号
	 */
					
	private String dingdandanhao;
	
	/**
	 * 器材名称
	 */
					
	private String qicaimingcheng;
	
	/**
	 * 器材类型
	 */
					
	private String qicaileixing;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 总价
	 */
					
	private String zongjia;
	
	/**
	 * 购买时间
	 */
					
	private String goumaishijian;
	
	/**
	 * 会员账号
	 */
					
	private String huiyuanzhanghao;
	
	/**
	 * 会员姓名
	 */
					
	private String huiyuanxingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 折扣
	 */
					
	private String zhekou;
	
	/**
	 * 退款原因
	 */
					
	private String tuikuanyuanyin;
	
	/**
	 * 退款时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tuikuanshijian;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：订单单号
	 */
	public void setDingdandanhao(String dingdandanhao) {
		this.dingdandanhao = dingdandanhao;
	}
	/**
	 * 获取：订单单号
	 */
	public String getDingdandanhao() {
		return dingdandanhao;
	}
	/**
	 * 设置：器材名称
	 */
	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng = qicaimingcheng;
	}
	/**
	 * 获取：器材名称
	 */
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}
	/**
	 * 设置：器材类型
	 */
	public void setQicaileixing(String qicaileixing) {
		this.qicaileixing = qicaileixing;
	}
	/**
	 * 获取：器材类型
	 */
	public String getQicaileixing() {
		return qicaileixing;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：总价
	 */
	public void setZongjia(String zongjia) {
		this.zongjia = zongjia;
	}
	/**
	 * 获取：总价
	 */
	public String getZongjia() {
		return zongjia;
	}
	/**
	 * 设置：购买时间
	 */
	public void setGoumaishijian(String goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	/**
	 * 获取：购买时间
	 */
	public String getGoumaishijian() {
		return goumaishijian;
	}
	/**
	 * 设置：会员账号
	 */
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
	/**
	 * 设置：会员姓名
	 */
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：折扣
	 */
	public void setZhekou(String zhekou) {
		this.zhekou = zhekou;
	}
	/**
	 * 获取：折扣
	 */
	public String getZhekou() {
		return zhekou;
	}
	/**
	 * 设置：退款原因
	 */
	public void setTuikuanyuanyin(String tuikuanyuanyin) {
		this.tuikuanyuanyin = tuikuanyuanyin;
	}
	/**
	 * 获取：退款原因
	 */
	public String getTuikuanyuanyin() {
		return tuikuanyuanyin;
	}
	/**
	 * 设置：退款时间
	 */
	public void setTuikuanshijian(Date tuikuanshijian) {
		this.tuikuanshijian = tuikuanshijian;
	}
	/**
	 * 获取：退款时间
	 */
	public Date getTuikuanshijian() {
		return tuikuanshijian;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
