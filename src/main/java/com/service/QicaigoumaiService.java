package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaigoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaigoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaigoumaiView;


/**
 * 器材购买
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface QicaigoumaiService extends IService<QicaigoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaigoumaiVO> selectListVO(Wrapper<QicaigoumaiEntity> wrapper);
   	
   	QicaigoumaiVO selectVO(@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);
   	
   	List<QicaigoumaiView> selectListView(Wrapper<QicaigoumaiEntity> wrapper);
   	
   	QicaigoumaiView selectView(@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaigoumaiEntity> wrapper);
   	

}

