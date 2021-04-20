package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public interface AddressMapper{
    int deleteByPrimaryKey(Integer addressid);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByUserID(String addressid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    Address getDefaultAddress(String userId);

    Integer setDefaultAddress(@Param("AddressId")Integer AddressId, @Param("UserId")String UserId);

}