package com.cyf.mall.member.dao;

import com.cyf.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 22:46:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
