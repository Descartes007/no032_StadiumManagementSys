package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuandengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuandengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuandengjiView;


/**
 * 会员等级
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuandengjiService extends IService<HuiyuandengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuandengjiVO> selectListVO(Wrapper<HuiyuandengjiEntity> wrapper);
   	
   	HuiyuandengjiVO selectVO(@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);
   	
   	List<HuiyuandengjiView> selectListView(Wrapper<HuiyuandengjiEntity> wrapper);
   	
   	HuiyuandengjiView selectView(@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuandengjiEntity> wrapper);
   	

}

