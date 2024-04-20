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
 * 退订场地
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@TableName("tuidingchangdi")
public class TuidingchangdiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuidingchangdiEntity() {
		
	}
	
	public TuidingchangdiEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 场地名称
	 */
					
	private String changdimingcheng;
	
	/**
	 * 场地类型
	 */
					
	private String changdileixing;
	
	/**
	 * 场地区域
	 */
					
	private String changdiquyu;
	
	/**
	 * 开始时间
	 */
					
	private String kaishishijian;
	
	/**
	 * 时价格
	 */
					
	private Integer shijiage;
	
	/**
	 * 时长
	 */
					
	private Integer shizhang;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 总价
	 */
					
	private Integer zongjia;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 场地详情
	 */
					
	private String changdixiangqing;
	
	/**
	 * 人次
	 */
					
	private Integer renci;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 退订原因
	 */
					
	private String tuidingyuanyin;
	
	/**
	 * 退订时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tuidingshijian;
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：场地名称
	 */
	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng = changdimingcheng;
	}
	/**
	 * 获取：场地名称
	 */
	public String getChangdimingcheng() {
		return changdimingcheng;
	}
	/**
	 * 设置：场地类型
	 */
	public void setChangdileixing(String changdileixing) {
		this.changdileixing = changdileixing;
	}
	/**
	 * 获取：场地类型
	 */
	public String getChangdileixing() {
		return changdileixing;
	}
	/**
	 * 设置：场地区域
	 */
	public void setChangdiquyu(String changdiquyu) {
		this.changdiquyu = changdiquyu;
	}
	/**
	 * 获取：场地区域
	 */
	public String getChangdiquyu() {
		return changdiquyu;
	}
	/**
	 * 设置：开始时间
	 */
	public void setKaishishijian(String kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	/**
	 * 获取：开始时间
	 */
	public String getKaishishijian() {
		return kaishishijian;
	}
	/**
	 * 设置：时价格
	 */
	public void setShijiage(Integer shijiage) {
		this.shijiage = shijiage;
	}
	/**
	 * 获取：时价格
	 */
	public Integer getShijiage() {
		return shijiage;
	}
	/**
	 * 设置：时长
	 */
	public void setShizhang(Integer shizhang) {
		this.shizhang = shizhang;
	}
	/**
	 * 获取：时长
	 */
	public Integer getShizhang() {
		return shizhang;
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
	public void setZongjia(Integer zongjia) {
		this.zongjia = zongjia;
	}
	/**
	 * 获取：总价
	 */
	public Integer getZongjia() {
		return zongjia;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：场地详情
	 */
	public void setChangdixiangqing(String changdixiangqing) {
		this.changdixiangqing = changdixiangqing;
	}
	/**
	 * 获取：场地详情
	 */
	public String getChangdixiangqing() {
		return changdixiangqing;
	}
	/**
	 * 设置：人次
	 */
	public void setRenci(Integer renci) {
		this.renci = renci;
	}
	/**
	 * 获取：人次
	 */
	public Integer getRenci() {
		return renci;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
	 * 设置：退订原因
	 */
	public void setTuidingyuanyin(String tuidingyuanyin) {
		this.tuidingyuanyin = tuidingyuanyin;
	}
	/**
	 * 获取：退订原因
	 */
	public String getTuidingyuanyin() {
		return tuidingyuanyin;
	}
	/**
	 * 设置：退订时间
	 */
	public void setTuidingshijian(Date tuidingshijian) {
		this.tuidingshijian = tuidingshijian;
	}
	/**
	 * 获取：退订时间
	 */
	public Date getTuidingshijian() {
		return tuidingshijian;
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
